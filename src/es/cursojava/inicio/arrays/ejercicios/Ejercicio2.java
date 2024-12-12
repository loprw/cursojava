package es.cursojava.inicio.arrays.ejercicios;


/*
 * Ejercicio 2
 * Meter los valores 4,8,15,16,23,42 en un array
 * Mostrar todos los números
 * Mostrar la media de los valores
 * Mostrar el número mayor
 * Mostrar el número menor
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 15, 16, 23, 42};
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		int totalNumeros = 0;
		
		//Más rápido
		for (int numero: numeros) {
			totalNumeros += numero;
		}
		
//		for (int i = 0; i < numeros.length; i++) {
//			totalNumeros += numeros[i];
//		}
		
		int media = totalNumeros / numeros.length;
		System.out.println("La media de los números es " + media);
		
		int numMayor = 0;//o Intefer.MIN_VALUE;
		//mejor meter el primer valor del array
		int numMenor = numeros[0];// o Integer.MAX_VALUE o un valor muy elevado 1000000000;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > numMayor) {
				numMayor = numeros[i];
			}
			
			if (numeros[i] < numMenor) {
				numMenor = numeros[i];
			}
		}
		System.out.println("El número mayor del array es " + numMayor);
		System.out.println("El número menor del array es " + numMenor);
	}

}
