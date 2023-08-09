package dev.vicko.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; //String constant pool
        String nome2 = "William";
        nome.concat("Suane");
        System.out.println(nome == nome2);

        String nome3 = new String("William"); // criando uma variável de referência, objeto do tipo string, 3 uma string no pool de strings.
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
