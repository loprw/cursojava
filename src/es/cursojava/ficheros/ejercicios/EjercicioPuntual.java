package es.cursojava.ficheros.ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

import es.cursojava.ficheros.ArchivoServicio;

public class EjercicioPuntual {

	public static void main(String[] args) {

		Date fecha = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-YY");
		String fechaStr = df.format(fecha);
		
		String direccion = "./recursos/david_" + fechaStr + ".txt";

		ArchivoServicio service = new ArchivoServicio();
		service.crearArchivo(direccion);
	}
}
