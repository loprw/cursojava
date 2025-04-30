package es.cursojava.enums;

public enum CaballosEnum {

	CABALLO1("Nombre Caballo1", 5, 10),
	CABALLO2("Nombre Caballo2", 3, 5.2),
	CABALLO3("Nombre Caballo3", 17, 2.4);
	
	String nombre;
	int edad;
	double experiencia;
	
	CaballosEnum(String nombre, int edad, double experiencia) {
		this.nombre = nombre;
		this.edad = edad;
		this.experiencia = experiencia;
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

	public double getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}
}
