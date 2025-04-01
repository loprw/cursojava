package es.cursojava.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "TB_PERSONAS")

public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    // AUTO:	Delega la estrategia al proveedor JPA (Hibernate decide según la BBDD).
    // IDENTITY:	Usa una columna auto-incremental. Funciona bien con MySQL, SQL Server, Oracle 12c+…
    // SEQUENCE:	 Usa una secuencia de base de datos (muy común en Oracle, PostgreSQL, etc.).
    // TABLE: Usa una tabla especial para almacenar y generar identificadores.
	
	@Column(name = "Nombre", unique = true, nullable = true, length = 20 )
	private String nombre;
	
	@Column
	private int edad;
	
	private String apellidos;
	
	@Transient
	private String estadoCivil;
	
	public Persona() {
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append("]");
		return builder.toString();
	}
}
