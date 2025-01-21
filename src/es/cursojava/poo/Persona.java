package es.cursojava.poo;

//POJO Plain Old Java Object
public class Persona {

	// Variables de instancia, TODAS private
	private String nombre;
	private String apellidos;
	private String dni;
	private double peso;
	
	//constructor, anula el constructor por defecto
	public Persona (String nombre, String apellidos, String dni, double peso) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.peso = peso;
	}
	
	//constructor vacío, que reemplaza (y hace lo mismo) que el por defecto
	public Persona() {
		
	}
	
	//constructor a medida, que no pide peso
	public Persona (String nombre, String apellidos, String dni) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	// getter y setter
	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {

		// usamos this para hacer referencia a la variable de instancia, si no haríamos
		// referencia al atributo que pasamos en el método
		this.nombre = nombre;

	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//creamos un método, el this. no es necesario, como se ve más adelante donde solo ponemos nombre.
	public void correr() {
		System.out.print("La persona " + this.nombre + " está corriendo. Sí, " + nombre + " está corriendo.");
		if (peso < 50) {
			System.out.println(" Y lo hace muy rápido.");
		} else if (peso < 70) {
			System.out.println(" Y lo hace rápido.");
		} else {
			System.out.println(" Y lo hace lento.");
		}
	}
}
