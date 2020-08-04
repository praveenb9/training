package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.movie.model.MovieCatalog;
import com.capg.demo.movie.model.MovieInfo;
import com.capg.demo.movie.model.MovieRating;
import com.capg.demo.movie.service.MovieInfoService;

@RestController
public class MovieInfoController {

	@Autowired
	MovieInfoService service;
	
	@GetMapping("/getMovieInfo/id/{id}")
	public MovieInfo getMovieInfo(@PathVariable int id)
	{
	return	service.getMovieInfo(id);

	}
	@PostMapping("/addMovie")
	public MovieInfo addMovieInfo(@RequestBody MovieInfo movie)
	{
		
		return service.addMovieInfo(movie);
	}
}
