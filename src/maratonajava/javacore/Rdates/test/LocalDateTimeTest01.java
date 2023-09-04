package maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
	 public static void main (String[] args) {
		  LocalDateTime localDateTime = LocalDateTime.now();
		  LocalDate date1 = LocalDate.of(2022, Month.AUGUST, 6);
		  LocalTime time1 = LocalTime.of(9, 5, 21);
		  LocalDate date2 = LocalDate.parse("2022-08-06");
		  LocalTime time2 = LocalTime.parse("09:45:00");
		  System.out.println(localDateTime);
		  System.out.println(date1);
		  System.out.println(time1);
		  System.out.println(date2);
		  System.out.println(time2);
		  // 'Concatenação' Data em date1 + hora em time1
		  LocalDateTime ldt1 = date1.atTime(time1);
		  LocalDateTime ldt2 = time1.atDate(date1);
		  System.out.println(ldt1);
		  System.out.println(ldt2);
	 }
}
