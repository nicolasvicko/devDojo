package maratonajava.javacore.Eblocosinicializacao.test;

import maratonajava.javacore.Eblocosinicializacao.domain.Animes;

public class AnimesTest {
    public static void main(String[] args) {
        Animes animes = new Animes("one piece");
        for (int episodio : animes.getEpisodios()) {
            System.out.println("Número do episódio é: " + episodio);
        }


    }
}
