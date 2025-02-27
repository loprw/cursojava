package es.cursojava.excepciones.ejercicios.bar;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.excepciones.ejercicios.bar.excepciones.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios.bar.excepciones.TooHotTemperatureException;

public class Bar {

	private String nombre;
	
	public static void main(String[] args) {
		
		Bar bar = new Bar("Donde siempre");
		List<Cliente> clientes = bar.abrirBar();
		
		bar.cafetear(clientes);
		
	}

	public Bar(String nombre) {
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
	
	public void cafetear(List<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			if (cliente instanceof Cafeteable) {
				TazaCafe cafe = new TazaCafe("Arábigo");
				try {
					((Cafeteable) cliente).beberCafe(cafe);
				} catch (TooHotTemperatureException thte) {
					thte.printStackTrace();
				} catch (TooColdTemperatureException tcte) {
					tcte.printStackTrace();
				}
			}
		}
	}
}
