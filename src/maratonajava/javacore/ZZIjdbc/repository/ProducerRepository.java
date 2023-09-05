package maratonajava.javacore.ZZIjdbc.repository;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.domain.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static maratonajava.javacore.ZZIjdbc.service.ProducerService.findByName;

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
		  }
	 }


	 public static List<Producer> findAll() {
		  log.info("From All Producers");
		  return findByName(" ");
	 }

	 public static List<Producer> findByName (String name) {
		  log.info("From  Producer by name");
		  String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
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

	 public static void showProducerMetadata () {
		  log.info("Showing Producer Metadata");
		  String sql = "SELECT * FROM anime_store.producer;";
		  try (Connection conn = ConnectionFactory.getConnection();
				 Statement stmt = conn.createStatement();
				 ResultSet rs = stmt.executeQuery(sql)) {
				ResultSetMetaData rsMetaData = rs.getMetaData();
				rs.next();
				int columnCount = rsMetaData.getColumnCount();
				log.info("Collumns count '{}' ", columnCount);
				for (int i = 1; i <=columnCount ; i++) {
					 log.info("Table name '{}'", rsMetaData.getTableName(i));
					 log.info("Collumn name '{}'", rsMetaData.getColumnName(i));
					 log.info("Collumn size '{}'", rsMetaData.getColumnDisplaySize(i));
					 log.info("Collumn type '{}'", rsMetaData.getColumnTypeName(i));

				}
		  } catch (SQLException e) {
				log.error("Error while tryingto find all producers", e);
		  }
	 }
}
