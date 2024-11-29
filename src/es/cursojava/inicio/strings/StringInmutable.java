package es.cursojava.inicio.strings;

public class StringInmutable {
	
	public static void main(String [] args) {
		
		String mensaje = "hola";
		//convierte en mayúsculas; en realidad crea otro objeto que pone HOLA que se pierde al no estar referenciado en variable
		mensaje.toUpperCase();
		
		//imprime hola, no HOLA como se esperaba porque es inmutable
		System.out.println(mensaje);
		//aquí directamente pinta el objeto generado, que luego se pierde
		System.out.println(mensaje.toUpperCase());
		
		//ahora, se cambia la variable, se pierde hola al no estar referenciado en variable y sí escribe HOLA
		mensaje = mensaje.toUpperCase();
		System.out.println(mensaje);
		
		
		//Desde aquí hasta el Fin se crean 5 objetos: saludo, saludo reasignado, nombre, concatenación de saludo y nombre,
		//y concatenación de saludo + nombre y qué tal estás?
		String saludo = "hola";
		saludo = saludo.toUpperCase();
		String nombre = "Marta";
				
		System.out.println(mensaje + nombre + "qué tal estás?");
		//Fin
	}
}
