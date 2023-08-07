package dev.vicko.maratonajava.javacore.Npolimorfismo.services;

import dev.vicko.maratonajava.javacore.Npolimorfismo.domain.Computador;
import dev.vicko.maratonajava.javacore.Npolimorfismo.domain.Produto;
import dev.vicko.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Preço: " +produto.getValor());
        System.out.println("Imposto a ser pago: " +imposto);

    }
}
