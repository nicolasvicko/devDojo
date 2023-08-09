package dev.vicko.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; //String constant pool
        String nome2 = "William";
        String nomeConcat = "William";
        nomeConcat = nomeConcat.concat(" Suane"); //nome +="Suane"
        System.out.println(nomeConcat);
        System.out.println(nome == nome2); // é pra comparar referências, e não o valor em si do objeto

        String nome3 = new String("William"); //1 criando uma variável de referência, 2 objeto do tipo string, 3 uma string no pool de strings.
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
