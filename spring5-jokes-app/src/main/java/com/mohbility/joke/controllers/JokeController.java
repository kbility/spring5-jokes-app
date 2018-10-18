package com.mohbility.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mohbility.joke.services.JokeService;

/**
 * @author kbility
 * Date Oct 18, 2018
 */

@Controller
public class JokeController {
	@Autowired
	private JokeService jokeService;

	/**
	 * @param jokeService
	 */
	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model){
		
		model.addAttribute("joke", jokeService.getJoke());
		
		return "chucknorris";
		
	}
}
