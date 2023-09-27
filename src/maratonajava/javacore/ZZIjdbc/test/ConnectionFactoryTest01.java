package maratonajava.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.service.ProducerService;

@Log4j2
public class ConnectionFactoryTest01 {

	 public static void main (String[] args) {
		  Producer producer = Producer.builder().name("Studio Deen").build();
		  Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
		  /*
		  ProducerService.save(producer);
		  ProducerService.delete(2);
		  ProducerService.update(producerToUpdate);
		  List<Producer> producers = ProducerService.findAll();
		  List<Producer> producers = ProducerService.findByName("Deen");
		   log.info("Producers found '{}'", producers);
		   		  ProducerService.showProducerMetaData();
		  */



		  ProducerService.showDriverMetaData();







	 }
}
