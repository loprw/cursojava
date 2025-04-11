package es.cursojava.bbdd.ejercicios;

import java.sql.Connection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.Utilidades;
import es.cursojava.utils.UtilidadesBD;

public class Ejercicio2 {
	
	private static final Logger logger = LoggerFactory.getLogger(Ejercicio2.class);

	public static void main(String[] args) {
		
		int edadObjetivo = Utilidades.pideDatoNumerico("Indica la edad por la que quieres filtrar a los empleados:");
		Connection conn = UtilidadesBD.crearConexion();
		List<Empleado> listado = UtilidadesBD.consultarEmpleadosMayoresDe(conn, edadObjetivo);
		int numeroEmpleados = listado.size();
		String strNumEmpleados = String.valueOf(numeroEmpleados);
		logger.info(strNumEmpleados);
	}
}
