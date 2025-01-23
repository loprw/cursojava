package es.cursojava.poo.ejercicios;

public class Tienda {

	public static void main(String[] args) {
		
		Boton boton1 = new Boton("rojo", "diminuto","redondo");
		Boton boton2 = new Boton("azul", "enorme","cuadrado");
		Boton boton3 = new Boton("amarillo", "grande","rectangular");
		Boton boton4 = new Boton("verde", "normal","hexagonal");
		
		Boton[] botones = {boton1, boton2, boton3};
		
		Pantalon pantalon = new Pantalon("negro", 15, "XL", boton4);
		Camisa camisa = new Camisa("blanca", 9, "L", botones);
		Vestido vestido = new Vestido("naranja", 12, "M");
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2, pantalon, camisa);
		Maniqui maniqui3 = new Maniqui(3, vestido);

	}
}
