package es.cursojava.bbdd.ejercicios;

import java.sql.Connection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.UtilidadesBD;

public class Ejercicio1 {

	private static final Logger logger = LoggerFactory.getLogger(Ejercicio1.class);
	
	public static void main(String[] args) {
		
		Connection conn = UtilidadesBD.crearConexion();
		List<Empleado> listado = UtilidadesBD.consultarEmpleados(conn);
		int numeroEmpleados = listado.size();
		String strNumEmpleados = String.valueOf(numeroEmpleados);
		logger.info(strNumEmpleados);
	}
}
