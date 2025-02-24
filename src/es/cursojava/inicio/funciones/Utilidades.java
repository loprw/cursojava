package es.cursojava.inicio.funciones;

import java.util.Scanner;

public class Utilidades {

	public static int pideDatoNumerico(String texto) {

		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();

		return numero;
	}
	
	public static double pideDatoDouble(String texto) {

		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextDouble();

		return numero;
	}

	public static String pideDatoCadena(String dato) {

		System.out.println(dato);
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();

		return texto;
	}

	/**
	 * Función que sirve para pintar las opciones de un menú que llegan en un array
	 * de Strings.
	 * 
	 * @param menuArray Array Strings con las opciones del menú.
	 * @author Loprw
	 */
	public static void pintaMenu(String[] menuArray) {
//		for (String opcion:menuArray) {
//			System.out.println(opcion);
//		}
//		System.out.println("Introduce una opción:");
		pintaMenu(menuArray, "Introduce una opción:");
	}

	/**
	 * Función que sirve para pintar las opciones de un menú que llegan en un array
	 * de Strings y un String que indica un mensaje a pasar.
	 * 
	 * @param menuArray Array Strings con las opciones del menú.
	 * @param texto     String con el mensaje a pedir tras pintar el menú.
	 * @author Loprw
	 */
	public static void pintaMenu(String[] menuArray, String texto) {
		for (String opcion : menuArray) {
			System.out.println(opcion);
		}
		System.out.println(texto);
	}

	/**
	 * Función que sirve para pintar las opciones de un menú que llegan en un
	 * String.
	 * 
	 * @param texto String con las opciones del menú.
	 * @author Loprw
	 */
	public static void pintaMenu(String texto) {
		pintaMenu(texto, "Introduce una opción:");
	}

	/**
	 * Función que sirve para pintar las opciones de un menú que llegan en un String
	 * (separadas por el caracter ";" y un String que indica un mensaje a pasar.
	 * 
	 * @param texto  String con las opciones del menú, que deben estar separadas por
	 *               el caracter ";".
	 * @param opcion String con el mensaje a pedir tras pintar el menú.
	 * @author Loprw
	 */
	public static void pintaMenu(String texto, String opcion) {
		String[] menuArray = texto.split(";");
		pintaMenu(menuArray, opcion);
	}
}
