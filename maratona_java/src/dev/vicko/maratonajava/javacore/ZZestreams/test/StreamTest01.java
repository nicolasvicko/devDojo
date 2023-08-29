package dev.vicko.maratonajava.javacore.ZZestreams.test;

import dev.vicko.maratonajava.javacore.ZZestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
1. Ordenar as LightNovel por title
2. retorne os 3 LightNovel que sejam menores que 4.
 */
public class StreamTest01 {
	 private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
				new LightNovel("Tensei Shitarra", 8.99),
				new LightNovel("Overlord", 3.99),
				new LightNovel("Violet Evergarden", 5.99),
				new LightNovel("No Game no life", 2.99),
				new LightNovel("FullMetal Alchemist", 5.99),
				new LightNovel("Kumo desuga", 1.99),
				new LightNovel("Monotogatari", 4.00))
	 );

	 public static void main (String[] args) {
		  lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
		  System.out.println(lightNovels);

		  List<String> titles = new ArrayList<>();
		  for (LightNovel lightNovel : lightNovels) {
				if (lightNovel.getPrice() <= 4) {
					 titles.add(lightNovel.getTitle());

				}
				if (titles.size()>=3){
					 break;
				}
		  }
		  System.out.println(titles);

	 }
}
