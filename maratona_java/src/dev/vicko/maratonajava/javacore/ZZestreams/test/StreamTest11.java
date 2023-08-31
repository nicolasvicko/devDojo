package dev.vicko.maratonajava.javacore.ZZestreams.test;

import dev.vicko.maratonajava.javacore.ZZestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
		  System.out.println(lightNovels.stream().count());
		  System.out.println(lightNovels.stream().collect(Collectors.counting()));

		  lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
		  lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

		  System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
		  System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

		  System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).average());
		  System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

		  DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
		  System.out.println(collect);

		  String title = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
		  System.out.println(title);


	 }
}
