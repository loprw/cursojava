package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 4:
 * Herramienta para calcular el precio de una llamada
 * Cuando se realiza una llamada, el cobro es por el tiempo que esta dura,
 * de tal forma que:
 * +los primeros 5 minutos cuestan 1€,
 * +los siguientes 3 minutos, 80 céntimos,
 * +los siguientes dos minutos, 70 céntimos,
 * +y a partir del décimo minuto, 50 céntimos cada minuto.
 * 
 * Se carga un impuesto del 3% cuando es domingo,
 * y si es otro día,
 * 	en turno de mañana 15% (6-12)
 * 	en turno de tarde 10% (12-23)
 * 	en turno de noche -10% (23-6)
 * 
 * Solicitar tiempo de llamada, día de la semana y hora y calcular el coste de la llamada
 */
public class Ejercicio4 {

	public static void main(String [] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Indique el tiempo de llamada:");
		int tiempoLlamada = scan1.nextInt();
		
		System.out.println("Indique la hora de la llamada");
		int horaLlamada = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Indique día de la semana");
		String diaLlamada = scan2.nextLine();
		
		double coste = 0.0;
		
		switch(tiempoLlamada) {
		case 0 -> System.out.println("Duración de llamada errónea.");
		case 1,2,3,4,5 -> coste = 1;
		case 6,7,8 -> coste = 1.8;
		case 9,10 -> coste = 2.5;
		default-> coste = 2.5 + ((tiempoLlamada - 10) * 0.5);
		}
		
		//Otra forma:
//		if (tiempoLlamada > 0) {
//			coste++;
//		}
//		
//		if (tiempoLlamada > 5) {
//			coste += 0.8;
//		}
//		
//		if (tiempoLlamada > 8) {
//			coste += 0.7;
//		}
//		
//		if (tiempoLlamada > 10) {
//			coste = (tiempoLlamada - 10 ) * 0.5;
//		}
//		
//		if (!diaLlamada.equals("domingo")) {
//			switch(horaLlamada) {
//			case 1,2,3,4,5,6,24 -> {
//				coste *= 0.9;
//				break;
//			}
//			case 7,8,9,10,11,12 -> {
//				coste *= 1.15;
//				break;
//			}
//			case 13,14,15,16,17,18,19,20,21,22,23 -> {
//				coste *= 1.10;
//				break;
//			}
//			}
//		} else {
//			coste *= 1.03;
//		}
//		System.out.println("El coste total de la llamada es " + coste);
//		scan1.close();
//		scan2.close();
		
		double impuesto = 0.0;//si no la inicializo, da error en if/switch anidado pq no hay default
		
		if (!diaLlamada.equalsIgnoreCase("domingo")) {
			switch(horaLlamada) {
			case 1,2,3,4,5,6,24 -> impuesto = coste * -0.1;
			case 7,8,9,10,11,12 -> impuesto = coste * 0.15;
			case 13,14,15,16,17,18,19,20,21,22,23 -> impuesto = coste * 0.10;
			}
		} else {
			impuesto = coste * 0.03;
		}
		System.out.println("El coste total de la llamada es " + (coste + impuesto) +".");
		scan1.close();
		scan2.close();
		
		String textoTernario = (tiempoLlamada == 1) ? " minuto." : " minutos.";
		
		System.out.println("La llamada ha durado " + tiempoLlamada + textoTernario + "\nEl coste sin impuestos es de " + coste + ".\nEl coste con impuestos de " + (coste + impuesto) + ".");
	}
}
