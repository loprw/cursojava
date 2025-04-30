package es.cursojava.front;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.dto.CaballoDTO;
import es.cursojava.services.CarreraService;
import es.cursojava.utils.Utilidades;

public class CarreraFront {

	private static final Logger logger = LoggerFactory.getLogger(CarreraFront.class);
	private String nombre;
	private CarreraService servicio = new CarreraService();

	public CarreraFront(String nombre) {
		super();
		this.nombre = nombre;
	}

	public CarreraFront() {

	}

	public String getNombre() {
		return nombre;
	}

	public void menu() {

		int opcion = -1;
		final int OPCION_SALIDA = 0;

		do {

			Utilidades.pintaMenu("\n\n\t\t\t***MENÚ***\n\n" + "\n\t1. Registrar Caballo." + "\n\t2. Mostrar Caballos."
					+ "\n\t3. Lanzar Carrera." + "\n\t4. Cambiar Jinete." + "\n\n\t0. Salir.", "");

			opcion = Utilidades.pideDatoNumerico("Indica una opción:");

			switch (opcion) {
			case 1 -> {
				agregarCaballo();
			}
			case 2 -> {
				mostrarCaballos();
			}
			case 3 -> {
				carrera();
			}
			case 4 -> {
				cambiarJinete();
			}
			case 0 -> {
				logger.info("Se va a cerrar el menú. ¡Adiós!");
			}
			default -> {
				logger.info("Has seleccionado una opción incorrecta.");
			}
			}
		} while (opcion != OPCION_SALIDA);

	}

	public void agregarCaballo() {

		String nombre = Utilidades.pideDatoCadena("Indica el nombre del caballo:");
		int edad = Utilidades.pideDatoNumerico("Indica la edad del caballo:");
		double velocidad = Utilidades.pideDatoDouble("Indica la velocidad máxima del caballo:");
		int triunfos = Utilidades
				.pideDatoNumerico("Indica la cantidad de triunfos que ha tenido el caballo hasta ahora:");
		double experiencia = Utilidades.pideDatoDouble("Indica la experiencia corriendo del caballo (de 0.0 a 10.0):");
		boolean activo = (Utilidades.pideDatoCadena("Indica si el caballo está activo (s/n)").toLowerCase()
				.contains("s")) ? true : false;
		String nombreJinete = Utilidades.pideDatoCadena("Indica el nombre del jinete:");
		String nacionalidadJinete = Utilidades.pideDatoCadena("Indica la nacionalidad del jinete:");

		CaballoDTO dto = new CaballoDTO(nombre, edad, velocidad, triunfos, experiencia, activo, nombreJinete, nacionalidadJinete);

		if (servicio.ingresarCaballo(dto)) {
			logger.info("Caballo agregado con éxito.");
		} else {
			logger.info("Caballo no agregado.");
		}
	}

	public void mostrarCaballos() {

		List<CaballoDTO> listado = servicio.recuperarCaballos();

		if (listado.size() != 0) {
			for (CaballoDTO caballoDTO : listado) {
				logger.info(caballoDTO.toString());
			}
		} else {
			logger.info("No hay listado de caballos agregados.");
		}
	}

	public boolean mostrarCaballosActivos() {
		List<CaballoDTO> listado = servicio.recuperarCaballosActivos();

		if (listado.size() > 1) {
			logger.info("Listado de Caballos participantes: \n");
			for (CaballoDTO caballoDTO : listado) {
				logger.info("\t" + caballoDTO.toString());
			}
			return true;
		} else {
			logger.info("No hay suficientes caballos activos para realizar una carrera (mínimo: 2).");
			return false;
		}
	}

	public void carrera() {
		if (mostrarCaballosActivos()) {
			CaballoDTO ganador = servicio.ejecutarCarrera();
			logger.info("El caballo ganador es: \n" + ganador.toString());
		}
	}
	
	public void cambiarJinete() {
		logger.info("Estos son los caballos registrados y sus jinetes:");
		mostrarCaballos();
		int id = Utilidades.pideDatoNumerico("Indica el Id del Caballo al cual deseas cambiar de Jinete:");
		String nombreJinete = Utilidades.pideDatoCadena("Indica el nombre del nuevo Jinete:");
		String nacionalidadJinete = Utilidades.pideDatoCadena("Indica la nacionalidad del nuevo Jinete:");
		
		if (servicio.modificarJinete(id, nombreJinete, nacionalidadJinete)) {
			logger.info("Se ha modificado correctamente el jinete.");
		} else {
			logger.info("No se ha modificado el jinete.");
		}
		
		servicio.recuperarCaballo(id);
	}
}
