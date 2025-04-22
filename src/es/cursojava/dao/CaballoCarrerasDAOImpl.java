package es.cursojava.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.entities.CaballoCarrera;
import es.cursojava.hibernate.HibernateUtil;

public class CaballoCarrerasDAOImpl implements CaballoCarrerasDAO {

	@Override
	public boolean nuevoCaballo(CaballoCarrera caballo) {
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		try {
			session.persist(caballo);
		} catch (RuntimeException rte) {
			return false;
		}


		tx.commit();
			
		return true;
	}

	@Override
	public List<CaballoCarrera> obtenerCaballos() {
		
		String HQL = "from CaballoCarrera";
		
		Session session = HibernateUtil.getSession();
		List<CaballoCarrera> listado = session.createQuery(HQL, CaballoCarrera.class).list();
		
		return listado;
	}

}
