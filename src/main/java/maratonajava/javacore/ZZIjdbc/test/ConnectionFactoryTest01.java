package maratonajava.javacore.ZZIjdbc.test;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
	 public static void main (String[] args) {
		  Producer producer = Producer.ProducerBuilder.builder().name("NHK").build();
		  ProducerRepository.save(producer);

	 }
}
