package com.mohbility.joke.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author kbility
 * Date Oct 18, 2018
 */

@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
		
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}


	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
