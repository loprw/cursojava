package es.cursojava.bbdd.ejercicios;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.UtilidadesBD;

public class Ejercicio3 {

	private static final Logger logger = LoggerFactory.getLogger(Ejercicio3.class);
	
	public static void main(String[] args) {
		
		Connection conn = UtilidadesBD.crearConexion();
		Map<String, List<Empleado>> mapa = UtilidadesBD.filtrarPorEquipo(conn);
		UtilidadesBD.mostrarNumeroEmpleadosEquipo(mapa);
	}
}
