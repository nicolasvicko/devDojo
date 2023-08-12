package dev.vicko.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
	 public static void main (String[] args) {
		  Locale localePT = new Locale("pt", "BR");
		  Locale localeJP = Locale.JAPAN;
		  Locale localeIT = Locale.ITALY;

		  NumberFormat[] nfa = new NumberFormat[4];
		  nfa[0] = NumberFormat.getCurrencyInstance();
		  nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
		  nfa[2] = NumberFormat.getCurrencyInstance(localePT);
		  nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

		  double valor = 1_000.2130;

		  for (NumberFormat numberFormat : nfa) {
				numberFormat.setMaximumFractionDigits(2);
				System.out.println(numberFormat.format(valor));
		  }
		  String valorString ="￥1,000.21";

		  try {
				System.out.println(nfa[1].parse(valorString));
		  } catch (ParseException e) {
				e.printStackTrace();
		  }


	 }
}
