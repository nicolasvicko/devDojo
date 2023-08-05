package dev.vicko.maratonajava.javacore.Kenum.test;

import dev.vicko.maratonajava.javacore.Kenum.domain.Cliente;
import dev.vicko.maratonajava.javacore.Kenum.domain.TipoCliente;
import dev.vicko.maratonajava.javacore.Kenum.domain.TipoPagamento;

import static dev.vicko.maratonajava.javacore.Kenum.domain.TipoPagamento.CREDITO;
import static dev.vicko.maratonajava.javacore.Kenum.domain.TipoPagamento.DEBITO;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(DEBITO.calcularDesconto(100));
        System.out.println(CREDITO.calcularDesconto(100));


    }
}