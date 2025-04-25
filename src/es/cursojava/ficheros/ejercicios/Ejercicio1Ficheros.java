<<<<<<< HEAD
package es.cursojava.ficheros.ejercicios;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.inicio.funciones.Utilidades;

public class Ejercicio1Ficheros {
	
    private static final Logger logger = LoggerFactory.getLogger(Ejercicio1Ficheros.class);

	public static void main(String[] args) {
		
		File directorio = new File("C:\\Users\\Tardes\\Ficheros");
		File imagenes = new File(directorio, "\\Imagenes");
		File documentos = new File(directorio, "\\Documentos");
		File otros = new File(directorio, "\\Otros");
		
		if (imagenes.mkdir()) {
			logger.info("Se ha creado con éxito el directorio " + imagenes.getName() + ".");
		} else {
			logger.info("No se ha creado el directorio " + imagenes.getName() + ".");
		}
		
		if (documentos.mkdir()) {
			logger.info("Se ha creado con éxito el directorio " + documentos.getName() + ".");
		} else {
			logger.info("No se ha creado el directorio " + documentos.getName() + ".");
		}
		
		if (otros.mkdir()) {
			logger.info("Se ha creado con éxito el directorio " + otros.getName() + ".");
		} else {
			logger.info("No se ha creado el directorio " + otros.getName() + ".");
		}
			
		
		for (int i = 0; i < 5; i++) {
			String fichero = Utilidades.pideDatoCadena("Indica el nombre de un fichero y su extensión: ");
			int indiceExtension = fichero.lastIndexOf('.');
			String extension = fichero.substring(indiceExtension);
			
			if (extension.equals(".gif") || extension.equals(".png") || extension.equals(".jpg")) {
				File nuevoFichero = new File(imagenes, fichero);
				try {
					nuevoFichero.createNewFile();
				} catch (IOException ioe) {
					logger.error("No se ha podido crear el fichero " + nuevoFichero.getName());
				}
			} else if (extension.equals(".txt")) {
				File nuevoFichero = new File(documentos, fichero);
				try {
					nuevoFichero.createNewFile();
				} catch (IOException ioe) {
					logger.error("No se ha podido crear el fichero " + nuevoFichero.getName());
				}
			} else {
				File nuevoFichero = new File(otros, fichero);
				try {
					nuevoFichero.createNewFile();
				} catch (IOException ioe) {
					logger.error("No se ha podido crear el fichero " + nuevoFichero.getName());
				}
			}
		}
		
		File[] todoOtros = otros.listFiles();
		
		for (File archivo : todoOtros) {
			int indiceExtension = archivo.getName().lastIndexOf('.');
			String extension = archivo.getName().substring(indiceExtension);
			String nuevoNombre = "david" + extension;
			archivo.renameTo(new File(otros, nuevoNombre));
		}
	}
}
=======
package es.cursojava.ficheros.ejercicios;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.Utilidades;

public class Ejercicio1Ficheros {
	
    private static final Logger logger = LoggerFactory.getLogger(Ejercicio1Ficheros.class);

	public static void main(String[] args) {
		
		File directorio = new File("C:\\Users\\Tardes\\Ficheros");
		File imagenes = new File(directorio, "\\Imagenes");
		File documentos = new File(directorio, "\\Documentos");
		File otros = new File(directorio, "\\Otros");
		
		if (imagenes.mkdir()) {
			logger.info("Se ha creado con éxito el directorio " + imagenes.getName() + ".");
		} else {
			logger.info("No se ha creado el directorio " + imagenes.getName() + ".");
		}
		
		if (documentos.mkdir()) {
			logger.info("Se ha creado con éxito el directorio " + documentos.getName() + ".");
		} else {
			logger.info("No se ha creado el directorio " + documentos.getName() + ".");
		}
		
		if (otros.mkdir()) {
			logger.info("Se ha creado con éxito el directorio " + otros.getName() + ".");
		} else {
			logger.info("No se ha creado el directorio " + otros.getName() + ".");
		}
			
		
		for (int i = 0; i < 5; i++) {
			String fichero = Utilidades.pideDatoCadena("Indica el nombre de un fichero y su extensión: ");
			int indiceExtension = fichero.lastIndexOf('.');
			String extension = fichero.substring(indiceExtension);
			
			if (extension.equals(".gif") || extension.equals(".png") || extension.equals(".jpg")) {
				File nuevoFichero = new File(imagenes, fichero);
				try {
					nuevoFichero.createNewFile();
				} catch (IOException ioe) {
					logger.error("No se ha podido crear el fichero " + nuevoFichero.getName());
				}
			} else if (extension.equals(".txt")) {
				File nuevoFichero = new File(documentos, fichero);
				try {
					nuevoFichero.createNewFile();
				} catch (IOException ioe) {
					logger.error("No se ha podido crear el fichero " + nuevoFichero.getName());
				}
			} else {
				File nuevoFichero = new File(otros, fichero);
				try {
					nuevoFichero.createNewFile();
				} catch (IOException ioe) {
					logger.error("No se ha podido crear el fichero " + nuevoFichero.getName());
				}
			}
		}
		
		File[] todoOtros = otros.listFiles();
		
		for (File archivo : todoOtros) {
			int indiceExtension = archivo.getName().lastIndexOf('.');
			String extension = archivo.getName().substring(indiceExtension);
			String nuevoNombre = "david" + extension;
			archivo.renameTo(new File(otros, nuevoNombre));
		}
	}
}
>>>>>>> refs/remotes/origin/master
