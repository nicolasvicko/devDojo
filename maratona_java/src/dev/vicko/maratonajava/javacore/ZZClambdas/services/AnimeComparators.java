package dev.vicko.maratonajava.javacore.ZZClambdas.services;

import dev.vicko.maratonajava.javacore.ZZClambdas.domain.Anime;

public class AnimeComparators {
	 public static int compareByTitle (Anime a1, Anime a2){
		  return a1.getTitle().compareTo(a2.getTitle());
	 }

	 public static int compareByEpisodes (Anime a1, Anime a2){
		  return Integer.compare(a1.getEpisodes(), a2.getEpisodes());

	 }
}
