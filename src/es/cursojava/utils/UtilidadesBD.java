package es.cursojava.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilidadesBD {
	
    private static final Logger logger = LoggerFactory.getLogger(UtilidadesBD.class);
	private static final String URL_DB_ORACLE = "jdbc:oracle:thin:@localhost:1522:XE";
	private static final String USER_DB_ORACLE = "loprw";
	private static final String PASSWORD_DB_ORACLE = "password";
	private static Connection conn = null;

	public static Connection crearConexion() {

		conn = crearConexion(URL_DB_ORACLE, USER_DB_ORACLE, PASSWORD_DB_ORACLE);
		
		return conn;
	}
	
	public static Connection crearConexion(String url, String user, String password) {
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException sqle) {
			logger.error("Error al crear la conexión: " + sqle.getMessage());
		}
		
		return conn;
	}
	
	public static void cerrarConexion(Connection connection) {
		
		try {
			connection.close();
		} catch (SQLException sqle) {
			logger.error("Error al cerrar la conexión: " + sqle.getMessage());;
		}
	}
}
