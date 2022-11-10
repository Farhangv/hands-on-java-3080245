package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

  public static Connection connect() {
    final String dbPath = "jdbc:sqlite:resources/bank.db";
    Connection connection = null;

    try {
      DriverManager.getConnection(dbPath);
      System.out.println("Successfully connected to the database!");
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return connection;
  }

  public static void main(String[] args) {
    DataSource.connect();
  }
}
