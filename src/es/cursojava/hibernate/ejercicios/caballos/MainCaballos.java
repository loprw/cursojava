package es.cursojava.hibernate.ejercicios.caballos;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.entities.CaballoCarrera;
import es.cursojava.hibernate.HibernateUtil;
import es.cursojava.utils.UtilidadesHibernate;

public class MainCaballos {

	private static final Logger logger = LoggerFactory.getLogger(MainCaballos.class);

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		UtilidadesHibernate.agregarCaballosBaseDatos(session, crearCaballos());

		// Parte 2

		UtilidadesHibernate.menu(session);

		// Fin
		UtilidadesHibernate.cerrarConexion(session);
	}

	private static List<CaballoCarrera> crearCaballos() {

		CaballoCarrera c1 = new CaballoCarrera("Rocinante", 12, 45.9, 0, 1.5, false);
		CaballoCarrera c2 = new CaballoCarrera("Marea Plateada", 5, 69.8, 0, 0.0, false);
		CaballoCarrera c3 = new CaballoCarrera("Rápidos veloces", 28, 37.4, 0, 9.7, false);
		CaballoCarrera c4 = new CaballoCarrera("Pera de agua", 19, 71.4, 0, 5.8, false);
		CaballoCarrera c5 = new CaballoCarrera("Viento dorado", 21, 57.1, 0, 2.9, false);

		List<CaballoCarrera> caballos = Arrays.asList(c1, c2, c3, c4, c5);

		return caballos;
	}
}
