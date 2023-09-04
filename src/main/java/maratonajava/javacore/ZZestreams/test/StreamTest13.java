package maratonajava.javacore.ZZestreams.test;

import maratonajava.javacore.ZZestreams.domain.Category;
import maratonajava.javacore.ZZestreams.domain.LightNovel;
import maratonajava.javacore.ZZestreams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
		  Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
					 .collect(Collectors.groupingBy(StreamTest13::getPromotion
					 ));
		  System.out.println(collect);
		  ///Map<Category, Map<Promotion, List<lightNovel>>>

		  Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
					 .collect(Collectors
								.groupingBy(LightNovel::getCategory,
										  Collectors.groupingBy(StreamTest13::getPromotion)));
		  System.out.println(collect1);


	 }

	 private static Promotion getPromotion (LightNovel ln) {
		  return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
	 }

}
