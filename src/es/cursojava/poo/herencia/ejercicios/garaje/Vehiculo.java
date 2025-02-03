package es.cursojava.poo.herencia.ejercicios.garaje;

public class Vehiculo {

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
	
	public void mostrarInformacion() {
		
		System.out.println("Los datos del vehículo son:");
		System.out.println("\tMarca: " + this.marca);
		System.out.println("\tModelo: " + this.modelo);
		System.out.println("\tAño: " + this.any);
		System.out.println("\tVelocidad Máxima: " + this.velocidadMaxima);
		System.out.println("\tTipo de combustible: " + this.tipo);
		
	}
	
	public double calcularImpuesto() {
		
		double impuesto = 200;
		double modificadorAny = 0;
		double modificadorTipo = 0;
		double modificadorClase = 0;
		
		if (2025 - getAny() >= 20) {
			modificadorAny = impuesto * 0.1;
		} else if (2025 - getAny() >= 10) {
			modificadorAny = impuesto * 0.05;
		} else {
			modificadorAny = 0;
		}
		
		switch (getTipo()) {
			case "Gasolina", "Diesel" -> modificadorTipo = impuesto *  0.1;
			case "Híbrido" -> modificadorTipo = -(impuesto * 0.05);
			case "Eléctrico" -> modificadorTipo = -(impuesto * 0.1);
			default -> modificadorTipo = 0;
		}
		
		if (this.getClass().getName().equals("es.cursojava.poo.herencia.ejercicios.Camion")) {
			modificadorClase = impuesto * 0.1;
		}
		
		if (this.getClass().getName().equals("es.cursojava.poo.herencia.ejercicios.Coche")) {
			modificadorClase = impuesto * 0.05;
		}
		
		if (this.getClass().getName().equals("es.cursojava.poo.herencia.ejercicios.Motocicleta")) {
			modificadorClase = -(impuesto * 0.05);
		}
		
		impuesto = impuesto + modificadorAny + modificadorTipo + modificadorClase;
		
		return impuesto;
	}
}
