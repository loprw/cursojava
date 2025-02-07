package es.cursojava.poo.herencia.ejercicios.garaje;

import es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable.Apagable;
import es.cursojava.poo.herencia.interfaces.ejercicios.encendibleyapagable.Encendible;

public abstract class VehiculoMotorizado extends Vehiculo implements Apagable, Encendible{

	private String motor;
	
	public VehiculoMotorizado(String marca, String modelo, int any, int velocidadMaxima, String tipo, String motor) {
		super(marca, modelo, any, velocidadMaxima, tipo);
		this.motor = motor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
}
