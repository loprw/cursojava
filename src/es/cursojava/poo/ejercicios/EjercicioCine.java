package es.cursojava.poo.ejercicios;

public class EjercicioCine {

	public static void main(String[] args) {
		
		Espectador[][] butacas1 = new Espectador[2][3];
		Sala sala1 = new Sala(1, "Matrix", butacas1);
		
		Espectador[][] butacas2 = new Espectador[2][3];
		Sala sala2 = new Sala(2, "Yo, Robot", butacas2);
		
		Espectador[][] butacas3 = new Espectador[2][3];
		Sala sala3 = new Sala(3, "Desperado", butacas3);
		
		Sala[] salas = {sala1, sala2, sala3};
		Cine cine1 = new Cine("Cabinas Insonorizadas, Nadie Espoilea", salas);

		
		Espectador espectador1 = new Espectador("Neo", "987654321Z");
		Espectador espectador2 = new Espectador("Luisa", "123456789A");
		Espectador espectador3 = new Espectador("Melanie", "123987465G");
		
		espectador1.irCine(cine1, espectador1);
		espectador2.irCine(cine1, espectador2);
		espectador3.irCine(cine1, espectador3);
		
		cine1.mostrarOcupacion();
		}
}
