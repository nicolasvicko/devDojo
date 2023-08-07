package dev.vicko.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
