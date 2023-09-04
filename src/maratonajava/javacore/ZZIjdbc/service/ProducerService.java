package maratonajava.javacore.ZZIjdbc.service;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ProducerService {

	 public static void save(Producer producer){
		  ProducerRepository.save(producer);
	 }

	 public static void delete (int id){
		  if (id <=0){
				throw new IllegalArgumentException("Invalid value for id");
		  }
		  ProducerRepository.delete(id);
	 }
}
