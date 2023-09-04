package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.domain.Endereco;
import maratonajava.javacore.Hheranca.domain.Funcionario;
import maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
	 public static void main (String[] args) {
		  Endereco endereco = new Endereco();
		  endereco.setRua("Rua 3");
		  endereco.setCep("27910-110");

		  Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
		  pessoa.setCpf("1111111");
		  pessoa.setEndereco(endereco);

		  pessoa.imprime();

		  Funcionario funcionario = new Funcionario("Oda Nobunaga");
		  funcionario.setCpf("2222222");
		  funcionario.setEndereco(endereco);
		  funcionario.setSalario(20000);

		  funcionario.imprime();


	 }
}
