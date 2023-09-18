package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

public class MovieMain {

	public static void main(String[] args) {
		List<Movie> movie = new ArrayList<>();
		movie.add(new Movie("ÆÞÇÁ ÇÈ¼Ç",1996));
		movie.add(new Movie("Å³ ºô1", 1994));
		movie.add(new Movie("Å³ ºô2", 1995));
		
		Collections.short(movie);
		for(Movie mv : movie) {
			System.out.println(mv);
		}

	}

}
