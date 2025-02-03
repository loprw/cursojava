package es.cursojava.poo.herencia.ejercicios.garaje;

public class PlantaGaraje {

	private int altura;
	private int plazasCoches;
	private int plazasCamiones;
	private int plazasMotos;
	
	public PlantaGaraje(int altura, int plazasCoches, int plazasCamiones, int plazasMotos) {
		this.altura = altura;
		this.plazasCoches = plazasCoches;
		this.plazasCamiones = plazasCamiones;
		this.plazasMotos = plazasMotos;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getPlazasCoches() {
		return plazasCoches;
	}

	public void setPlazasCoches(int plazasCoches) {
		this.plazasCoches = plazasCoches;
	}

	public int getPlazasCamiones() {
		return plazasCamiones;
	}

	public void setPlazasCamiones(int plazasCamiones) {
		this.plazasCamiones = plazasCamiones;
	}

	public int getPlazasMotos() {
		return plazasMotos;
	}

	public void setPlazasMotos(int plazasMotos) {
		this.plazasMotos = plazasMotos;
	}
}
