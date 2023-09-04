package maratonajava.javacore.ZZIjdbc.repository;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {

	 public static void save (Producer producer) {
		  String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
		  try (Connection conn = ConnectionFactory.getConnection();
				 Statement stmt = conn.createStatement()) {
				int rowsAffected = stmt.executeUpdate(sql);
				log.info("Insert producer in the Database rows affect '{}' ", rowsAffected);
		  } catch (SQLException e) {
				e.printStackTrace();
		  }
	 }
}
