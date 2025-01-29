package es.cursojava.poo.ejercicios;

public class EjercicioCine {

	public static void main(String[] args) {
	
		EjercicioCine cine = new EjercicioCine();
		
		cine.arrancarCine();
	}
	
	private void arrancarCine() {
		Sala[] salas = UtilidadesCine.obtenerSalas();
		Cine cine1 = new Cine("Cabinas Insonorizadas, Nadie Espoilea", salas);

		Espectador[] espectadores = UtilidadesCine.obtenerEspectadores();

		for (Espectador espectador : espectadores) {
			
			espectador.irCine(cine1);
		}
		
		cine1.mostrarOcupacion();
	}
}
