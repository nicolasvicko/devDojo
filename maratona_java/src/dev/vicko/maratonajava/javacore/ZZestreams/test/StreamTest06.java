package dev.vicko.maratonajava.javacore.ZZestreams.test;

import dev.vicko.maratonajava.javacore.ZZestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
	 private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
				new LightNovel("Tensei Shitarra", 8.99),
				new LightNovel("Overlord", 3.99),
				new LightNovel("Violet Evergarden", 5.99),
				new LightNovel("No Game no life", 2.99),
				new LightNovel("FullMetal Alchemist", 5.99),
				new LightNovel("Kumo desuga", 1.99),
				new LightNovel("Kumo desuga", 1.99),
				new LightNovel("Monotogatari", 4.00)
	 ));

	 public static void main (String[] args) {
		  System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
		  System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
		  System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0));
		  lightNovels.stream()
					 .filter(lightNovel -> lightNovel.getPrice() > 3)
					 .findAny()
					 .ifPresent(System.out::println);
		  lightNovels
					 .stream()
					 .filter(lightNovel -> lightNovel.getPrice() > 3)
					 .sorted(Comparator.comparing(LightNovel::getPrice))
					 .findFirst()
					 .ifPresent(System.out::println);

		  lightNovels
					 .stream()
					 .filter(lightNovel -> lightNovel.getPrice() > 3)
					 .max(Comparator.comparing(LightNovel::getPrice))
					 .ifPresent(System.out::println);

	 }
}
