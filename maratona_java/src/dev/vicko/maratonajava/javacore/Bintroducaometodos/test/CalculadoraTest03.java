package dev.vicko.maratonajava.javacore.Bintroducaometodos.test;

import dev.vicko.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(100, 4));
        System.out.println(calculadora.divideDoisNumeros(100, 0));
        System.out.println(calculadora.divideDoisNumeros(0, 10));

    }


}
