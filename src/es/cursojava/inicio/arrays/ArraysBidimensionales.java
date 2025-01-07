package es.cursojava.inicio.arrays;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		int filas = 2;
		int columnas = 6;
		int [][] numeros = new int [filas][columnas];//primer valor declara filas, segundo columnas
		
		for (int fila=0; fila<numeros.length ; fila++) {
			
			for (int columna=0 ; columna < numeros[fila].length   ; columna++) {
				System.out.println("[" + fila + "][" +columna + "]: " + numeros[fila][columna]);
			}
			
		}
		
		for ( int[] fila    :      numeros   ) {//importante int[] fila, que indica que fila es un array unidimensional de enteros.
			for ( int numero   :    fila ) {
				
			}
		}
		
		
		String [] colores = {"Rojo","Amarillo","Verde"};
		for (String string : colores) {
			
		}

		int[][] numeros1 = new int [2][];
		//es válido pq declaras filas y java espera que luego declares las columnas. Si no lo haces (syso numeros[0][0], erro eje.
		
		//System.out.println(numeros[0][0]);//da error, pq no se han declarado el número de columnas, los arrays unidim.
		
		//se pueden declarar filas con distinto tamaño de columnas:
		numeros1[0] = new int[3];//aquí se declara el array unidimensional correspondiente a la fila 0
		numeros1[1] = new int[5];//aquí se declara el array unidimensional correspondiente a la fila 1
		
		//forma de declarar array bidimensional sin declarar luego las columnas distintas:
		
		numeros[1] = new int[4];//permite crear un nuevo array en la fila 1, eliminando cualquier dato asignado anterior.
		
		for (int[] fila: numeros1) {
			for (int numero: fila) {
				System.out.println(numero);
			}
		}
		
		int[][] valores = { {1, 2, 3}, {8, 9, 10, 11, 12} };
	}

}
