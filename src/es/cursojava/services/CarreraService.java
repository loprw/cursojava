package es.cursojava.services;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.dao.CaballoCarrerasDAOImpl;
import es.cursojava.dto.CaballoDTO;
import es.cursojava.entities.CaballoCarrera;

public class CarreraService {
	
	private CaballoCarrerasDAOImpl dao = new CaballoCarrerasDAOImpl();
	
	public boolean ingresarCaballo(CaballoDTO dto) {
		
		boolean agregado = false;
		
		String nombre = dto.getNombre();
		int edad = dto.getEdad();
		double velocidad = dto.getVelocidadMaxima();
		int triunfos = dto.getTriunfos();
		double exp = dto.getExperiencia();
		boolean activo = dto.isActivo();
		
		CaballoCarrera caballo = new CaballoCarrera(nombre, edad, velocidad, triunfos, exp, activo);
		
		if (dao.nuevoCaballo(caballo)) {
			agregado = true;
		}
		
		return agregado;
	}
	
	public List<CaballoDTO> recuperarCaballos() {
		
		List<CaballoCarrera> listado = dao.obtenerCaballos();
		List<CaballoDTO> salida = new ArrayList<CaballoDTO>();
		
		for (CaballoCarrera c : listado) {
			salida.add(new CaballoDTO(
					c.getNombre(),
					c.getEdad(),
					c.getVelocidadMaxima(),
					c.getNumeroTriunfos(),
					c.getExperiencia(),
					c.isEstaActivo())
				);
		}
		
		return salida;
	}

}
