package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest04 {
	 public static void main (String[] args) {
		 /*
		 \d = Todos os digitos
		   \D = Tudo o que não for dígito
		   \s = Todos os espaços em branco \t \n \f \r
		   \S = Todos os carateres excluindo os brancos
		   \w = a-z A-Z, digitos, _
		   \W tudo o que não for incluso no \w
		   [] = parâmetro de pesquisa
		   ? Zero ou uma Ocorrência
		   * Zero ou mais ocorrência
		   + uma ou mais ocorrência
		   {n,m} valor de n até m
		   () agrupamento
		   | ou, exemplo O(v|c)O -> poder ser ovo ou oco.
		   $ Representa o fim da linha.
		   . = 1.3
		  */

		  //String regex = "[a-zA-C]";
		  //String texto = "abaaba";

		  String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
		  String texto2 = "12 0x 0x 0xFFABC 0x10G 0x1";
		  Pattern pattern = Pattern.compile(regex);
		  Matcher matcher = pattern.matcher(texto2);
		  System.out.println("texto:  "+ texto2);
		  System.out.println("Indice: 0123456789  "+ texto2);
		  System.out.println("regex:  "+ regex);
		  System.out.println("Posições Encontradas: ");
		  while(matcher.find()){
				System.out.print(matcher.start()+ " " +matcher.group()+ "\n");
		  }

		  int numeroHex = 0x59F6A;
		  System.out.println(numeroHex);

	 }
}
