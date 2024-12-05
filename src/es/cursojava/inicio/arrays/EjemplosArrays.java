package es.cursojava.inicio.arrays;

public class EjemplosArrays {

	public static void main(String[] args) {
		
		//Para definir un array, se indica tipo (primitivo u objeto), corchete, nombre variable, igual, new, tipo de nuevo,
		//corchetes y entre ellos el tamaño del array
		int[] numeros = new int[6];//los corchetes se pueden poner después del nombre de la variable
		
		//Para recoger el valor de un dato en una posición de un array, es varibale[posicion] 
		System.out.println(numeros[0]);//Indica 0, pq al ser tipo primitivo se inicializa por defecto
		System.out.println(numeros[5]);//Indica 0, pq al ser tipo primitivo se inicializa por defecto
		
		//Asignar un valor a una posición, variable[posicion] = valor. Esto modifica el valor anterior.
		numeros[1] = 8;
		System.out.println(numeros[1]);//valor 8
		
		//si asignamos o pedimos un valor fuera del tamaño del array, Java lanza una Excepcion

		System.out.println("==================================");// Separador

		String[] colores = new String[4];
		colores[0] = "Verde";
		colores[1] = "Azul";
		colores[2] = "Rojo";
		colores[3] = "Naranja";
		
		//Tb se pueden declarar e inicializar los arrays en una línea
		String[] colores2 = {"Blanco", "Negro"};//directamente va a tener tamaño 2.

		// Bucle for each, for (variable declarada: elemento a recorrer){}; donde la
		// variable declarada debe coincidir con
		// el tipo que almacena el array
		for (String color : colores) {
			// Color va recibiendo los datos de colores, como en Python (for i in colores:),
			// lo que es iterado en el for each
			// Siempre recorre todo el. Si queremos acceder o saber a una posición
			// determinada, es mejor el for.
			System.out.println(color);
		}
	}
}
