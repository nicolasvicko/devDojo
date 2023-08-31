package dev.vicko.maratonajava.javacore.ZZestreams.test;

import dev.vicko.maratonajava.javacore.ZZestreams.domain.Category;
import dev.vicko.maratonajava.javacore.ZZestreams.domain.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
	 private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
				new LightNovel("Tensei Shitarra", 8.99, Category.FANTASY),
				new LightNovel("Overlord", 10.99, Category.FANTASY),
				new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
				new LightNovel("No Game no life", 2.99, Category.FANTASY),
				new LightNovel("FullMetal Alchemist", 5.99, Category.FANTASY),
				new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
				new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
				new LightNovel("Monotogatari", 4.00, Category.ROMANCE)
	 ));

	 public static void main (String[] args) {
		  Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
		  System.out.println(collect);

		  Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
					 .collect(Collectors.groupingBy(LightNovel::getCategory,
								Collectors.maxBy(
										  Comparator.comparing(LightNovel::getPrice))));
		  System.out.println(collect1);

		  Map<Category, LightNovel> collect2 = lightNovels.stream()
					 .collect(Collectors.groupingBy(LightNovel::getCategory,
								Collectors.collectingAndThen(
										  Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
		  System.out.println(collect2);


		  Map<Category, LightNovel> collect3 = lightNovels.stream()
					 .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
		  System.out.println(collect3);
	 }

}
