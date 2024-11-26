package es.cursojava.inicio.condicionales;

public class EjemplosIf {

	public static void main(String [] args) {
		System.out.println("Empieza");
		double numero = Math.random();
		System.out.println(numero);
		
		if (numero > 0.7) {
			System.out.println("El número es mayor de 0.7");
		} else if (numero > 0.5) {
			System.out.println("El número es menoro o igual a 0.7 y mayor de 0.5");
		} else {
			System.out.println("El número es menor o igual a 0.5");
		}
		
		System.out.println("Termina");
	}
}