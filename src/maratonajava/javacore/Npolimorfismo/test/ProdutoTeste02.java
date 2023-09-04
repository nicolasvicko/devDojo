package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computador;
import maratonajava.javacore.Npolimorfismo.domain.Produto;
import maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto computadorRyzen = new Computador("Ryzen 9", 3000);
        System.out.println(computadorRyzen.getNome());
        System.out.println(computadorRyzen.getValor());
        System.out.println(computadorRyzen.calcularImposto());
        System.out.println("----------------");

        Produto tomateCereja = new Tomate("Cereja", 5);
        System.out.println(tomateCereja.getNome());
        System.out.println(tomateCereja.getValor());
        System.out.println(tomateCereja.calcularImposto());
        System.out.println("Data de Validade");
        System.out.println("----------------");






    }
}
