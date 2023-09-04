package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.domain.Anime;
import maratonajava.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
	 public static void main (String[] args) {
		  List<Anime> animeList = new ArrayList<>();
		  animeList.add(new Anime("Berserk", 43));
		  animeList.add(new Anime("One Piece", 100));
		  animeList.add(new Anime("Naruto", 500));

		  animeList.sort(Comparator.comparing(Anime::getTitle));
		  System.out.println(animeList);
		  animeList.sort(AnimeComparators::compareByTitle);
		  System.out.println(animeList);
		  animeList.sort( AnimeComparators::compareByEpisodes);
		  System.out.println(animeList);
	 }
}
