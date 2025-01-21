package es.cursojava.poo;

public class PruebaPersona {

	public static void main(String[] args) {

		// Llamada al constructor por defecto o al constructor vacío, en caso de tener más constructores
		Persona persona0 = new Persona();
		
		System.out.println(persona0.getPeso());
		System.out.println(persona0.getNombre());
		persona0.setNombre("Nombre1");
		persona0.setPeso(70.5);
		System.out.println(persona0.getPeso());
		System.out.println(persona0.getNombre());
		persona0.correr();

		Persona persona1 = new Persona();
		persona1.setNombre("Nombre2");
		persona1 = persona0;
		persona0.setNombre("Nombre3");
		persona1.setPeso(50);
		persona1.correr();
		
		// Imprimen lo mismo, Nombre3. Pq las variables persona0 y persona1
		// apuntan al mismo objeto (que no vemos, pero está en memoria), y sus
		// características son las mismas otras características de tipo String
		// (como dni y Apellidos) son null por la misma razón: son variables de
		// tipo String (objetos) que no señalan a ningún objeto.
		System.out.println(persona1.getNombre());
		System.out.println(persona0.getNombre());
		
		//llamamos al constructor completo
		Persona persona2 = new Persona ("N2", "A2", "2A", 40);
		System.out.println(persona2.getNombre());
		persona2.correr();
		
		//llamamos a un constructor parcial
		Persona persona4 = new Persona ("N4", "A4", "24");
		System.out.println(persona4.getNombre());
	}
}