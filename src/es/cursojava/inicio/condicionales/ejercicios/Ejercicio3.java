package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

/*
 *Ejercicio 3:
 *
 * Pintar menú
 * 1. Pintar Cuadrado.
 * 2. Validar mail.
 * 3. Añadir Alumno.
 * 4. Salir
 * 
 * Elige opción
 * 
 * Se pide por teclado, dependiendo de la opción introducida le indicamos la que ha seleccionado , si selecciona la 4 le decimos "Adiós!" y si no es ninguna que se ha equivocado
 */
public class Ejercicio3 {

	public static void main(String [] args) {
		System.out.println("1. Pintar Cuadrado.\n2. Validar email.\n3. Añadir Alumno.\n4. Salir. ");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIndica una opción: ");
		int opcion = scan.nextInt();
		
		scan.close();
		
		String opcionTexto = "";
		
		
		switch(opcion) {
		case 1 -> opcionTexto = "la opción 1. Pintar Cuadrado.";
		case 2 -> opcionTexto = "la opción 2. Validar email.";
		case 3 -> opcionTexto = "la opción 3. Añadir Alumno.";
		case 4 -> opcionTexto = "la opción 4. Salir.\nAdiós!";
		default -> opcionTexto = "una opción incorrecta.";
		}
		
		System.out.println("Has escogido " + opcionTexto);
	}
}
