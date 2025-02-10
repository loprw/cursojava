package es.cursojava.poo.herencia.ejercicios.garaje;

import java.time.LocalDate;

import es.cursojava.poo.herencia.interfaces.ejercicios.cuid.Consultable;

public abstract class Vehiculo implements Consultable {

	private String marca;
	private String modelo;
	private int any;
	private int velocidadMaxima;
	private String tipo;
	
	public Vehiculo(String marca, String modelo, int any, int velocidadMaxima, String tipo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.any = any;
		this.velocidadMaxima = velocidadMaxima;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tmarca=");
		builder.append(marca);
		builder.append("\n\tmodelo=");
		builder.append(modelo);
		builder.append("\n\taño=");
		builder.append(any);
		builder.append("\n\tvelocidadMaxima=");
		builder.append(velocidadMaxima);
		builder.append("\n\ttipo=");
		builder.append(tipo);

		return builder.toString();
	}

	public void mostrarInformacion() {
		
		System.out.println(toString());
		
	}
	
	public double calcularImpuesto() {
		
		double impuestoBase = 200;
		double impuesto = 1;
		int anyActual = LocalDate.now().getYear();
		
		if (anyActual >= 20) {
			impuesto += 0.1;
		} else if (anyActual >= 10) {
			impuesto += 0.05;
		}
		
		switch (getTipo()) {
			case "Gasolina", "Diesel" -> impuesto += 0.1;
			case "Híbrido" -> impuesto -= 0.05;
			case "Eléctrico" -> impuesto -= 0.1;
			default -> impuesto += 0;
		}
		
		if (this instanceof Camion) {
			impuesto += 0.1;
		} else if (this instanceof Coche) {
			impuesto += 0.05;
		} else if (this instanceof Motocicleta) {
			impuesto -= 0.05;
		}
		
		impuesto *= impuestoBase;
		
		return impuesto;
	}
	
	public abstract void acelerar();
}
