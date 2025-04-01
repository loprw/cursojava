package es.cursojava.entities;

import org.hibernate.annotations.Check;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CABALLOS")
public class CaballoCarrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true, length = 50)
	private String nombre;
	
	@Column(nullable = false)
	//@Check(constraints = "edad IN (2, 30)")
	private int edad;
	
	@Column(nullable = false, length = 4)
	//@Check(constraints = "velocidad IN (30.0, 80.0")
	private double velocidadMaxima;
	
	@Column
	//@Check(constraints = "numeroTriunfos >= 0")
	private int numeroTriunfos;
	
	@Column
	//@Check(constraints = "experiencia IN (0.0, 10.0")
	private double experiencia;
	
	@Column
	private boolean estaActivo;

	public CaballoCarrera(String nombre, int edad, double velocidadMaxima, int numeroTriunfos, double experiencia,
			boolean estaActivo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.numeroTriunfos = numeroTriunfos;
		this.experiencia = experiencia;
		this.estaActivo = estaActivo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getNumeroTriunfos() {
		return numeroTriunfos;
	}

	public void setNumeroTriunfos(int numeroTriunfos) {
		this.numeroTriunfos = numeroTriunfos;
	}

	public double getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}

	public boolean isEstaActivo() {
		return estaActivo;
	}

	public void setEstaActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CaballoCarrera [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", velocidadMaxima=");
		builder.append(velocidadMaxima);
		builder.append(", numeroTriunfos=");
		builder.append(numeroTriunfos);
		builder.append(", experiencia=");
		builder.append(experiencia);
		builder.append(", estaActivo=");
		builder.append(estaActivo);
		builder.append("]");
		return builder.toString();
	}
}
