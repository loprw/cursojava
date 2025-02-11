package es.cursojava.colecciones.ejercicios.vehiculos;

import java.util.ArrayList;
import java.util.Iterator;

import es.cursojava.poo.herencia.ejercicios.garaje.EjecutarVehiculos;
import es.cursojava.poo.herencia.ejercicios.garaje.Vehiculo;

public class MainVehiculosLista {

	public static void main(String[] args) {

		EjecutarVehiculos nuevo = new EjecutarVehiculos();
		Vehiculo[] vehiculos = nuevo.crearVehiculos();
		
		ArrayList<Vehiculo> listaVehiculos = crearListaVehiculos(vehiculos);
		acelerarVehiculos(listaVehiculos);
	}

	public static ArrayList<Vehiculo> crearListaVehiculos(Vehiculo[] vehiculos) {
		
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
		int contador = 0;
		
		for (Vehiculo vehiculo : vehiculos) {
			listaVehiculos.add(contador, vehiculo);
		}
		
		return listaVehiculos;
		}
	
	public static void acelerarVehiculos (ArrayList<Vehiculo> listaVehiculos) {
		
		for (int i = 0; i < listaVehiculos.size(); i++) {
			listaVehiculos.get(i).acelerar();
		}
	}
}
