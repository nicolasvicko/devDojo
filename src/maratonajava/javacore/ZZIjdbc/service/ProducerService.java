package maratonajava.javacore.ZZIjdbc.service;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;
import java.util.Optional;

public class ProducerService {

	 public static void save (Producer producer) {
		  ProducerRepository.save(producer);
	 }

	 public static void delete (Integer id) {
		  requireValidId(id);
		  ProducerRepository.delete(id);
	 }

	 public static void update (Producer producer) {
		  requireValidId(producer.getId());
		  ProducerRepository.update(producer);
	 }

	 public static List<Producer> findByName (String name) {
		  return ProducerRepository.findByName(name);
	 }

	 public static void showProducerMetadata () {
		   ProducerRepository.showProducerMetadata();
	 }


	 public static List<Producer> findAll () {
		  return ProducerRepository.findAll();
	 }

	 private static void requireValidId (Integer id) {
		/*  if (id == null && id <= 0) {
				throw new IllegalArgumentException("Invalid value for id");
		  }*/
		  Optional<Integer> idOptional = Optional.ofNullable(id);
		  if (idOptional.isEmpty() || idOptional.get() <= 0) {
				throw new IllegalArgumentException("Invalid value for id");
		  }


	 }
}
