
package com.projeto.demo.Controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBCConnection {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:postgresql://localhost:5432/teste";
		String username = "postgres";
		String password = "felipeneto1234";

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
			if (connection != null) {
				System.out.println("Conectado ao banco de dados!");
			} else {
				System.out.println("Falha na conexão!");
			}
		} catch (SQLException e) {
			System.out.println("Erro na conexão JDBC: " + e.getMessage());
		}
	}
}
