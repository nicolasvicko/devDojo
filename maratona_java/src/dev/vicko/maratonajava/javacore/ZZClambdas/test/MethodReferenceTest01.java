package dev.vicko.maratonajava.javacore.ZZClambdas.test;

import dev.vicko.maratonajava.javacore.ZZClambdas.domain.Anime;
import dev.vicko.maratonajava.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
	 public static void main (String[] args) {
		  List<Anime> animeList = new ArrayList<>();
		  animeList.add(new Anime("Berserk", 43));
		  animeList.add(new Anime("One Piece", 100));
		  animeList.add(new Anime("Naruto", 500));

		  animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
		  System.out.println(animeList);
		  animeList.sort(AnimeComparators::compareByTitle);
		  System.out.println(animeList);
		  animeList.sort( AnimeComparators::compareByEpisodes);
		  System.out.println(animeList);
	 }
}
