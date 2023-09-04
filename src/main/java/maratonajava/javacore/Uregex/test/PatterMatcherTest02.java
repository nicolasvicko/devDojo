package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
	 public static void main (String[] args) {
		  // \d = Todos os digitos
		  // \D = Tudo o que não for dígito
		  // \s = Todos os espaços em branco \t \n \f \r
		  // \S = Todos os carateres excluindo os brancos
		  // \w = a-z A-Z, digitos, _
		  // \W tudo o que não for incluso no \w
		  String regex = "\\d";
		  //String texto = "abaaba";
		  String texto2 = "hhj212gvh21kh2";
		  Pattern pattern = Pattern.compile(regex);
		  Matcher matcher = pattern.matcher(texto2);
		  System.out.println("texto:  "+ texto2);
		  System.out.println("Indice: 0123456789  "+ texto2);
		  System.out.println("regex:  "+ regex);
		  System.out.println("Posições Encontradas: ");
		  while(matcher.find()){
				System.out.println(matcher.start()+ " ");
		  }

	 }
}
