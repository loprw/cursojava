package es.cursojava.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.bbdd.ejercicios.Empleado;

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
			logger.error("Error al cerrar la conexión: " + sqle.getMessage());
			;
		}
	}

	public static List<Empleado> consultarEmpleados() {
		
		Connection conn = crearConexion();
		List<Empleado> listado = consultarEmpleados(conn);
		
		return listado;
	}
	
	public static List<Empleado> consultarEmpleados(Connection connection) {

		List<Empleado> listado = new ArrayList<Empleado>();
		Statement st = null;
		ResultSet rs = null;
		final String QUERY_DB_ORACLE = 
				"SELECT id, nombre, edad, salario, departamento_id, fecha_contratacion, equipo_id FROM empleados";

		try {
			st = connection.createStatement();
			rs = st.executeQuery(QUERY_DB_ORACLE);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");
				double salario = rs.getDouble("salario");
				int departamento_id = rs.getInt("departamento_id");
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				Date fecha_contratacion = null;
				try {
					fecha_contratacion = format.parse(rs.getString("fecha_contratacion"));
				} catch (ParseException pe) {
					logger.error(pe.getMessage());
				}
				int equipo_id = rs.getInt("equipo_id");

				listado.add(new Empleado(id, nombre, edad, salario, departamento_id, fecha_contratacion, equipo_id));
			}
		} catch (SQLException sqle) {
			logger.info(sqle.getMessage());
		}

		return listado;
	}

	public static List<Empleado> consultarEmpleadosMayoresDe(int edadObjetivo) {
		
		Connection conn = crearConexion();
		List<Empleado> listado = consultarEmpleadosMayoresDe(conn, edadObjetivo);
		
		return listado;
	}
	
	public static List<Empleado> consultarEmpleadosMayoresDe(Connection connection, int edadObjetivo) {

		List<Empleado> listado = new ArrayList<Empleado>();
		Statement st = null;
		ResultSet rs = null;
		final String QUERY_DB_ORACLE = 
				"SELECT id, nombre, edad, salario, departamento_id, fecha_contratacion, equipo_id FROM empleados WHERE edad > "
				+ edadObjetivo;

		try {
			st = connection.createStatement();
			rs = st.executeQuery(QUERY_DB_ORACLE);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");
				double salario = rs.getDouble("salario");
				int departamento_id = rs.getInt("departamento_id");
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				Date fecha_contratacion = null;
				try {
					fecha_contratacion = format.parse(rs.getString("fecha_contratacion"));
				} catch (ParseException pe) {
					logger.error(pe.getMessage());
				}
				int equipo_id = rs.getInt("equipo_id");

				listado.add(new Empleado(id, nombre, edad, salario, departamento_id, fecha_contratacion, equipo_id));
			}
		} catch (SQLException sqle) {
			logger.info(sqle.getMessage());
		}

		return listado;
	}
	
	public static Map<String, List<Empleado>> filtrarPorEquipo() {
	
		Connection conn = crearConexion();
		Map<String,List<Empleado>> mapa = filtrarPorEquipo(conn);
		
		return mapa;
	}
	
	public static Map<String, List<Empleado>> filtrarPorEquipo(Connection conn) {
		
		Map<String, List<Empleado>> mapa = new LinkedHashMap<String, List<Empleado>>();
		Map<Integer, String> mapaInterno = new LinkedHashMap<Integer, String>();
		List<Empleado> listado = new ArrayList<Empleado>();
		Set<Integer> set = new LinkedHashSet<Integer>();
		Statement st = null;
		ResultSet rs = null;
		final String QUERY_DB_ORACLE = 
				"SELECT e.id, e.nombre, e.edad, e.salario, e.departamento_id, e.fecha_contratacion, e.equipo_id, eq.nombre AS nombreEquipo "
				+ "FROM empleados e "
				+ "JOIN equipos eq ON eq.id = e.equipo_id";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(QUERY_DB_ORACLE);
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");
				double salario = rs.getDouble("salario");
				int departamento_id = rs.getInt("departamento_id");
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				Date fecha_contratacion = null;
				try {
					fecha_contratacion = format.parse(rs.getString("fecha_contratacion"));
				} catch (ParseException pe) {
					logger.error(pe.getMessage());
				}
				int equipo_id = rs.getInt("equipo_id");
				String equipo_nombre = rs.getString("nombreEquipo");

				listado.add(new Empleado(id, nombre, edad, salario, departamento_id, fecha_contratacion, equipo_id));
				mapaInterno.put(equipo_id, equipo_nombre);
			}
		}  catch (SQLException sqle) {
			logger.info(sqle.getMessage());
		}
		
		for (int id: mapaInterno.keySet()) {
			set.add(id);
		}
		
		for (int id:set) {
			List<Empleado> listadoInterno = new ArrayList<Empleado>();
			for (Empleado empleado:listado) {
				if(id == empleado.getEquipo_id()) {
					listadoInterno.add(empleado);
				}
			}
			mapa.put(mapaInterno.get(id), listadoInterno);
		}		
		
		return mapa;
	}
	
	public static void mostrarNumeroEmpleadosEquipo(Map<String, List<Empleado>> mapa) {
		
		Set<Entry<String, List<Empleado>>> entrySet = mapa.entrySet();
		
		for (Entry<String, List<Empleado>> entry:entrySet) {
			int contador = 0;
			for (Empleado empleado: entry.getValue()) {
				contador++;
			}
			System.out.println(entry.getKey() + ": " + contador);
		}
	}
	
	public static void pintarMapaEquipoEmpleados(Map<String, List<Empleado>> mapa) {
		
		Set<Entry<String, List<Empleado>>> entries = mapa.entrySet();
		
		for (Entry<String, List<Empleado>> entry: entries) {
			System.out.println("\n\n" + entry.getKey() + ": ");
			for (Empleado empleado: entry.getValue()) {
				StringBuilder sb = new StringBuilder();
				sb.append("\n\tEmpleado: ");
				sb.append("\n\t\tId: " + empleado.getId() + ",");
				sb.append("\n\t\tNombre: " + empleado.getNombre() + ",");
				sb.append("\n\t\tEdad: " + empleado.getEdad() + ",");
				sb.append("\n\t\tSalario: " + empleado.getSalario() + ",");
				sb.append("\n\t\tId de su departamento: " + empleado.getDepartamento_id() + ",");
				sb.append("\n\t\tFecha de contratación: " + empleado.getFecha_contratacion() + ",");
				sb.append("\n\t\tId de su equipo: " + empleado.getEquipo_id() + ".");
				
				System.out.println(sb);
			}
		}
	}
	
	public static void mostrarEquipos() {
		
		final String QUERY_DB_ORACLE = "";
	}
}
