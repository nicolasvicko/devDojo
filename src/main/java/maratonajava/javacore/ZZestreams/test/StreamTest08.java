package maratonajava.javacore.ZZestreams.test;

import maratonajava.javacore.ZZestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
	 private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
				new LightNovel("Tensei Shitarra", 8.99),
				new LightNovel("Overlord", 10.99),
				new LightNovel("Violet Evergarden", 5.99),
				new LightNovel("No Game no life", 2.99),
				new LightNovel("FullMetal Alchemist", 5.99),
				new LightNovel("Kumo desuga", 1.99),
				new LightNovel("Kumo desuga", 1.99),
				new LightNovel("Monotogatari", 4.00)
	 ));

	 public static void main (String[] args) {

		  lightNovels.stream()
					 .map(LightNovel::getPrice)
					 .filter(price -> price > 3)
					 .reduce(Double::sum)
					 .ifPresent(System.out::println);

		  double sum = lightNovels.stream()
					 .mapToDouble(LightNovel::getPrice)
					 .filter(price -> price > 3)
					 .sum();



	 }
}
