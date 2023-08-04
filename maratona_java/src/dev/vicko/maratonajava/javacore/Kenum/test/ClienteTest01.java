package dev.vicko.maratonajava.javacore.Kenum.test;

import dev.vicko.maratonajava.javacore.Kenum.domain.Cliente;
import dev.vicko.maratonajava.javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
	 public static void main (String[] args) {
		  Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
		  Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
		  Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
		  Cliente cliente4 = new Cliente("Tsubasa", TipoCliente.PESSOAJURIDICA);

		  System.out.println(cliente1);
		  System.out.println(cliente2);
		  System.out.println(cliente3);
		  System.out.println(cliente4);
	 }
}
