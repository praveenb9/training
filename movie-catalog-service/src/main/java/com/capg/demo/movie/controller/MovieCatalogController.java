package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieCatalog;
import com.capg.demo.movie.service.MovieCatalogService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class MovieCatalogController {

	@Autowired
	MovieCatalogService service;
	
	@GetMapping("/catalog/id/{id}")
	//@Transactional(timeout = 120)
   // @HystrixCommand(fallbackMethod = "getMovieInfoFallBack")
	public MovieCatalog getMovieInfo(@PathVariable int id) //throws InterruptedException 
	{
		//Thread.sleep(5000);
		return service.getCatalog(id);
	}
	
	@PostMapping("/catalog/add")
	public MovieCatalog addMovieCatalog(@RequestBody MovieCatalog catalog)
	{
		return service.addCatalog(catalog);
	}
	
	public MovieCatalog getMovieInfoFallBack(@PathVariable int id)
	{
		return new MovieCatalog(id, "surya");
	}
	
}
