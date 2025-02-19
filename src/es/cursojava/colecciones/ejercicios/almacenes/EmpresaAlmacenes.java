package es.cursojava.colecciones.ejercicios.almacenes;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmpresaAlmacenes {

	Map<String, Map<String, Integer>> mapaAlmacenes;

	public EmpresaAlmacenes(Map<String, Map<String, Integer>> mapaAlmacenes) {
		this.mapaAlmacenes = mapaAlmacenes;
	}

	public Map<String, Map<String, Integer>> getMapaAlmacenes() {
		return mapaAlmacenes;
	}

	public void agregarProducto(String almacen, String producto, int cantidad) {
		Set<Entry<String, Map<String, Integer>>> setAlmacenes = mapaAlmacenes.entrySet();
		boolean existeAlmacen = mapaAlmacenes.containsKey(almacen);

		if (existeAlmacen) {
			for (Entry<String, Map<String, Integer>> entry : setAlmacenes) {
				if (entry.getKey().equals(almacen)) {
					Map<String, Integer> mapaProductos = entry.getValue();
					Set<Entry<String, Integer>> setProductos = entry.getValue().entrySet();
					for (Entry<String, Integer> entry2 : setProductos) {
						if (entry2.getKey().equals(producto)) {
							int cantidadNueva = entry2.getValue() + cantidad;
							
							mapaProductos.put(producto, cantidadNueva);
							System.out.println("Se ha asignado a " + almacen + " " + cantidadNueva
									+ (cantidadNueva == 1 ? " unidad" : " unidades") + " del producto " + producto + ".");
							break;
						} else {
							mapaProductos.put(producto, cantidad);
							System.out.println("Se ha asignado a " + almacen + " " + cantidad
									+ (cantidad == 1 ? " unidad" : " unidades") + " del producto " + producto + ".");
							break;
						}
					}
				}
			}
		} else {
			Map<String, Integer> mapaNuevo = new LinkedHashMap<String, Integer>();
			mapaNuevo.put(producto, cantidad);
			mapaAlmacenes.put(almacen, mapaNuevo);
			System.out.println("Se ha creado " + almacen + " y se le han asignado " + cantidad
					+ (cantidad == 1 ? " unidad" : " unidades") + " del producto " + producto + ".");
		}
	}

	public void eliminarProducto(String almacen, String producto) {
		Set<Entry<String, Map<String, Integer>>> setAlmacenes = mapaAlmacenes.entrySet();
		boolean productoEncontrado = false;

		for (Entry<String, Map<String, Integer>> entry : setAlmacenes) {
			if (entry.getKey().equals(almacen)) {
				Map<String, Integer> mapaProductos = entry.getValue();
				Set<Entry<String, Integer>> setProductos = mapaProductos.entrySet();
				for (Entry<String, Integer> entry2 : setProductos) {
					if (entry2.getKey().equals(producto)) {
						entry2.setValue(0);
						System.out.println("Se ha eliminado el producto " + producto + " de " + almacen + ".");
						productoEncontrado = true;
						break;
					}
				}
			}
		}
		
		if (!productoEncontrado) {
			System.out.println("No se ha encontrado en " + almacen + " el producto " + producto + ".");
		}
	}

	public void transferirStock(String origen, String almacen, String producto, int cantidad) {

	}

	public List<String> buscarProducto(String producto) {

		return null;
	}

	public void obtenerStockTotal(String producto) {

	}
}
