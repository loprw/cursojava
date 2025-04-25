package es.cursojava.ficheros.ejercicios.eventos;

import java.util.Date;

public class Evento {

	private int id;
	private String nombre;
	private Date fecha;
	private String lugar;
	private String descripcion;
	private int duracion;
	private double precio;
	private String organizador;
	private boolean gratuito;

	public Evento(int id, String nombre, Date fecha, String lugar, String descripcion, int duracion, double precio,
			String organizador, boolean gratuito) {

		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.precio = precio;
		this.organizador = organizador;
		this.gratuito = gratuito;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getDuracion() {
		return duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public String getOrganizador() {
		return organizador;
	}

	public boolean isGratuito() {
		return gratuito;		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evento [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", lugar=");
		builder.append(lugar);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", organizador=");
		builder.append(organizador);
		builder.append(", gratuito=");
		builder.append(gratuito);
		builder.append("]");
		return builder.toString();
	}
}
