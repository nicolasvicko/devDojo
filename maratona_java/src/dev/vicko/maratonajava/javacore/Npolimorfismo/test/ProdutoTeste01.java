package dev.vicko.maratonajava.javacore.Npolimorfismo.test;

import dev.vicko.maratonajava.javacore.Npolimorfismo.domain.Computador;
import dev.vicko.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import dev.vicko.maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC110i7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("_________________________________");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
