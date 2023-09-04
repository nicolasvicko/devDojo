package maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
	 public static void main (String[] args) {
		  LocalDate date = LocalDate.now();
		  String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		  String s2 = date.format(DateTimeFormatter.ISO_DATE);
		  String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

		  System.out.println(s1);
		  System.out.println(s2);
		  System.out.println(s3);

		  LocalDate parse1 = LocalDate.parse("20230815", DateTimeFormatter.BASIC_ISO_DATE);
		  LocalDate parse2 = LocalDate.parse("2023-08-15", DateTimeFormatter.ISO_DATE);
		  LocalDate parse3 = LocalDate.parse("2023-08-15", DateTimeFormatter.ISO_LOCAL_DATE);

		  System.out.println(parse1);
		  System.out.println(parse2);
		  System.out.println(parse3);

		  LocalDateTime now = LocalDateTime.now();
		  String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
		  System.out.println(s4);
		  LocalDateTime parse4 = LocalDateTime.parse("2021-02-19T18:46:04.1121294", DateTimeFormatter.ISO_DATE_TIME);
		  System.out.println(parse4);

		  DateTimeFormatter formatterBr= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		  String formatBr = LocalDate.now().format(formatterBr);
		  System.out.println(formatBr);

		  LocalDate parteBR = LocalDate.parse("15/08/2023", formatterBr);
		  System.out.println(parteBR.format(formatterBr));

		  DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
		  String formatGR = LocalDate.now().format(formatterGR);
		  System.out.println(formatGR);
		  LocalDate parse5 = LocalDate.parse("15.August.2023", formatterGR);
		  System.out.println(parse5);
	 }
}
