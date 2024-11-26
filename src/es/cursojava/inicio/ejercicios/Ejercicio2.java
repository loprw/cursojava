package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 2: Comparar 2 números
 * Escribe un programa que:
 * 1- Tenga un valor para un número y otro valor para otro número.
 * 2- Compare si el primer número es mayor, igual o igual al segundo.
 * 3- Muestre el resultado en pantalla.
 */


public class Ejercicio2 {

	public static void main(String [] args) {
		
		//edad = input("Introduce tu edad") es en Python
		
		//En Java xD
//		Scanner scan = new Scanner(System.in);//instancia variable objeto Scanner.
//		System.out.println("Introduce tu edad");//pides el dato, porque si no no aparece nada en consola y parece que se ha detenido el programa
//		int edad = scan.nextInt();//asignas el valor capturado a una variable con el tipo necesario
//		System.out.println(edad);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num1 = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Introduce otro número entero");
		int num2 = scan2.nextInt();
//		int num1 = 7;//Indico un primer número
//		int num2 = 5;//Indico un segundo número
		boolean esMayor = num1 > num2;//Comparo si el primer número es mayor que el segundo
		boolean esMenor = num1 < num2;//Comparo si el primer número es menor que el segundo
		boolean sonIguales = num1 == num2;//Comparo si ambos número son iguales
		
		System.out.println("¿El número 1 es mayor que el número 2? " + esMayor);//Pinto si el número 1 es mayor que el número 2
		System.out.println("¿El número 1 es menor que el número 2? " + esMenor);//Pinto si el número 1 es menor que el número 2
		System.out.println("¿Son iguales el número 1 y el número 2? " + sonIguales);//Pinto si ambos son iguales
		System.out.println("¿Son iguales el número 1 y el número 2? " + (num1<num2));//si no se pone así, el comparador da error porque mezclamos string con boolean
		
		scan1.close();//borra de memoria scan1, útil cuando programa está siempre activo para liberar memoria
		scan2.close();
	}

}