package es.cursojava.inicio.bucles.ejercicios;

/*
 * Ejercicio 3
 * 2. Mostrar los pares del 2 al 100 y al mismo tiempo los impares del 99 al 1
 * 2-99
 * 4-97
 * 6-95
 */
public class Ejercicio3 {

	public static void main(String[] args) {
//		
//		int numPar = 2;
//		int numImpar = 99;
//		while (numPar <= 100 && numImpar >= 0) {
//			System.out.println(numPar + "-" + numImpar);
//			numPar += 2;
//			numImpar -= 2;
//		}
//		
		//forma de hacerlo con for, usando 2 variables en el bucle; menos líneas, el "y" de la condición, aquí, innecesario
		for (int i= 2, j = 99; i <= 100 && j >= 1; i += 2, j -= 2) {
			System.out.println(i + "-" + j);
		}
	}
}