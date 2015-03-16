package br.com.devmedia.gestaoacademicaweb.dao;

import java.util.List;
import br.com.devmedia.gestaoacademicaweb.model.Docente;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DocenteDAOImpl implements DocenteDAO {

	@Autowired
    private SessionFactory sessionFactory;
	 
	public void adicionarDocente(Docente docente) {
	        sessionFactory.getCurrentSession().save(docente);
	}	 
		
	public List<Docente> listarDocentes() {	 
		
		return sessionFactory.getCurrentSession().createCriteria(Docente.class).list();
		
	}
	
	public Docente verDocente(int id) {	 
		return (Docente)sessionFactory.getCurrentSession().load(Docente.class, new Integer(id));		
	}
}
