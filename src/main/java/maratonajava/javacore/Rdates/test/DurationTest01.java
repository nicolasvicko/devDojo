package maratonajava.javacore.Rdates.test;

import maratonajava.javacore.Gassociacao.domain.Local;

import java.time.*;

public class DurationTest01 {
	 public static void main (String[] args) {
		  LocalDateTime now = LocalDateTime.now();
		  LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(9);
		  LocalTime timeNow = LocalTime.now();
		  LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
		  Duration b1 = Duration.between(now, nowAfterTwoYears);
		  Duration b2 = Duration.between(timeNow, timeMinus7Hours);
		  Duration b3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
		  Duration b4 = Duration.ofDays(20);
		  Duration b5 = Duration.ofMinutes(3);
		  System.out.println(b1);
		  System.out.println(b2);
		  System.out.println(b3);
		  System.out.println(b4);
		  System.out.println(b5);

	 }
}
