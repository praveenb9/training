package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieCatalog;
import com.capg.demo.movie.service.MovieCatalogService;

@RestController
public class MovieCatalogController {

	@Autowired
	MovieCatalogService service;
	
	@GetMapping("/catalog/id/{id}")
	public MovieCatalog getMovieInfo(@PathVariable int id)
	{
		return service.getCatalog(id);
	}
	
	@PostMapping("/catalog/add")
	public MovieCatalog addMovieCatalog(@RequestBody MovieCatalog catalog)
	{
		return service.addCatalog(catalog);
	}
}
