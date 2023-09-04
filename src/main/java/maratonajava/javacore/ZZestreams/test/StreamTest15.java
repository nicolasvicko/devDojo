package maratonajava.javacore.ZZestreams.test;

import maratonajava.javacore.ZZestreams.domain.Category;
import maratonajava.javacore.ZZestreams.domain.LightNovel;
import maratonajava.javacore.ZZestreams.domain.Promotion;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
		  Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
					 .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
		  System.out.println(collect);

		  Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
					 .collect(groupingBy(LightNovel::getCategory,
					 mapping(StreamTest15::getPromotion, toSet())));

		  System.out.println(collect1);

		  Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
					 .collect(groupingBy(LightNovel::getCategory,
								mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
		  System.out.println(collect2);

	 }


	 private static Promotion getPromotion (LightNovel ln) {
		  return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
	 }

}
