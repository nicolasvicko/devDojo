package dev.vicko.maratonajava.javacore.Fmodificadorestatico.domain;

public class Animes {

    /*  Etapas de criação de um objeto:
        0 - Bloco de inicialização é excutado quando o JVM carregar a classe;
        1 - Alocado espaço em memória;
        2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
        3 - Bloco de inicialização é executado;
        4 - Construtor é executado.

     */
    //Blocos de inicialização se coloca no começo depois dos atributos e antes dos construtores.
    private String name;
    private static int[] episodios;

    // executado apenas 1 vez.
    // inicio do bloco de inicialização
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    // fim do bloco de inicialização.

    public Animes (String name) {
        this.name = name;
    }

    public Animes () {
        for (int episodio : Animes.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
