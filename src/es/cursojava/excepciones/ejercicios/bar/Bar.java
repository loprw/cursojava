package es.cursojava.excepciones.ejercicios.bar;

import java.util.ArrayList;
import java.util.List;

public class Bar {

	private String nombre;
	
	public static void main(String[] args) {
		
		Bar bar = new Bar("Donde siempre");
		List<Cliente> clientes = bar.abrirBar();
		
		for (Cliente cliente : clientes) {
			if (cliente instanceof Cafeteable) {
				TazaCafe cafe = new TazaCafe("Arábigo");
				try {
					((Cafeteable) cliente).beberCafe(cafe);
				} catch (TooHotTemperatureException thte) {
					System.out.println("Error 1: " + thte.getMessage());
				} catch (TooColdTemperatureException tcte) {
					System.out.println("Error 2: " + tcte.getMessage());
				}
			}
		}
		
	}

	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private List<Cliente> abrirBar() {
		System.out.println("Se están creando los clientes del bar " + this.getNombre() + "...\n");
		List<Cliente> listadoClientes = new ArrayList<Cliente>();
		
		listadoClientes.add(new Huesped("Miguel", "123456789Z"));
		listadoClientes.add(new Comensal("Antonio", true));
		listadoClientes.add(new ClienteAsiduo("Jose", "Pepe Botella"));
		
		System.out.println("¡Clientes creados!\n");
		
		return listadoClientes;
	}
}
