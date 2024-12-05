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
		
		for (int i = 0; i < numeros.length; i++) {
			totalNumeros += numeros[i];
		}
		
		int media = totalNumeros / numeros.length;
		System.out.println(media);
		
		int numMayor = 0;
		int numMenor = 1000000000;
		
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
