package es.cursojava.utils;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.entities.CaballoCarrera;
import es.cursojava.hibernate.ejercicios.caballos.exceptions.ErrorEdadException;
import es.cursojava.hibernate.ejercicios.caballos.exceptions.ErrorExperienciaException;
import es.cursojava.hibernate.ejercicios.caballos.exceptions.ErrorTriunfosException;
import es.cursojava.hibernate.ejercicios.caballos.exceptions.ErrorVelocidadMaxException;

public class UtilidadesHibernate {

	private static Session session;
    private static final Logger logger = LoggerFactory.getLogger(UtilidadesHibernate.class);

	public static void cerrarConexion(Session sesssion) {
		session.close();
	}

	public static void agregarCaballosBaseDatos(Session session, List<CaballoCarrera> caballos) {

		Transaction tx = session.beginTransaction();
		System.out.println(session);

		for (CaballoCarrera caballo : caballos) {
			session.persist(caballo);
		}

		tx.commit();
	}
	
	public static void agregarCaballoBaseDatos(Session session, CaballoCarrera caballo) {

		Transaction tx = session.beginTransaction();
		System.out.println(session);

		session.persist(caballo);

		tx.commit();
	}
	
	public static int pedirEdad(String texto) throws ErrorEdadException {

		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int edad = scan.nextInt();

		if (edad < 2) {
			ErrorEdadException eee = new ErrorEdadException(
					"La edad del caballo es demasiado baja, no puede competir;" + " debe tener mínimo 2 años.");
			throw eee;
		} else if (edad > 30) {
			ErrorEdadException eee = new ErrorEdadException(
					"La edad del caballo es demasiado alta, no puede competir;" + " debe tener máximo 30 años.");
			throw eee;
		}

		return edad;
	}

	public static double pedirVelocidad(String texto) throws ErrorVelocidadMaxException {

		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		double velocidadMax = scan.nextDouble();

		if (velocidadMax < 30) {
			ErrorVelocidadMaxException evme = new ErrorVelocidadMaxException(
					"La velocidad del caballo es demasiado baja, no puede competir;" + " debe ser mínimo 30 km/h.");
			throw evme;
		} else if (velocidadMax > 80) {
			ErrorVelocidadMaxException evme = new ErrorVelocidadMaxException(
					"La velocidad del caballo es demasiado alta, no puede competir;" + " debe ser máximo 80 km/h.");
			throw evme;
		}

		return velocidadMax;
	}

	public static double pedirExperiencia(String texto) throws ErrorExperienciaException {

		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		double experiencia = scan.nextDouble();

		if (experiencia < 0) {
			ErrorExperienciaException eee = new ErrorExperienciaException(
					"La experiencia del caballo es demasiado baja;" + " debe ser mínimo 0.");
			throw eee;
		} else if (experiencia > 10) {
			ErrorExperienciaException eee = new ErrorExperienciaException(
					"La velocidad del caballo es demasiado alta;" + " debe ser máximo 10.");
			throw eee;
		}

		return experiencia;
	}

	public static int pedirTriunfos(String texto) throws ErrorTriunfosException {

		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int triunfos = scan.nextInt();

		if (triunfos < 2) {
			ErrorTriunfosException ete = new ErrorTriunfosException(
					"El número de triunfos es demasiado bajo, debe ser mínomo 0.");
			throw ete;
		}

		return triunfos;
	}

	public static boolean pedirEstado(String texto) {

		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String respuesta = scan.nextLine();
		boolean activo;

		if (respuesta.toLowerCase().equals("y")) {
			activo = true;
		} else if (respuesta.toLowerCase().equals("n")) {
			activo = false;
		} else {
			logger.info("No ha indicado una opción correcta, vuelva a introducirla:");
			pedirEstado(texto);
		}

		return false;
	}

	private static CaballoCarrera crearCaballo() {
		
		String nombre = Utilidades.pideDatoCadena("Indique el nombre del cabalo:");

		int edad = 0;
		try {
			edad = pedirEdad("Indique la edad del caballo");
		} catch (ErrorEdadException eee) {
			eee.printStackTrace();
			logger.error(eee.getMessage());
		}

		double velocidadMaxima = 0;
		try {
			velocidadMaxima = pedirVelocidad("Indique la velocidad del caballo (de 10 a 80 km/h):");
		} catch (ErrorVelocidadMaxException evme) {
			evme.printStackTrace();
			logger.error(evme.getMessage());
		}

		int triunfos = 0;
		try {
			triunfos = pedirTriunfos("Indique cuántos triunfos ha obtenido el caballo:");
		} catch (ErrorTriunfosException ete) {
			ete.printStackTrace();
			logger.error(ete.getMessage());
		}

		double experiencia = 0;

		try {
			experiencia = pedirExperiencia("Indique la experiencia que tiene el caballo (entre 0 y 10):");
		} catch (ErrorExperienciaException eee) {
			eee.printStackTrace();
			logger.error(eee.getMessage());
		}

		boolean activo = pedirEstado("Indique si el caballo está activo o no (Y/N)");
		
		CaballoCarrera caballo = new CaballoCarrera(nombre, edad, velocidadMaxima, triunfos, experiencia,
				activo);
		
		return caballo;
	}
	
	public static List<CaballoCarrera> mostrarCaballosActivos(Session session) {
		
		String consulta = "FROM TB_CABALLOS c WHERE c.activo = :estado";
		Query<CaballoCarrera> query = session.createQuery(consulta, CaballoCarrera.class);
		query.setParameter("estado", 1);
		List<CaballoCarrera> listado = query.list();
		
		if (listado != null) {
			logger.debug("Listado de caballos de carrera NO ES nulo.");
		} else {
			logger.debug("Listado de caballos de carrera ES nulo");
		}

		
		return listado;
	}
	
	private static void empezarCarrera(List<CaballoCarrera> caballos) {
		
		final double DISTANCIA = 1000;
	}

	public static void menu(Session session) {

		int opcion = -1;
		final int VALOR_SALIDA = 0;

		do {
			Utilidades.pintaMenu(
					"\n\n\t\tCARRERA DE CABALLOS\n\n\t1. Registrar Caballo\n\t2. Iniciar Carrera" + "\n\n\t0.Salir\n");
			opcion = Utilidades.pideDatoNumerico("Escoja el número de una opción");

			switch (opcion) {

			case 1 -> {
				
				logger.info("Vamos a crear un caballo...");
				CaballoCarrera caballo = crearCaballo();
				UtilidadesHibernate.agregarCaballoBaseDatos(session, caballo);
				logger.info("Caballo creado y agregado a la base de datos.");
			}
			
			case 2 -> {
				
				List<CaballoCarrera> caballos = UtilidadesHibernate.mostrarCaballosActivos(session);
				if (caballos.size() < 2) {
					continue;
				} else {
					logger.info("Va a empezar la carrera...");
					UtilidadesHibernate.empezarCarrera(caballos);
				}
			}
			}

		} while (opcion != VALOR_SALIDA);
	}
}
