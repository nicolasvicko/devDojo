package dev.vicko.maratonajava.javacore.Dconstrutores.test;

import dev.vicko.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {

        Anime anime = new Anime("Akudama Drive", "TV", 13, "Ação");
        Anime anime1 = new Anime();
        anime.imprime();
        anime1.imprime();

    }
}
