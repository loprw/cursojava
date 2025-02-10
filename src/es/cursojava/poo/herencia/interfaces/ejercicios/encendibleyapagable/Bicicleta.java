package es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable;

import es.cursojava.poo.herencia.ejercicios.garaje.Vehiculo;
import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Insertable;
import lombok.Getter;
import lombok.Setter;

public class Bicicleta extends Vehiculo implements Insertable {
	
	@Getter
	@Setter
	private int numMarchas;
	
	public Bicicleta(String marca, String modelo, int any, int velocidadMaxima, String tipo, int numMarchas) {
		super(marca,modelo, any, velocidadMaxima, tipo);
		this.numMarchas = numMarchas;
	}

	@Override
	public void acelerar() {
	}
	
	@Override
	public void select() {
		System.out.println("Consultando " + getMarca() + " " + getModelo());
	}
	
	@Override
	public void insert() {
		System.out.println("Insertando en " + getMarca() + " " + getModelo());
	}
}
