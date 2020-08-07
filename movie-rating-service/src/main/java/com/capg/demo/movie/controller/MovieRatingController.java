package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieRating;
import com.capg.demo.movie.service.MovieRatingService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MovieRatingController {

	@Autowired
	MovieRatingService service;
	
	@GetMapping("/rating/id/{id}")
	//@Transactional(timeout = 120)
	//@HystrixCommand(fallbackMethod = "getRatingFallBack")
	public MovieRating getRating(@PathVariable int id) //throws InterruptedException
	{
		//Thread.sleep(5000);
		return service.getRating(id);
	}
	@PostMapping("/rating/add")
	public MovieRating addRating(@RequestBody MovieRating rating)
	{
		return service.addRating(rating);
	}
	
	public MovieRating getRatingFallBack(@PathVariable int id)
	{
		return new MovieRating(id, 9.9);
	}
}
