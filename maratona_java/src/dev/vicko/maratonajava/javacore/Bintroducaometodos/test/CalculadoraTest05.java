package dev.vicko.maratonajava.javacore.Bintroducaometodos.test;

import dev.vicko.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        System.out.println("#####################");
        calculadora.somaVarArgs(1, 2, 3, 4, 6, 5, 7, 98, 11, 580, 78, 61, 87, 1);
    }
}
