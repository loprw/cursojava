package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;
import java.util.function.Function;

/*
 * Ejercicio Bucles Y Strings

Primera parte

Pintar menu mientras que el usuario no seleccione la opción 4

1. Pintar Cuadrado
2. Validar email
3. Añadir Alumno
4. Salir

Elige una opción


Si el usuario selecciona la opción 1
	+ Vamos a preguntar por el tamaño del cuadrado:
		Ejemplo: 5
		* * * * *
		* * * * *
		*       *
		*       *
		* * * * *
		
Si el usuario selecciona la opción 2
	+ Vamos a preguntar por un email:
		-Debe tener solo una @
		-No puede tener espacios en blanco
		-Después de la @ tiene que haber al menos un punto
		-Entre la @ y el primer punto después de la @ tiene que haber al menos 2 carcateres
		-Después del último punto solo puede haber entre 2 y 6 caracter
		
		
		
 */
public class EjercicioMenu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcion;
		// Creamos una constante que sea la opción de salida para tener un único donde
		// cambiarlo (en caso de que hubiera más)
		final int OPCION_SALIR = 4;
		String eleccion = "Has escogido ";

		do {
			System.out.println("\n1. Pintar Cuadrado.\n2. Validar email.\n3. Añadir Alumno.\n4. Salir\n");
			System.out.print("Escoge una opción: ");
			opcion = scan.nextInt();

			if (opcion == 1) {
				System.out.println("\n" + eleccion + "la opción 1, Pintar Cuadrado.\n");
				System.out.println("Indica el tamaño del cuadrado: ");
				// Pedimos tamaño del cuadrado
				int tamCuadrado = scan.nextInt();
				// Hacemos bucle para dibujar cuadrado, podemos poner fila y columna en vez de i y j
				for (int fila = 0; fila < tamCuadrado; fila++) {
					// Pintamos la primera línea
					for (int columna = 0; columna < tamCuadrado; columna++) {
						if (fila == 0 || fila == tamCuadrado - 1 || columna == 0 || columna == tamCuadrado -1) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					}
					//Forma inicial, es mejor y más sencillo hecho de la forma de arriba
//					if (fila == 0 || fila == tamCuadrado - 1) {
//						for (int columna = 0; columna < tamCuadrado; columna++) {
//							System.out.print("* ");
//						}
//						// Pintamos las líneas entre medias
//					} else {
//						for (int columna = 0; columna < tamCuadrado; columna++) {
//							// Pintamos el primer y el último valor
//							if (columna == 0 || columna == (tamCuadrado - 1)) {
//								System.out.print("* ");
//								// "Pintamos" espacio en blanco entre primer y último valor
//							} else {
//								System.out.print("  ");
//							}
//						}
//					}
					// println puede tener los paréntesis vacíos o con "" para marcar que no escriba
					// nada
					System.out.println();
				}
			} else if (opcion == 2) {
				System.out.println("\n" + eleccion + "la opción 2, Validar email.\n");

				Scanner scan2 = new Scanner(System.in);
				System.out.println("Indique el email a validar:");
				String email = scan2.nextLine();
				

				// Eliminamos los espacios antes y después del texto, no entre medias del mismo
				email = email.trim();
				
				//Forma más corta
				String error = "\n";

				if (email.indexOf("@") != email.lastIndexOf("@")) {
					error += "El mail solo debe contener una  @.\n";
				}

				if (!email.contains("@")) {
					error += "El mail debe contener una @.\n";
				} else {// no tiene sentido mirar si hay un punto después de @ si el mail no tiene @
					if (email.indexOf("@") < email.lastIndexOf(".")) {
						// Una forma más elegante de buscar si después de la @ hay un .
						error += "Tiene que haber un punto después del a @.\n";
					} else {
						String dominio = email.substring(email.indexOf("@") + 1);
						if (dominio.indexOf(".")  < 2) {
							error += "Tiene que haber una serparación de dos o más caracteres entre la @ y el primer punto"
									+ "después de la @.\n";
						}
						
						if (dominio.length() - dominio.lastIndexOf(".") < 2 || dominio.length() - dominio.lastIndexOf(".") > 6) {
							error += "Después del último punto solo puede haber entre 2 y 6 caracteres.\n";
						}
					}
					
				}

				if (email.contains(" ") || email.contains("\t")) {
					error += "Hay un error en el mail, tiene espacio en blanco.\n";
				}
				
				

//				// buscar el índice de una tercera arroba
//				String emailSub = email.substring(email.indexOf("@"), email.lastIndexOf("@"));
//				int indiceTerceraArroba = email.indexOf("@");
//				indiceTerceraArroba += emailSub.indexOf("@");
//				System.out.println("El índice de la tercera @ es " + indiceTerceraArroba);

				// Otra opción, recorriendo todos los caracteres de la cadena
//				int contadorArrobas = 0;
//				for (int i = 0; i < email.length(); i++) {
//					char caracter = email.charAt(i);
//					if (caracter == '@') {
//						contadorArrobas++;
//					}
//				}
//				
//				if (contadorArrobas < 1) {
//					error += "El mail debe contener una @.\n";
//				} else if (contadorArrobas > 1) {
//					error += "El mail no debe tener más de una @.\n";
//				}

				if (error.isBlank()) {
					System.out.println("El mail es correcto.");
				} else {
					System.out.println("El mail es incorrecto por: " + error);
				}

//				// Creamos booleanos para cada condición
//				boolean condicion1 = true;
//				boolean condicion2 = true;
//				boolean condicion3 = true;
//				boolean condicion4 = true;
//				boolean condicion5 = true;
//
//				// Comprobamos que solo haya una @
//				if (email.indexOf("@") != email.lastIndexOf("@")) {
//					condicion1 = false;
//					System.out.println("El mail tiene más de una @.");
//				} else if (!email.contains("@")) {
//					condicion1 = false;
//					System.out.println("El mail no tiene ninguna @.");
//				}
//
//				// Comprobamos que no haya ningún espacio en blanco
//				if (email.contains(" ") || email.contains("\t")) {
//					condicion2 = false;
//					System.out.println("El mail tiene espacios en blanco.");
//				}
//
//				// Comprobamos que entre la arroba y el final al menos hay un punto
//				if (condicion1) {
//					int indiceArroba = email.indexOf("@");
//					String subMail = email.substring(indiceArroba + 1);
//					if (!subMail.contains(".")) {
//						condicion3 = false;
//						System.out.println("El mail no tiene un punto entre la arroba y el final.");
//					}
//				} else {
//					condicion3 = false;
//				}
//
//				// Comprobamos que entre la arroba y el primer punto hay al menos 2 caracteres.
//				// Por si hay un punto antes de la arroba, primero se hace substring de @ a final, y luego de ese otro substring
//				//el índice del primer ".".
//				if (condicion3) {
//					int indiceArroba = email.indexOf("@");
//					String subMail = email.substring(indiceArroba + 1);
//					int indicePunto = subMail.indexOf(".");
//					subMail = subMail.substring(0, indicePunto);
//					if (subMail.length() < 2) {
//						condicion4 = false;
//						System.out.println("El mail no tiene dos caracteres entre la arroba y el primer punto.");
//					}
//				} else {
//					condicion4 = false;
//				}
//
//				int ultimoPunto;
//				String numCarTrasPunto = "";
//
//				if (email.contains(".")) {
//					ultimoPunto = email.lastIndexOf(".");
//					numCarTrasPunto = email.substring(ultimoPunto + 1);
//				}
//
//				if (condicion3) {
//					if (numCarTrasPunto.length() < 2 || numCarTrasPunto.length() > 6) {
//						condicion5 = false;
//						System.out.println("El mail no tiene entre 2 y 6 caracteres tras el último punto.");
//					}
//				} else {
//					condicion5 = false;
//				}
//
//				// Indicamos si el mail es válido o no validando las 5 condiciones
//				if (condicion1 && condicion2 && condicion3 && condicion4 && condicion5) {
//					System.out.println("El email indicado es válido.");
//				} else {
//					System.out.println("El mail indicado no es válido.");
//				}
			} else if (opcion == 3) {
				System.out.println("\n" + eleccion + "la opción 3, Añadir Alumno.\n");
			} else if (opcion == 4) {
				System.out.println("\n" + eleccion + "la opción 4, Salir.\nAdiós!\n");
			} else {
				System.out.println("\n" + eleccion + "una opción incorrecta.");
			}

//			switch(opcion) {
//			case 1 -> System.out.println("\n" + eleccion + "la opción 1, Pintar Cuadrado.\n");
//			case 2 -> System.out.println("\n" + eleccion + "la opción 2, Validar email.\n");
//			case 3 -> System.out.println("\n" + eleccion + "la opción 3, Añadir Alumno.\n");
//			case 4 -> System.out.println("\n" + eleccion + "la opción 4, Salir. Adiós!\n");
//			default -> System.out.println("\n" + eleccion + "una opción incorrecta.");
//			}

		} while (opcion != OPCION_SALIR);
	}
}