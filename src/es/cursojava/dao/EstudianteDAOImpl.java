package es.cursojava.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.entities.Estudiante;
import es.cursojava.hibernate.HibernateUtil;
import es.cursojava.services.BibliotecaService;

public class EstudianteDAOImpl implements EstudianteDAO{

	@Override
	public boolean agregarEstudiante(Estudiante estudiante) {
		boolean resultado = false;
		Session session = HibernateUtil.getSession();
		
		Transaction tx = session.beginTransaction();
		
		session.persist(estudiante);
		
		tx.commit();
		
		if (estudiante != null) {
			resultado = true;
		}
		
		return resultado;
	}

	@Override
	public List<Estudiante> mostrarEstudiantes() {
		
		Session session = HibernateUtil.getSession();
		String query = "from Estudiante";
		List<Estudiante> listado = session.createQuery(query, Estudiante.class).list();
		
		return listado;
	}	
}
