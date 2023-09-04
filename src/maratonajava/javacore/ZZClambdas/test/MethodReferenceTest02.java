package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.domain.Anime;
import maratonajava.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
	 public static void main (String[] args) {
		  AnimeComparators animeComparators = new AnimeComparators();

		  List<Anime> animeList = new ArrayList<>();
		  animeList.add(new Anime("Berserk", 43));
		  animeList.add(new Anime("One Piece", 100));
		  animeList.add(new Anime("Naruto", 500));

		  animeList.sort(animeComparators::compareByEpisodesNonStatic);

	 }

}
