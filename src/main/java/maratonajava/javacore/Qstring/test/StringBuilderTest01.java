package maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
	 public static void main (String[] args) {
		  String nome = "William Suane";
		  nome.concat(" DevDojo");
		  System.out.println(nome);
		  StringBuilder sb = new StringBuilder("William Suane");
		  sb.append(" DevDojo").append(" Academy");
		  sb.reverse();
		  System.out.println(sb);
	 }
}
