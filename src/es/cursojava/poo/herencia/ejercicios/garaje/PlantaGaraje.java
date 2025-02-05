package es.cursojava.poo.herencia.ejercicios.garaje;

public class PlantaGaraje {

	private int altura;
	private Coche[] plazasCoches;
	private Camion[] plazasCamiones;
	private Motocicleta[] plazasMotos;
	
	public PlantaGaraje(int altura, Coche[] plazasCoches, Camion[] plazasCamiones, Motocicleta[] plazasMotos) {
		this.altura = altura;
		this.plazasCoches = plazasCoches;
		this.plazasCamiones = plazasCamiones;
		this.plazasMotos = plazasMotos;
	}
	
	public PlantaGaraje(int altura, Coche[] plazasCoches) {
		this.altura = altura;
		this.plazasCoches = plazasCoches;
	}
	
	public PlantaGaraje(int altura, Camion[] plazasCamiones) {
		this.altura = altura;
		this.plazasCamiones = plazasCamiones;
	}
	
	public PlantaGaraje(int altura, Motocicleta[] plazasMotos) {
		this.altura = altura;
		this.plazasMotos = plazasMotos;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public Coche[] getPlazasCoches() {
		return plazasCoches;
	}

	public void setPlazasCoches(Coche[] plazasCoches) {
		this.plazasCoches = plazasCoches;
	}

	public Camion[] getPlazasCamiones() {
		return plazasCamiones;
	}

	public void setPlazasCamiones(Camion[] plazasCamiones) {
		this.plazasCamiones = plazasCamiones;
	}

	public Motocicleta[] getPlazasMotos() {
		return plazasMotos;
	}

	public void setPlazasMotos(Motocicleta[] plazasMotos) {
		this.plazasMotos = plazasMotos;
	}
	
	public int[] calcularPlazas() {
		
		int numPlazasCoche = 0;
		int numPlazasCamion = 0;
		int numPlazasMoto = 0;
		
		for (Coche coche:plazasCoches) {
			if (coche == null) {
				numPlazasCoche++;
			}
		}
		
		for (Camion camion:plazasCamiones) {
			if (camion == null) {
				numPlazasCamion++;
			}
		}
		
		for (Motocicleta moto:plazasMotos) {
			if (moto == null) {
				numPlazasMoto++;
			}
		}
		
		int[] plazas = {numPlazasCoche, numPlazasCamion, numPlazasMoto};
		
		return plazas;
	}
}
