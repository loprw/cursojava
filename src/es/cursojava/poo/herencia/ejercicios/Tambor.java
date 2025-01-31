package es.cursojava.poo.herencia.ejercicios;

public class Tambor extends Instrumento{

	private String material;
	
	public Tambor(String nombre, String tipo, String material) {
		super(nombre, tipo);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public void afinar() {
		System.out.println("Afinando Tambor.");
		setAfinado(true);
	}
	
	public void aporrear() {
		System.out.println("Aporreando Tambor.");
	}
}
