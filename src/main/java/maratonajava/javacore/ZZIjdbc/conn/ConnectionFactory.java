package maratonajava.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	 //java.sql = Connection, Statement, ResultSet, DriverManager
	 public static void getConnection() {
		  String url = "jdbc:mysql://vickoserver:3306/anime_store";
		  String username = "vicko";
		  String password = "vicko";

		  try {
				Connection connection = DriverManager.getConnection(url, username, password);
		  } catch (SQLException e) {
				e.printStackTrace();
		  }

	 }
}
