package es.cursojava.entities;

import java.util.Calendar;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CARNET_BIBLIOTECA")
public class CarnetBiblioteca {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "fecha_emision")
	private Date fecha_emision;
	
	@Column(name = "fecha_expiracion")
	private Date fecha_expiracion;
	
	@OneToOne(mappedBy = "carnet")
	private Estudiante estudiante;

	public CarnetBiblioteca(Date fecha_emision) {
		this.fecha_emision = fecha_emision;
		this.fecha_expiracion = calcularFechaExpiracion(fecha_emision);
	}

	public CarnetBiblioteca() {
	}

	public Date getFecha_emision() {
		return fecha_emision;
	}

	public void setFecha_emision(Date fecha_emision) {
		this.fecha_emision = fecha_emision;
	}

	public Date getFecha_expiracion() {
		return fecha_expiracion;
	}

	public void setFecha_expiracion(Date fecha_expiración) {
		this.fecha_expiracion = fecha_expiración;
	}
	
	private Date calcularFechaExpiracion(Date fechaEmision) {
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(fechaEmision);
		calendario.add(1, 3);
		Date fechaModificada = calendario.getTime();
		
		return fechaModificada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CarnetBiblioteca [id=");
		builder.append(id);
		builder.append(", fecha_emision=");
		builder.append(fecha_emision);
		builder.append(", fecha_expiracion=");
		builder.append(fecha_expiracion);
		builder.append("]");
		return builder.toString();
	}
}
