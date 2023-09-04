package maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
	 public static void main (String[] args) {
		  List<String> strings = List.of("William", "suane", "Luffy", "Zoro");
		  List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		  forEach(strings, (String s) -> System.out.println(s));

		  forEach(integers, (Integer i) ->  System.out.println(i));
	 }

	 private static <T> void forEach (List<T> list, Consumer<T> consumer) {
		  for (T e : list) {
				consumer.accept(e);
 		  }


	 }
}
