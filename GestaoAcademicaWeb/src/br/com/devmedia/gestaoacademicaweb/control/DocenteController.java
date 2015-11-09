package br.com.devmedia.gestaoacademicaweb.control;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.devmedia.gestaoacademicaweb.model.Docente;
import br.com.devmedia.gestaoacademicaweb.service.DocenteService;

@Controller
public class DocenteController {

	@Autowired
    private DocenteService docenteService;
    
    public List<Docente> listarDocentes() {
    	List<Docente> docentes = docenteService.listarDocentes();
    	return docentes;
    }
    
    public void adicionarDocente(Docente docente) {		
        docenteService.adicionarDocente(docente);         
    }
 
    public void removerDocente(int id) { 
    	docenteService.removerDocente(id); 
    }
}
