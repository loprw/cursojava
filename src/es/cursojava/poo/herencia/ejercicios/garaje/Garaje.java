package es.cursojava.poo.herencia.ejercicios.garaje;

public class Garaje {

	private String nombre;
	private PlantaGaraje[] plantas;
	
	public Garaje(String nombre, PlantaGaraje[] plantas) {
		this.nombre = nombre;
		this.plantas = plantas;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public PlantaGaraje[] getPlantas() {
		return plantas;
	}

	public void setPlantas(PlantaGaraje[] plantas) {
		this.plantas = plantas;
	}

	public void aparcar(Vehiculo[] vehiculos) {
		
		for (Vehiculo vehiculo: vehiculos) {
			
		}
	}
}
