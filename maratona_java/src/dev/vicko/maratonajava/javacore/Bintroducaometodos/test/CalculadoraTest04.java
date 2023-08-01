package dev.vicko.maratonajava.javacore.Bintroducaometodos.test;

import dev.vicko.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int num1 = 1 ;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);


        System.out.println(calculadora.divideDoisNumeros(num1, num2));
        System.out.println(calculadora.multiplicaDoisNumeros(num1, num2));
        System.out.println(calculadora.subtraiDoisNumeros(num1, num2));
        System.out.println(calculadora.somaDoisNumeros(num1, num2));

    }
}
