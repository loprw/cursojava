package es.cursojava.poo.herencia;

public class Zoologico {
	 
	public static void main(String[] args) {
	        Zoologico zoo = new Zoologico();
	        zoo.abrirZoo();
	    }

	    private void abrirZoo(){
	        Leon leon = new Leon("Mufasa",190, true);
	        leon.cazar();
	        leon.comer();
	        leon.beber();

	        Vaca vaca = new Vaca("Lola", 200, 0);
	        vaca.mugir();
	        vaca.comer();

	        Animal vaca1 = new Vaca("MuuuVaca", 200, 2);
	        vaca1.comer();
	        //vaca1.mugir();//No se puede la clase Animal no tiene el mugir

	        //Animal leon1 = new Leon("Asdas",9, true);

	        Vaca vaca2 = (Vaca)vaca1;
	        vaca2.mugir();
	    }

}
