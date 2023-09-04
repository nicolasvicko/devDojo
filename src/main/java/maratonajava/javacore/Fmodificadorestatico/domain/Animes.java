package maratonajava.javacore.Fmodificadorestatico.domain;

public class Animes {

    /*  Etapas de criação de um objeto:
        0 - Bloco de inicialização estático da super classe é excutado quando o JVM carregar a classe filha;
        1 - Bloco de inicialização estático da sub classe é executado;
        2 - Alocado espaço em memória pro objeto da classe pai
        3 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe pai;
        4 - Bloco de inicialização da superClasse (pai) é executado na ordem em que aparece;
        5 - Construtor da superClasse é executado.
        6 - Alocado espaço em memória pro objeto da subClasse
        7 - Cada atributo de subClasse é criado e inicializado com valores default ou o que for passado da subClasse;
        8 - Bloco de inicialização da subClasse é executado na ordem em que aparece;
        9 - Construtor da subClasse é executado.
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
