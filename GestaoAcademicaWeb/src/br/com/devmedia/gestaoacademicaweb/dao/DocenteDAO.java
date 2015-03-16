package br.com.devmedia.gestaoacademicaweb.dao;

import java.util.List;
import br.com.devmedia.gestaoacademicaweb.model.Docente;

public interface DocenteDAO {
	
	public void adicionarDocente(Docente docente);
	public List<Docente> listarDocentes();
	public Docente verDocente(int id);
	
}
