package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest05 {
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
		   . = 1.3 = 123, 133, 1@3, 1A3
		  */


		  String regex = "([a-zA-Z0-9\\._-])+@([a-zA-z])+(\\.([a-zA-z])+)+";
		  String texto2 = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
		  System.out.println("Email valido:");
		  System.out.println(" "+ "#@!zoro@mail.br".matches(regex));
		  System.out.println(texto2.split(",")[1].trim());
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
