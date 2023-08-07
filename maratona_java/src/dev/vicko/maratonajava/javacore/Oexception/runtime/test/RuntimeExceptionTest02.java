package dev.vicko.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código Finalizado");

    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b) throws IllegalArgumentException {

        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }

}
