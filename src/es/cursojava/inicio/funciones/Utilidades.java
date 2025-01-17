package es.cursojava.inicio.funciones;

import java.util.Scanner;

public class Utilidades {

	public static int pideDatoNumerico(String texto) {
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		scan.close();
		
		return numero;
	}
	
	public static String pideDatoCadena(String dato) {
		
		System.out.println(dato);
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		scan.close();
		
		return texto;
	}
	
	public static void pintaMenu(String[] menuArray) {
//		for (String opcion:menuArray) {
//			System.out.println(opcion);
//		}
//		System.out.println("Introduce una opción:");
		pintaMenu(menuArray, "Introduce una opción:");
	}
	
	public static void pintaMenu(String[] menuArray, String texto) {
		for (String opcion:menuArray) {
			System.out.println(opcion);
		}
		System.out.println(texto);
	}
	
	public static void pintaMenu(String texto) {
		pintaMenu(texto, "Introduce una opción:");
	}
	
	public static void pintaMenu(String texto, String opcion) {
		String[] menuArray = texto.split(" ");
		pintaMenu(menuArray, opcion);
	}
}
