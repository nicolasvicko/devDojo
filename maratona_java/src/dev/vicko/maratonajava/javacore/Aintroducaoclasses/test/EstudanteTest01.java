package dev.vicko.maratonajava.javacore.Aintroducaoclasses.test;

import dev.vicko.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "Nicolas o mais gostoso desse mundo";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }

}
