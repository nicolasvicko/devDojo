package dev.vicko.maratonajava.javacore.ZZestreams.test;

import dev.vicko.maratonajava.javacore.ZZestreams.domain.Category;
import dev.vicko.maratonajava.javacore.ZZestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
/*		  Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
		  List<LightNovel> fantasy = new ArrayList<>();
		  List<LightNovel> drama = new ArrayList<>();
		  List<LightNovel> romance = new ArrayList<>();

		  for (LightNovel lightNovel : lightNovels){
				switch ( lightNovel.getCategory()){
					 case DRAMA -> drama.add(lightNovel);
					 case FANTASY -> fantasy.add(lightNovel);
					 case ROMANCE -> romance.add(lightNovel);


				}
		  }
		  categoryLightNovelMap.put(Category.DRAMA, drama);
		  categoryLightNovelMap.put(Category.FANTASY, fantasy);
		  categoryLightNovelMap.put(Category.ROMANCE, romance);
		  System.out.println(categoryLightNovelMap);*/


		  Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
		  System.out.println(collect);


	 }

}
