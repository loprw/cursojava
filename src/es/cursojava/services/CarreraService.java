package es.cursojava.services;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.dao.CaballoCarrerasDAOImpl;
import es.cursojava.dto.CaballoDTO;
import es.cursojava.entities.CaballoCarrera;
import es.cursojava.entities.Jinete;

public class CarreraService {

	private CaballoCarrerasDAOImpl dao = new CaballoCarrerasDAOImpl();
	
	public CarreraService() {
		
	}

	public boolean ingresarCaballo(CaballoDTO dto) {
		
		Jinete jinete = new Jinete(dto.getNombreJinete(), dto.getNacionalidadJinete());
		CaballoCarrera caballo = new CaballoCarrera(dto.getNombre(), dto.getEdad(), dto.getVelocidadMaxima(),
				dto.getTriunfos(), dto.getExperiencia(), dto.isActivo(), jinete);

		if (dao.nuevoCaballo(caballo)) {
			return true;
		}

		return false;
	}

	public List<CaballoDTO> recuperarCaballos() {

		List<CaballoCarrera> listado = dao.obtenerCaballos();
		List<CaballoDTO> salida = new ArrayList<CaballoDTO>();

		for (CaballoCarrera c : listado) {
			salida.add(new CaballoDTO(c.getNombre(), c.getEdad(), c.getVelocidadMaxima(), c.getNumeroTriunfos(),
					c.getExperiencia(), c.isEstaActivo(), c.getJinete().getNombreJinete(), c.getJinete().getNacionalidad()));
		}

		return salida;
	}

	public List<CaballoDTO> recuperarCaballosActivos() {

		List<CaballoCarrera> listado = dao.obtenerCaballosActivos();
		List<CaballoDTO> salida = new ArrayList<CaballoDTO>();

		for (CaballoCarrera c : listado) {

			salida.add(new CaballoDTO(c.getId(), c.getNombre(), c.getEdad(), c.getVelocidadMaxima(), c.getNumeroTriunfos(),
					c.getExperiencia(), c.isEstaActivo(), c.getJinete().getNombreJinete(), c.getJinete().getNacionalidad()));
		}

		return salida;
	}

	public CaballoDTO ejecutarCarrera() {
		List<CaballoDTO> listado = recuperarCaballosActivos();
		final int DISTANCIA = 10_000;
		boolean finalCarrera = false;
		CaballoDTO ganador = null;

		if (listado.size() != 0 && listado != null) {
			do {
				for (CaballoDTO c : listado) {
					
					c.setDistanciaRecorrida( c.getDistanciaRecorrida() + (int) ((Math.random() * 51) * c.getVelocidadMaxima()) 
							+ (int) ((Math.random() * 11) * c.getExperiencia())
							- (int) ((Math.random() * 11) * c.getEdad()) );
					System.out.println(c.getDistanciaRecorrida());
					
					if (c.getDistanciaRecorrida() >= DISTANCIA) {
						finalCarrera = true;
						ganador = c;
						break;
					}
				}

			} while (!finalCarrera);
		}
		
		return ganador;
	}
	
	public boolean modificarJinete(int id, String nombre, String nacionalidad) {
		
		
		return false;
	}
	
	public void recuperarCaballo(int id) {
		
	}
}
