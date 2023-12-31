package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computador;
import maratonajava.javacore.Npolimorfismo.domain.Produto;
import maratonajava.javacore.Npolimorfismo.domain.Tomate;
import maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto computadorRyzen = new Computador("Ryzen 9", 3000);
        Produto tomateCereja = new Tomate("Americano", 20);
        Tomate tomateCereja2 = new Tomate("Americano", 20);
        tomateCereja2.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomateCereja2);
        CalculadoraImposto.calcularImposto(computadorRyzen);

    }
}
