package es.cursojava.colecciones.ejercicios.almacenes;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainAlmacenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Parte 1 del ejercicio: representar los datos
		EmpresaAlmacenes almacenes = new EmpresaAlmacenes(crearAlmacenes());
		
		//Parte 2 del ejercicio: implementar métodos.
		almacenes.agregarProducto("almacen2", "Memoria USB", 1);
		almacenes.agregarProducto("almacen5", "Targeta Gráfica", 3);
		almacenes.eliminarProducto("almacen3", "Disco Duro");
		almacenes.eliminarProducto("almacen1", "Memoria RAM");
	}

	public static Map<String, Map<String, Integer>> crearAlmacenes() {
		
		String producto1 = "Memoria USB";
		String producto2 = "Disco Duro";
		String producto3 = "Tarjeta Gráfica";
		String producto4 = "Placa base";
		String producto5 = "Memoria RAM";
		String producto6 = "CPU";
		
		Map<String, Integer> mapa1 = new LinkedHashMap<>();
		Map<String, Integer> mapa2 = new LinkedHashMap<>();
		Map<String, Integer> mapa3 = new LinkedHashMap<>();
		Map<String, Integer> mapa4 = new LinkedHashMap<>();
		
		mapa1.put(producto6, 4);
		mapa1.put(producto2, 10);
		mapa1.put(producto1, 0);
		mapa2.put(producto5, 3);
		mapa2.put(producto2, 5);
		mapa2.put(producto4, 9);
		mapa3.put(producto1, 8);
		mapa3.put(producto2, 6);
		mapa3.put(producto3, 11);
		mapa4.put(producto3, 7);
		mapa4.put(producto5, 1);
		mapa4.put(producto6, 3);
		
			
		Map<String, Map<String, Integer>> almacenes = new LinkedHashMap<>();

		almacenes.put("almacen1", mapa1);
		almacenes.put("almacen2", mapa2);
		almacenes.put("almacen3", mapa3);
		almacenes.put("almacen4", mapa4);

		return almacenes;
	}
}
