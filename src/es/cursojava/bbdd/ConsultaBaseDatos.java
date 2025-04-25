package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.UtilidadesBD;

public class ConsultaBaseDatos {

	private static final Logger logger = LoggerFactory.getLogger(ConsultaBaseDatos.class);
	private static final String CONSULTA_EMPLEADOS = 
			"SELECT id, nombre, edad, salario FROM empleados WHERE edad > 30 ORDER BY salario DESC";

	public static void main(String[] args) {
		
		Connection conexion = UtilidadesBD.crearConexion();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conexion.createStatement();
			// en consulta sql no hace poner ";" al final de la sentencia sql
			rs = st.executeQuery(CONSULTA_EMPLEADOS);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");
				double salario = rs.getDouble("salario");

				System.out.println(
						"Registro [id " + id + ", nombre " + nombre + ", edad " + edad + ", salario " + salario + "]");
			}
			// debería ir en un finally, o mucho mejor en un try with resources

		} catch (SQLException sqle) {
			logger.error("Error al crear objeto Statement: " + sqle.getMessage());
		} finally {
			UtilidadesBD.cerrarConexion(conexion);
						try {
				rs.close();
				st.close();
			} catch (SQLException sqle) {
				logger.error(sqle.getMessage());
			}			
		}
		
		logger.info("TERMINA");
	}
}
