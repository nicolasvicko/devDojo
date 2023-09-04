package maratonajava.javacore.ZZestreams.test;

import maratonajava.javacore.ZZestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
	 private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
				new LightNovel("Tensei Shitarra", 8.99),
				new LightNovel("Overlord", 3.99),
				new LightNovel("Violet Evergarden", 5.99),
				new LightNovel("No Game no life", 2.99),
				new LightNovel("FullMetal Alchemist", 5.99),
				new LightNovel("Kumo desuga", 1.99),
				new LightNovel("Monotogatari", 4.00)
	 ));

	 public static void main (String[] args) {

		  List<String> titles = lightNovels.stream()
					 .sorted(Comparator.comparing(LightNovel::getTitle))
					 .filter(lightNovel -> lightNovel.getPrice() <= 4)
					 .limit(3)
					 .map(LightNovel::getTitle)
					 .collect(Collectors.toList());

		  System.out.println(titles);


	 }
}
