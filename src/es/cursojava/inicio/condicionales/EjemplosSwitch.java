package es.cursojava.inicio.condicionales;

public class EjemplosSwitch {

	public static void main(String [] args) {
		
		int nota = 9;
		
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("Suspenso"); break;
		case 5: System.out.println("Aprobado"); break;
		case 6:
		case 7: System.out.println("Notable"); break;
		case 8:
		case 9: System.out.println("Sobresaliente"); break;
		case 10:
		default: System.out.println("Nota incorrecta");
		}
		
		//Desde versión 14:
		switch(nota) {
			case 0,1,2,3,4 -> {
				System.out.println("Suspenso");
				break;
			}
			case 5,6 -> {
				System.out.println("Aprobado");
				break;
			}
			case 7,8 -> {
				System.out.println("Notable");
				break;
			}
			case 9,10 -> {
				System.out.println("Sobresaliente");
				break;
			}
		}
	}
}
