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
	private boolean esGratuito;

	public Evento(int id, String nombre, Date fecha, String lugar, String descripcion, int duracion, double precio,
			String organizador, boolean esGratuito) {

		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.precio = precio;
		this.organizador = organizador;
		this.esGratuito = esGratuito;
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

	public boolean isEsGratuito() {
		return esGratuito;		
	}
}
