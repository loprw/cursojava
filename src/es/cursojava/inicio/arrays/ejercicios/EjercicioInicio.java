package es.cursojava.inicio.arrays.ejercicios;

/*
 * Hacemos un array de Strings donde asignamos 4 colores, luego los asignamos y los pintamos.
 */
public class EjercicioInicio {

	public static void main(String[] args) {
		
		String[] colores = new String[4];
		colores[0] = "Verde";
		colores[1] = "Azul";
		colores[2] = "Rojo";
		colores[3] = "Naranja";
		
		//Aquí, el .length no es un método si no un atributo del array. Veremos lo que es un atributo más tarde.
		for (int i = 0; i < colores.length; i++) {
			System.out.println(colores[i]);
		}
	}

}
