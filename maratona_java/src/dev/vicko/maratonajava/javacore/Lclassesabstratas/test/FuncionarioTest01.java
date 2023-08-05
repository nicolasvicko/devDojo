package dev.vicko.maratonajava.javacore.Lclassesabstratas.test;

import dev.vicko.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import dev.vicko.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Nicolas", 8000);
        System.out.println(desenvolvedor);
    }
}
