package es.cursojava.dto;

public class CaballoDTO {

	private long id;
	private String nombre;
	private int edad;
	private double velocidadMaxima;
	private int triunfos;
	private double experiencia;
	private boolean activo;
	private int distanciaRecorrida;
	private String nombreJinete;
	private String nacionalidadJinete;
	
	public CaballoDTO(long id, String nombre, int edad, double velocidadMaxima, int triunfos, double experiencia,
			boolean activo) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.triunfos = triunfos;
		this.experiencia = experiencia;
		this.activo = activo;
	}

	public CaballoDTO(long id, String nombre, int edad, double velocidadMaxima, int triunfos, double experiencia, boolean activo,
			String nombreJinete, String nacionalidadJinete) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.triunfos = triunfos;
		this.experiencia = experiencia;
		this.activo = activo;
		this.distanciaRecorrida = 0;
		this.nombreJinete = nombreJinete;
		this.nacionalidadJinete = nacionalidadJinete;
	}
	
	public CaballoDTO(String nombre, int edad, double velocidadMaxima, int triunfos, double experiencia, boolean activo,
			String nombreJinete, String nacionalidadJinete) {
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.triunfos = triunfos;
		this.experiencia = experiencia;
		this.activo = activo;
		this.distanciaRecorrida = 0;
		this.nombreJinete = nombreJinete;
		this.nacionalidadJinete = nacionalidadJinete;
	}

	public CaballoDTO(String nombre, int edad, double velocidadMaxima, int triunfos, double experiencia, boolean activo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.triunfos = triunfos;
		this.experiencia = experiencia;
		this.activo = activo;
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

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getTriunfos() {
		return triunfos;
	}

	public void setTriunfos(int triunfos) {
		this.triunfos = triunfos;
	}

	public double getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public void setDistanciaRecorrida(int distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}

	public String getNombreJinete() {
		return nombreJinete;
	}

	public void setNombreJinete(String nombreJinete) {
		this.nombreJinete = nombreJinete;
	}

	public String getNacionalidadJinete() {
		return nacionalidadJinete;
	}

	public void setNacionalidadJinete(String nacionalidadJinete) {
		this.nacionalidadJinete = nacionalidadJinete;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CaballoDTO [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", velocidadMaxima=");
		builder.append(velocidadMaxima);
		builder.append(", triunfos=");
		builder.append(triunfos);
		builder.append(", experiencia=");
		builder.append(experiencia);
		builder.append(", activo=");
		builder.append(activo);
		builder.append(", nombreJinete=");
		builder.append(nombreJinete);
		builder.append(", nacionalidadJinete=");
		builder.append(nacionalidadJinete);
		builder.append("]");
		return builder.toString();
	}
	
	
}
