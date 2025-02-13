package es.cursojava.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PruebaMapas {

	public static void main(String[] args) {
		
		Map<String, Integer> mapa = new HashMap<>();
		
		mapa.put("Clave1", 2);
		System.out.println(mapa.put("Clave2", 3));//devuelve null pq la clave no existía
		System.out.println(mapa.put("Clave2", 4));//al existir la clave, devuelve el valor asociado anteriormente a esa  clave
		System.out.println(mapa.put("Clave2", 5));//devuelve 4
		
		System.out.println("===========  Valor por clave  ==================");
		
		//recuperamos por clave
		System.out.println(mapa.get("Clave1"));//pinta 2
		System.out.println(mapa.get("Clave2"));//pinta 5
		
		System.out.println("=============  Claves  ==================");
		
		//recuperar todas las claves
		Set<String> claves = mapa.keySet();
		
		for (String clave : claves) {
			System.out.println(clave);
		}
		
		System.out.println("==============  Valores  =================");
		
		Collection<Integer> valores = mapa.values();
		
		for (Integer integer : valores) {
			System.out.println(integer);			
		}
		
		System.out.println("==============  Todas Claves con Valores  =================");
		
		//es una de las formas
		for (String clave : claves) {
			System.out.println(clave + ": " + mapa.get(clave));
		}
		
		System.out.println("==============  Todas Claves con Valores usando entrySet  =================");
		//otra forma
		Set<Entry<String, Integer>> entries = mapa.entrySet();
		
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			//también
			System.out.println(entry);
		}
	}
}
