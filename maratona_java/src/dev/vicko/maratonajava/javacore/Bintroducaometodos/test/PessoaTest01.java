package dev.vicko.maratonajava.javacore.Bintroducaometodos.test;

import dev.vicko.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        pessoa.imprime();
    }
}
