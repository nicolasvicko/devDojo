package maratonajava.javacore.ZZIjdbc.repository;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {

	 public static void save (Producer producer) {
		  String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
		  try (Connection conn = ConnectionFactory.getConnection();
				 Statement stmt = conn.createStatement()) {
				int rowsAffected = stmt.executeUpdate(sql);
				log.info("Insert producer '{}' in the Database rows affect '{}' ", producer.getName(), rowsAffected);
		  } catch (SQLException e) {
				log.error("Error while trying to insert producer '{}' ", producer.getName(), e);
				e.printStackTrace();
		  }
	 }

	 public static void delete (int id) {
		  String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
		  try (Connection conn = ConnectionFactory.getConnection();
				 Statement stmt = conn.createStatement()) {
				int rowsAffected = stmt.executeUpdate(sql);
				log.info("Deleted producer '{}' from the Database rows affect '{}' ", id, rowsAffected);
		  } catch (SQLException e) {
				log.error("Error while trying to delete producer '{}' ", id, e);
				e.printStackTrace();
		  }
	 }

	 public static void update (Producer producer) {
		  String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
		  try (Connection conn = ConnectionFactory.getConnection();
				 Statement stmt = conn.createStatement()) {
				int rowsAffected = stmt.executeUpdate(sql);
				log.info("Updated producer '{}'  rows affect '{}' ", producer.getId(), rowsAffected);
		  } catch (SQLException e) {
				log.error("Error while trying updated producer '{}' ", producer.getId(), e);
				e.printStackTrace();
		  }
	 }

	 public static List<Producer> findAll () {
		  log.info("From All Producer ");
		  String sql = "SELECT id, name FROM anime_store.producer;;";
		  List<Producer> producers = new ArrayList<>();
		  try (Connection conn = ConnectionFactory.getConnection();
				 Statement stmt = conn.createStatement();
				 ResultSet rs = stmt.executeQuery(sql)) {
				while (rs.next()) {
					 Producer producer = Producer.builder()
								.id(rs.getInt("id"))
								.name(rs.getString("name"))
								.build();
					 producers.add(producer);
				}
		  } catch (SQLException e) {
				log.error("Error while tryingto find all producers", e);
		  }
		  return producers;
	 }
}
