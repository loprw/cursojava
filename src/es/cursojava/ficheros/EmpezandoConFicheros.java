package es.cursojava.ficheros;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.Main;

public class EmpezandoConFicheros {
	
    private static final Logger logger = LoggerFactory.getLogger(EmpezandoConFicheros.class);

	public static void main(String[] args) {
		File directorio = new File("C:\\Users\\Tardes\\Ficheros");
		System.out.println(directorio.isDirectory());
		System.out.println(directorio.isFile());

		File fichero = new File("C:\\Users\\Tardes\\Ficheros\\fichero1.txt");
		System.out.println(fichero.isDirectory());
		System.out.println(fichero.isFile());

		File fichero2 = new File("C:\\Users\\Tardes\\Ficheros\\fichero2.txt");
		System.out.println(fichero2.exists());

		if (fichero2.exists()) {
			System.out.println(fichero.isDirectory());
			System.out.println(fichero.isFile());
		} else {
			System.out.println("El archivo no existe.");
		}
		
		System.out.println("=======================================");
		
		for (int i = 0; i < 5; i++) {
			File directorioNuevo = new File(directorio, "\\subdir" + (i + 1));
			if (directorioNuevo.mkdir()) {
				System.out.println("Fichero subdir" + (i + 1) + " creado.");
			} else {
				System.out.println("El fichero subdir" + (i + 1) + " no se ha creado porque ya existe.");
			}
		}
		
		System.out.println("=======================================");
		
		String[] listado1 = directorio.list();
		
		for (String nombre : listado1) {
			System.out.println(nombre);
			File file1 = new File(directorio, nombre);
			System.out.println(file1.getAbsolutePath());
		}
		
		System.out.println("=======================================");
		
		File[] listado2 = directorio.listFiles();
		
		for (File archivo : listado2) {
			System.out.println(archivo);
			System.out.println(archivo.getName());
		}
		
		File fichero3 = new File("C:\\Users\\Tardes\\Ficheros\\fichero3.txt");
		try {
			fichero3.createNewFile();
		} catch (IOException ioe) {
			logger.error("Error al crear el fichero " + fichero3.getAbsolutePath() + ": " + ioe.getMessage(), ioe);
		}
	}
}
