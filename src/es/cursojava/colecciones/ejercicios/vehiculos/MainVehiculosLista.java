package es.cursojava.colecciones.ejercicios.vehiculos;

import java.util.ArrayList;

import es.cursojava.poo.herencia.ejercicios.garaje.EjecutarVehiculos;
import es.cursojava.poo.herencia.ejercicios.garaje.Vehiculo;

public class MainVehiculosLista {

	public static void main(String[] args) {

		EjecutarVehiculos nuevo = new EjecutarVehiculos();
		Vehiculo[] vehiculos = nuevo.crearVehiculos();
		
		ArrayList<Vehiculo> listaVehiculos = crearListaVehiculos(vehiculos);
		acelerarVehiculos(listaVehiculos);
		
//		Otra forma de hacerlo, es crear la variable de la lista, declarar los objetos a añadir, y luego añadirlo así:
//		listaVehiculos = Arrays.asList(coche1, coche2, moto1, moto2, camion1, camion2);
//		Pero cuidado, porque esto elimina la lista anterior pq el método crea una List nueva y la asigna a la variable
//		Para añadir los objetos de una lista a otra, podemos hacer:
//		listaVehiculos.addAll(Arrays.asList(coche1, coche2, moto1, moto2, camion1, camion2));
	}

	public static ArrayList<Vehiculo> crearListaVehiculos(Vehiculo[] vehiculos) {
		
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
		
		for (Vehiculo vehiculo : vehiculos) {
			listaVehiculos.add(vehiculo);
		}
		
		return listaVehiculos;
		}
	
	public static void acelerarVehiculos (ArrayList<Vehiculo> listaVehiculos) {
		
		for (int i = 0; i < listaVehiculos.size(); i++) {
			listaVehiculos.get(i).acelerar();
		}
	}
}
