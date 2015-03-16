package br.com.devmedia.gestaoacademicaweb.service;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.model.Docente;

public interface DocenteService {
	public void adicionarDocente(Docente docente);
	public List<Docente> listarDocentes();
	public Docente verDocente(int id);

}
