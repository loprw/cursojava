package es.cursojava.inicio.bucles;

public class BucleDoWhile {
	
	public static void main(String [] args) {
		
		//siempre se ejecuta el do la primera vez
		int num = 3;
		int edad = 0;
		do {
			System.out.println("Hola " + num + " - " + edad);
			num++;
			edad = 21;
			edad--;
		} while (12 > num || edad < 18);//edad nunca llega a 18, pq siempre se iguala a 21 y luego se resta 1
		System.out.println("Termina");
	}

}
