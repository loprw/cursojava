package es.cursojava.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ESTUDIANTE")
public class Estudiante {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "carnet_id")
	private CarnetBiblioteca carnet;

	public Estudiante(String nombre, String apellidos, CarnetBiblioteca carnet) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.carnet = carnet;
	}

	public Estudiante() {
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public CarnetBiblioteca getCarnet() {
		return carnet;
	}

	public void setCarnet(CarnetBiblioteca carnet) {
		this.carnet = carnet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estudiante [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", carnet=");
		builder.append(carnet);
		builder.append("]");
		return builder.toString();
	}
}
