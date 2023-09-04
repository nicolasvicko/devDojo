package maratonajava.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.service.ProducerService;

@Log4j2
public class ConnectionFactoryTest01 {

	 public static void main (String[] args) {
		  Producer producer = Producer.builder().name("Studio Deen").build();
		 // ProducerService.save(producer);


		  ProducerService.delete(2);


	 }
}
