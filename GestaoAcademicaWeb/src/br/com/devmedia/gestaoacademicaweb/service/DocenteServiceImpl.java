package br.com.devmedia.gestaoacademicaweb.service;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.dao.DocenteDAO;
import br.com.devmedia.gestaoacademicaweb.model.Docente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteDAO docenteDAO;
	
	
	@Transactional
	public void adicionarDocente(Docente docente) {
		docenteDAO.adicionarDocente(docente);
	}

	@Transactional
	public List<Docente> listarDocentes() {		
		return docenteDAO.listarDocentes();
	}
	
	@Transactional
	public Docente verDocente(int id) {		
		return docenteDAO.verDocente(id);
	}

}
