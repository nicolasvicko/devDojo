package dev.vicko.maratonajava.javacore.ZZestreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
	 public static void main (String[] args) {
		  List<String> words = List.of("Gomu", "Gomu", "No", "mi");
		  String[] letters = words.get(0).split("");
		  System.out.println(Arrays.toString(letters));

		  List<String[]> letters2 = words.stream().map(w-> w.split("") ).collect(Collectors.toList());
		  words.stream()
					 .map(w -> w.split("")) //Stream<String[]>
					 .flatMap(Arrays::stream)//Stream<Strings>
					 .collect(Collectors.toList());
		  System.out.println(letters2);


	 }
}
