package es.cursojava.dao;

import java.util.List;

import es.cursojava.entities.CaballoCarrera;

public interface CaballoCarrerasDAO {

	boolean nuevoCaballo(CaballoCarrera caballo);
	List<CaballoCarrera> obtenerCaballos();
	List<CaballoCarrera> obtenerCaballosActivos();
}
