package es.cursojava.inicio.strings;

public class MetodosString {

	public static void main(String[] args) {
		
		//Veremos funciones/métodos de String.
		String mensaje = "Hola qué tal?";
		
		//charAt(posición), toma el carácter en la posición 0 (la primera) y la asigna en la variable character de tipo char.
		//si se pide una posición que no existe, nos da una excepción
		char character = mensaje.charAt(0);
		System.out.println(character); //pinta 0
		
		//.contains(String), indica si es verdad que el objeto String contiene el String indicado
		System.out.println(mensaje.contains("hola"));//false, sensitive case
		
		//.endsWith(String), indica si es verdad que el objeto String acaba con el String indicado
		System.out.println(mensaje.endsWith("?"));//true, sensitive case
		
		//.startsWith(String), indica si es verdad que el objeto String empieza con el String indicado
		System.out.println(mensaje.startsWith("Hola"));//true, sensitive case
		
		//.equals(String) y .equalsIgnoreCase ya estudiados.
		
		//.indexOf(String), devuelve la posición de la primera coincidencia con el String indicado, de izq a dcha
		System.out.println(mensaje.indexOf("a"));//3, pq empieza de izq a dcha
		
		//.lastIndex(String), devuelve la posición de la primera coincidencia con el String indicado, de dcha a izq
		System.out.println(mensaje.lastIndexOf("a"));//10, pq empieza a mitar de izq a decha
		
		//si en estos dos últimos métodos se pide un String que no está presente en el objeto String, devuelve -1
		
		//.isBlank() y .isEmpty(), nos indica si el String está en blanco (espacios sin texto o vacío) o vacío ("")
		String msg2 = "     ";
		System.out.println(msg2.isBlank());//true, porque solo tiene espacios en blanco o vacío
		System.out.println(msg2.isEmpty());//false, pq no está vacío ("").
		
		//.trim(), elimina los espacios en blanco a izq y dcha de un carácter: los elimina desde inicio y final hasta que encuentra
		//un carácter
		mensaje = "     Hola qué tal?      ";
		System.out.println(mensaje.trim());//pinta Hola que tal
		System.out.println(mensaje);//pinta      Hola que tal     (final)
		
		//.length(),  indica el total de caracteres que tenga el objeto String, contando los espacios
		String men = msg2.trim();
		System.out.println(msg2);//5, espacios
		System.out.println(men);//0, está vacío
		
		//.toLowerCase() y .toUpperCase(), convierte el objeto String en minúsculas o mayúsculas
		mensaje = mensaje.trim();
		System.out.println(mensaje.toLowerCase());//hola qué tal?
		System.out.println(mensaje.toUpperCase());//HOLA QUÉ TAL?	
		
		
		//.substring(int1[, int2]), se crea una subcadena desde el objeto String, desde la posición int1 hasta el final (sin [])
		//o hasta int2 (sin incluir int2)
		System.out.println(mensaje.substring(5));//desde "q" hasta el final
		System.out.println(mensaje.substring(4,8));//desde el primer " " hasta la posición 8 - 1: el segundo " "
	}
}
