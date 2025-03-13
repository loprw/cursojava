package es.cursojava.ficheros.ejercicios.eventos;

import java.util.List;
import java.util.Map;

import es.cursojava.inicio.funciones.Utilidades;

public class MainEventos {
	
	public static void main(String[] args) {
		
		String direccion = "Z:\\ficheros\\eventos.txt";
		List<Evento> listadoEventos = UtilidadesEventos.leerFichero(direccion);
		System.out.println(listadoEventos.size());
		
		Map<String, List<Evento>> mapaEventos = UtilidadesEventos.mapearEventosPorCiudad(listadoEventos);
		System.out.println(mapaEventos.size());
		
		UtilidadesEventos.cantidadEventosPorCiudad(mapaEventos);
		
		String ciudad = Utilidades.pideDatoCadena("Indica una ciudad para ver sus eventos:");
		
		UtilidadesEventos.crearArchivoEventosPorCiudad(mapaEventos, ciudad);
		
		UtilidadesEventos.mostrarCiudadesEventosGratis(mapaEventos);
	}

}
