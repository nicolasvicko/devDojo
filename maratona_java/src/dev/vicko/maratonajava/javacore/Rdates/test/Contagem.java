package dev.vicko.maratonajava.javacore.Rdates.test;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Contagem {
	 public static void main(String[] args) throws InterruptedException {
		  LocalDateTime dataHoraInicial = LocalDateTime.of(2022, 9, 30, 18, 0, 0); // Atualizada para 30 de setembro de 2023 às 18:00
		  LocalDateTime dataHoraAtual;

		  System.out.println("Começando nossa contagem juntos! ❤️");

		  while (true) {
				dataHoraAtual = LocalDateTime.now();
				Duration duracao = Duration.between(dataHoraInicial, dataHoraAtual);

				long segundos = duracao.getSeconds();
				long minutos = duracao.toMinutes();
				long horas = duracao.toHours();
				long dias = duracao.toDays();
				long semanas = dias / 7;
				long meses = dataHoraInicial.until(dataHoraAtual, ChronoUnit.MONTHS);
				long anos = dataHoraInicial.until(dataHoraAtual, ChronoUnit.YEARS);

				System.out.printf("Tempo juntos: %d anos, %d meses, %d semanas, %d dias, %d horas, %d minutos, %d segundos%n",
						  anos, meses, semanas, dias, horas, minutos, segundos);

				Thread.sleep(1000); // Aguarda 1 segundo antes de atualizar a contagem
		  }
	 }
}
