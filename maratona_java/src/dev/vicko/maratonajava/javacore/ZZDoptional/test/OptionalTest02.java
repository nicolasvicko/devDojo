package dev.vicko.maratonajava.javacore.ZZDoptional.test;

import dev.vicko.maratonajava.javacore.ZZDoptional.Domain.Manga;
import dev.vicko.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
	 public static void main (String[] args) {
		  Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
		  mangaByTitle.ifPresent(manga -> manga.setTitle("Bokudo"));
		  System.out.println(mangaByTitle);

		  Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
		  System.out.println(mangaById);

		  Manga newManga = MangaRepository.findByTitle("Drifters")
					 .orElseGet(() -> new Manga(3, "Drifters", 20));
		  System.out.println(newManga);

	 }

	 
}
