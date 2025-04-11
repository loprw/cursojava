package es.cursojava.dto;

import java.util.Date;

public class EstudianteDTO {

	private long id;
	private String nombre;
	private String apellidos;
	private long idCarnet;
	private Date fechaEmision;
	private Date fechaExpiracion;
	
	public EstudianteDTO(String nombre, String apellidos, Date fechaEmision) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaEmision = fechaEmision;
	}
	
	public EstudianteDTO(String nombre, String apellidos, long idCarnet, Date fechaEmision,
			Date fechaExpiracion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idCarnet = idCarnet;
		this.fechaEmision = fechaEmision;
		this.fechaExpiracion = fechaExpiracion;
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public long getIdCarnet() {
		return idCarnet;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setIdCarnet(long idCarnet) {
		this.idCarnet = idCarnet;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstudianteDTO [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", idCarnet=");
		builder.append(idCarnet);
		builder.append(", fechaEmision=");
		builder.append(fechaEmision);
		builder.append(", fechaExpiracion=");
		builder.append(fechaExpiracion);
		builder.append("]");
		return builder.toString();
	}
}
