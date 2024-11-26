package es.cursojava.inicio;

public class VariablesJava {
	//Variables Variables de instancia
	public static void main(String[] args) {
		//Variables locales
		
		//Tipos primitivos
		//Números enteros
		byte numeroPequenyo = 1;//-128 a 127
		short numeroMediano = 100;//-32.768 a 32.767
		int numero = 9;//-2^31 y 2^31 - 1
		long numeroMuyGrande = 1000;//-2^63 a 2^63 - 1
		//Numeros decimales
		double numeroDecimal = 9.7;
		float numeroDecimal2 = 20.8f;//si valor puede ser double, da error si no se pone "f" al final	
		//Caracteres
		char caracter = ' ';//solo admite un valor, como 1 o e; no dos o más, como 12 o era
		//Boolean
		boolean esPar = false;//solo admite como valor true o false
		
		//Variables de tipo objeto y arrays
		String nombre = "David Juan";//Objeto
		int [] numeros = {0,1,2,3};//Array
		
		//Declarar variables
		//Tipo --> el tipo de información que almacena
		//nombre --> nombre de la variable
		byte edad; //Declarar una variable
		edad = 9;//Inicializar una variable, no es necesario volver a tipar
		byte edadDavid = 41;//Declarar e inicializar una variable
		
		System.out.println(nombre + " " + edadDavid + 30);//David Juan 1830, pq no suma texto y numero y castea num a texto.
		System.out.println(nombre + " " + (edadDavid + 30));//los paréntesis le dan prioridad a la suma de enteros
		System.out.println("Mi nombre es " + nombre + " y tengo " + edadDavid + " años.");
	}
}
