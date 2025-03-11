package es.cursojava.ficheros.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainQuijote {

	private static final Logger logger = LoggerFactory.getLogger(MainQuijote.class);

	public static void main(String[] args) {

		String direccion = "Z:\\ficheros\\Quijote.txt";
		File fichero = null;
		fichero = new File(direccion);

		String texto = "El número de líneas del texto es de " + contarLineas(fichero);
		logger.info(texto);

		String personaje = "Dulcinea";
		String texto2 = "El número de veces que aparece la palabra " + personaje + " en el texto es "
				+ contarMenciones(fichero, personaje);
		logger.info(texto2);
	}

	public static int contarLineas(File fichero) {
		int contador = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
			String linea;

			while ((linea = reader.readLine()) != null) {
				contador++;
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			logger.debug(ioe.getMessage());
		}

		return contador;
	}

	public static int contarMenciones(File fichero, String personaje) {
		int contador = 0;

		try (Scanner scan = new Scanner(fichero)) {
			scan.useDelimiter("\n");

			while (scan.hasNext()) {
				String[] palabras = scan.next().split(" ");
				for (String palabra : palabras) {
					if (palabra.contains(personaje)) {
						contador++;
					}
				}

			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			logger.error(fnfe.getMessage());
		}

		return contador;
	}
}
