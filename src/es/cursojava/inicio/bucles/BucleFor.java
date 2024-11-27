package es.cursojava.inicio.bucles;

public class BucleFor {

	public static void main(String[] args) {
		
		//for (variable;condición;acumulador){}
		
		//forma más correcta, se hacen 5 iteraciones
		for (int i = 2; i <= 10; i += 2) {
			
			//pintar solo resultados pares
			System.out.println("5 x " + i + " = " + (5 * i));
		}
		
		//forma menos correcta, se hacen 10 iteraciones 
		for (int i = 1; i <= 10; i++) {
			
			//pintar solo resultados pares
			int resultado = 5 + i;
			if (resultado % 2 == 0) {
				System.out.println("5 x " + i + " = " + resultado);
			}
		}
		
		//Instrucción continue, pasa a la siguiente iteración directamente, sin ejecutar nada más después de él
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Entra " + i);
			if(i % 2 == 0) {
				continue;
			}
			//esto solo lo pinta si el if no se cumple, porque el continue no le afecta
			System.out.println("Pasa");
			System.out.println(i);
		}
		
		//Instrucción break, rompe el bucle
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Entra " + i);
			if(i % 2 != 0) {
				break;
			}
			//esto solo lo pinta si el if no se cumple, porque el break no le afecta
			System.out.println("Pasa");
			System.out.println(i);
		}
	}
}