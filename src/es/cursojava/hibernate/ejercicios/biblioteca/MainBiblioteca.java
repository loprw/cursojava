package es.cursojava.hibernate.ejercicios.biblioteca;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.entities.CarnetBiblioteca;
import es.cursojava.entities.Estudiante;
import es.cursojava.hibernate.HibernateUtil;
import es.cursojava.utils.Utilidades;

public class MainBiblioteca {
	
    private static Session session = HibernateUtil.getSession();

	public static void main(String[] args) {
	
		agregarEstudiante();
		mostrarEstudiantes();
	}
	
	//DAO
	private static boolean agregarEstudiante() {
		
		boolean resultado = false;
		
		Estudiante estudiante = crearEstudiante();
		
		Transaction tx = session.beginTransaction();
		
		session.persist(estudiante);
		
		tx.commit();
		
		if (estudiante != null) {
			resultado = true;
		}
		
		return resultado;
	}

	//servicio
	private static Estudiante crearEstudiante() {
		
		String nombre = Utilidades.pideDatoCadena("Indica el nombre del estudiante:");
		String apellidos = Utilidades.pideDatoCadena("Indica los apellidos del estudiante");
		CarnetBiblioteca carnet = crearCarnet();
		
		return new Estudiante(nombre, apellidos, carnet);
	}
	
	//servicio
	private static CarnetBiblioteca crearCarnet() {
				
		Date fecha = Utilidades.convertirFecha();
		
		return new CarnetBiblioteca(fecha);
	}
	
	//DAO
	private static void mostrarEstudiantes() {
		
		String query = "from Estudiante";
		List<Estudiante> listado = session.createQuery(query, Estudiante.class).list();
		
		for (Estudiante estudiante : listado) {
			System.out.println(estudiante);
		}
	}
}
