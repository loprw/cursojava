package es.cursojava.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "TB_CABALLOS")
public class CaballoCarrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, unique = true, length = 50)
	private String nombre;
	
	@Column(name = "edad", nullable = false, columnDefinition = "int check (edad>=2 and edad<=30) ")
	@Min(value = 2)
	@Max(value = 30)
	private int edad;
	
	@Column(name = "velocidad máxima", nullable = false, length = 4)
	@DecimalMin(value = "30.0")
	@DecimalMax(value = "80.0")
	private double velocidadMaxima;
	
	@Column(name = "triunfos")
	@Min(value = 0)
	private int numeroTriunfos;
	
	@Column(name = "experiencia")
	@DecimalMin(value = "0.0")
	@DecimalMax(value = "10.0")
	private double experiencia;
	
	@Column(name = "activo")
	private boolean estaActivo;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_JINETE")
	private Jinete jinete;
	
	public CaballoCarrera() {
		
	}

	public CaballoCarrera(String nombre, int edad, double velocidadMaxima, int numeroTriunfos, double experiencia,
			boolean estaActivo) {
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.numeroTriunfos = numeroTriunfos;
		this.experiencia = experiencia;
		this.estaActivo = estaActivo;
	}
	
	public CaballoCarrera(String nombre, int edad, double velocidadMaxima, int numeroTriunfos, double experiencia,
			boolean estaActivo, Jinete jinete) {
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.numeroTriunfos = numeroTriunfos;
		this.experiencia = experiencia;
		this.estaActivo = estaActivo;
		this.jinete = jinete;
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

	public Jinete getJinete() {
		return jinete;
	}

	public void setJinete(Jinete jinete) {
		this.jinete = jinete;
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
