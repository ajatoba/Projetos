package br.com.devmedia.gestaoacademicaweb.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.devmedia.gestaoacademicaweb.model.Docente;
import br.com.devmedia.gestaoacademicaweb.service.DocenteService;

@Controller
public class DocenteController {

	@Autowired
    private DocenteService docenteService;
 
    @RequestMapping("/index")
    public String listarDocentes(Map<String, Object> map) {
 
        map.put("docente", new Docente());
        map.put("docenteList", docenteService.listarDocentes());
 
        return "listar_docentes";
    }
    
    @RequestMapping("/form")
    public String form(Map<String, Object> map) {
    	map.put("docente", new Docente());
        return "inserir_docente_form"; 
    }
    
    @RequestMapping(value = "/adicionar", method = RequestMethod.POST)
    public String adicionarDocente(@ModelAttribute("docente") Docente docente, BindingResult result) {
 
        docenteService.adicionarDocente(docente); 
 
        return "redirect:/index";
    } 
    
    @RequestMapping("/detalhe/{id}")
    public String verDocente(@PathVariable("id") int id, Model model){
        model.addAttribute("docente", docenteService.verDocente(1));
        
        return "detalhe_docente";
    }
   

}
