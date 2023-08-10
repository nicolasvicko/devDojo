package dev.vicko.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
	 public static void main (String[] args) {
		  Calendar c = Calendar.getInstance();
		  if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
				System.out.println("Domingão é o primeiro dia da semana");
		  }
		  System.out.println("Dia da semana " + c.get(Calendar.DAY_OF_WEEK));
		  System.out.println("Dia do mês " + c.get(Calendar.DAY_OF_MONTH));
		  System.out.println("Dia do ano " + c.get(Calendar.DAY_OF_YEAR));
		  System.out.println("Dia da semana no mês " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		  c.add(Calendar.DAY_OF_MONTH, 2);
		  c.roll(Calendar.HOUR, 12);
		  Date date = c.getTime();
		  System.out.println(date);
	 }
}
