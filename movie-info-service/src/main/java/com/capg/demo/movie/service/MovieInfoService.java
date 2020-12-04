package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.movie.model.MovieCatalog;
import com.capg.demo.movie.model.MovieInfo;
import com.capg.demo.movie.model.MovieRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MovieInfoService {
	@Autowired
	RestTemplate rt;

//	@Value("${rating-get-uri}")
//	private String ratingGetUri;
//	
//	@Value("${catalog-get-uri}")
//	private String catalogGetUri;
//
//	public String getRatingGetUri() {
//		return ratingGetUri;
//	}
//
//	public void setRatingGetUri(String ratingGetUri) {
//		this.ratingGetUri = ratingGetUri;
//	}
//
//	public String getCatalogGetUri() {
//		return catalogGetUri;
//	}
//
//	public void setCatalogGetUri(String catalogGetUri) {
//		this.catalogGetUri = catalogGetUri;
//	}

	@HystrixCommand(fallbackMethod = "getMovieInfoCatalogFallBack" )
	public MovieInfo getMovieInfoCatalog(int id)
	{
		MovieInfo movieInfo = new MovieInfo();

		MovieCatalog catalog=rt.getForObject("http://MOVIE-CATALOG-SERVICE/catalog/id/"+id, MovieCatalog.class);
		//MovieCatalog catalog=rt.getForObject("http://MOVIE-CATALOG-SERVICE/"+catalogGetUri+id, MovieCatalog.class);

		movieInfo.setId(id);
		movieInfo.setMovieName(catalog.getMovieName());
		movieInfo.setMovieCatalogPort(catalog.getPort());
		return movieInfo;
	}
	
	@HystrixCommand(fallbackMethod = "getMovieInfoRatingFallBack" )
	public MovieInfo getMovieInfoRating(int id)
	{
		MovieInfo movieInfo = new MovieInfo();

		MovieRating rating=rt.getForObject("http://MOVIE-RATING-SERVICE/rating/id/"+id, MovieRating.class);
		//MovieRating rating=rt.getForObject("http://MOVIE-RATING-SERVICE/"+ratingGetUri+id, MovieRating.class);

		movieInfo.setId(id);
		movieInfo.setRating(rating.getRating());
		movieInfo.setMovieRatingPort(rating.getPort());
		return movieInfo;

	}
	
	public MovieInfo addMovieInfo( MovieInfo movie)
	{
		MovieRating rating=new MovieRating(movie.getId(), movie.getRating());
		MovieCatalog catalog=new MovieCatalog(movie.getId(), movie.getMovieName());
		
		rating=rt.postForObject("http://MOVIE-RATING-SERVICE/rating/add", rating, MovieRating.class);
		catalog=rt.postForObject("http://MOVIE-CATALOG-SERVICE/catalog/add", catalog, MovieCatalog.class);
		
	movie =new MovieInfo(catalog.getId(), catalog.getMovieName(), rating.getRating());
		return movie;
	}
	
	public MovieInfo getMovieInfoCatalogFallBack(@PathVariable int id)
	{
	return	new MovieInfo(id, "catalogNotWorking", 5.0);

	}
	
	public MovieInfo getMovieInfoRatingFallBack(@PathVariable int id)
	{
	return	new MovieInfo(id, "RatingNotWorking", 9.0);

	}
}
