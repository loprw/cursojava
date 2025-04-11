package es.cursojava.ficheros.ejercicios;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.Utilidades;

public class Ejercicio2Ficheros {

	private static final Logger logger = LoggerFactory.getLogger(Ejercicio2Ficheros.class);

	public static void main(String[] args) {

		File directorio = new File(Utilidades.pideDatoCadena("Indica la dirección absoluta de un fichero: "));
		File[] arbol = directorio.listFiles();
		System.out.println(arbol.length);
		int contador = 1;
		recorrerArbol(arbol, contador);

	}

	public static void recorrerArbol(File[] arbol, int contador) {
		for (File file : arbol) {
			if (file.isDirectory()) {
				logger.info(file.getName());
				if (contador++ < 2) {
					File[] segundoArbol = file.listFiles();
					if (segundoArbol != null) {
						recorrerArbol(segundoArbol, contador);
					} else {
						logger.info("El directorio " + file.getName() + " no tiene ficheros ni directorios hijos.");
					}
				}
				// quitamos 1 a contador porque si no no se accede al siguiente directorio con
				// archivos al tener valor 2 -que pasa a 3-.
				contador--;
			} else if (file.isFile()) {
				logger.info("El archivo " + file.getName() + " ocupa " + file.length()
						+ " bites y " + (file.isHidden() ? "" : "no ") + "es oculto.");
			}
		}
	}
}
