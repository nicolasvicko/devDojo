package maratonajava.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	 //java.sql = Connection, Statement, ResultSet, DriverManager
	 public static Connection getConnection() throws SQLException {
		  String url = "jdbc:mysql://vickoserver:3306/anime_store";
		  String username = "maratonajava";
		  String password = "devdojo";

		 return DriverManager.getConnection(url, username, password);

	 }
}
