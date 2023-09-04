package maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
	 public static void main (String[] args) {
		  LocalDateTime aniversario = LocalDateTime.of(1993, Month.FEBRUARY, 25, 3, 0, 0);
		  LocalDateTime nossoDia = LocalDateTime.of(2022, Month.AUGUST, 31, 18, 0, 0);
		  LocalDateTime now =  LocalDateTime.now();
		  System.out.println("Estamos Juntos a:");
		  System.out.println(ChronoUnit.SECONDS.between(nossoDia, now) + " Segundos");
		  System.out.println(ChronoUnit.MINUTES.between(nossoDia, now)+ " Minutos");
		  System.out.println(ChronoUnit.HOURS.between(nossoDia, now) + " Horas");
		  System.out.println(ChronoUnit.DAYS.between(nossoDia, now)+ " Dias");
		  System.out.println(ChronoUnit.WEEKS.between(nossoDia, now)+ " Semanas");
		  System.out.println(ChronoUnit.MONTHS.between(nossoDia, now)+ " Meses");
		  System.out.println(ChronoUnit.YEARS.between(nossoDia, now) + " Anos");
	 }
}
