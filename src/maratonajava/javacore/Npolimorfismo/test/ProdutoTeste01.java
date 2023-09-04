package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computador;
import maratonajava.javacore.Npolimorfismo.domain.Televisao;
import maratonajava.javacore.Npolimorfismo.domain.Tomate;

import static maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto.*;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC110i7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        Televisao tv = new Televisao("Samsung 50\" " , 2900);
        calcularImposto(computador);
        System.out.println("_________________________________");
        calcularImposto(tomate);
        System.out.println("_________________________________");
        calcularImposto(tv);


    }
}
