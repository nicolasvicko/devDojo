package dev.vicko.maratonajava.javacore.Csobrecargametodos.test;

import dev.vicko.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.init("Akudama Drive 2", "TV", 12);

        anime.imprime();

    }
}
