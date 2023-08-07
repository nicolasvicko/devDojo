package dev.vicko.maratonajava.javacore.Npolimorfismo.test;

import dev.vicko.maratonajava.javacore.Npolimorfismo.domain.Computador;
import dev.vicko.maratonajava.javacore.Npolimorfismo.domain.Tomate;

import static dev.vicko.maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto.calcularImpostoComputador;
import static dev.vicko.maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto.calcularImpostoTomate;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC110i7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        calcularImpostoComputador(computador);
        System.out.println("_________________________________");
        calcularImpostoTomate(tomate);
    }
}
