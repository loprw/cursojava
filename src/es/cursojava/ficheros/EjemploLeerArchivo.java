package es.cursojava.ficheros;

import java.io.IOException;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        //String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
    	String nombreArchivo = "./recursos/java3.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo2(nombreArchivo));
        
        try {
        	//System.out.println(servicio.leerArchivo(nombreArchivo));
			System.out.println(servicio.leerArchivo3(nombreArchivo));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
