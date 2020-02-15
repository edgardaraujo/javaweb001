package edu.infnet.comercio.negocio;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//singleton padrão de projeto
public class MysqlConnection {
	
	private static Logger Logger = LogManager.getLogger(MysqlConnection.class);
	private static Connection con;
	
	private MysqlConnection() {
		
	}
	
	public static Connection getConnection() /*throws SQLException*/ {
		if(con == null) {
			String url = "jdbc:mysql://localhost:3306/comercio?"
					+ "useTimezone=true&serverTimezone=UTC"
					+ "&createDatabaseIfNotExist=true";
			String user = "root";
			String password = "";
			try {				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, user, password);
				Logger.info("Database iniciou");
				return con;
			} catch (Exception e) {
				Logger.error("Erro ao obter conexao ", e);
				throw new RuntimeException("Erro ao obter conexao ", e);
			}
		}
		return con;
		
	}
	
}
