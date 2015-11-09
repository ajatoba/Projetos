package br.com.devmedia.gestaoacademicaweb.service;

import java.util.List;

import br.com.devmedia.gestaoacademicaweb.model.Docente;

public interface DocenteService {
	public void adicionarDocente(Docente docente);
	public void removerDocente(int id);
	public List<Docente> listarDocentes();
}
