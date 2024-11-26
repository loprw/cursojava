package es.cursojava.inicio;

public class OperadoresLogicos {

	public static void main(String [] args) {
		int num1 = 5;
		int num2 = 10;
		
		//>, >=, <, <=, ==, !=, !(opuesto del boolean resultante)
		boolean comparador = num1 != num2;
		System.out.println(!comparador);
		
		//&& (doble ampersand) and ( y ), si evalúa la primera sentencia y es falsa, no evalúa la segunda. Con un & evalúa ambas.
		//||(doble pipe) or ( o ), si evalúa la primera sentencia y es verdadera, no evalúa la segunda. Con un | evalúa ambas.
		//resolución de izq a derecha, los paréntesis cambian la prioridad
//		boolean comparador2 = num1 != num2 && num2 % 2 == 0;
//		System.out.println(comparador2);
		boolean comparador2 = num1 != num2 && esPar(num2);
		System.out.println(comparador2);

		//boolean comparador3 = num1 < 7 && num2 > 10 && num1 > num2;
		boolean comparador3 = num1 < 7 && !(num2 > 10 && num1 > num2);//El valor de arriba es false, este es true, por paréntesis.
		System.out.println(comparador3);
	}
	
	private static boolean esPar( int numero) {
		System.out.println("Entra " + numero);
		return numero%2 == 0;
	}
}
