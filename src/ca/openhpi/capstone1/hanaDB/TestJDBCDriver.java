package ca.openhpi.capstone1.hanaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCDriver {
	
	public static String connectionString = "jdbc:sap://hxehost:39015";
	public static String user = "system";
	public static String password = "N1k17A20";

	public static void main(String[] argv) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString, user, password);
		} catch (SQLException e) {
			System.err.println("Connection Failed. User/Passwd Error? Message: " + e.getMessage());
			return;
		}
		if (connection != null) {
			try {
				System.out.println("Connection to HANA successful!");
				Statement stmt = connection.createStatement();
				ResultSet resultSet = stmt.executeQuery("select 'hello world' from dummy");
				resultSet.next();
				String hello = resultSet.getString(1);
				System.out.println(hello);
			} catch (SQLException e) {
				System.err.println("Query failed!");
			}
		}
	}

}
