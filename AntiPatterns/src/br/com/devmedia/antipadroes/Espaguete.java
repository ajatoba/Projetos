package br.com.devmedia.antipadroes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Espaguete")
public class Espaguete extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException, Exception {
		
		Usuario usuario = efetuarLogin(request);
		
		try {		
			efetuarLogin(request);
			validarUsuario(usuario, session);					
		} catch (Exception e) {
			throw e;
		}
	}
	
	private void validarUsuario(Usuario usuario, HttpSession session) throws Exception{
		if (((Usuario)session.getAttribute("SESSION_USUARIO")).getId()!= (usuario.getId())){
			throw new Exception ("Usuario Invalido!");
		}
	}
	
	private Usuario efetuarLogin(HttpServletRequest request){
		Usuario usuario = UsuarioController.getUsuario((String)request.getAttribute("FORM_NOME"), (String)request.getAttribute("FORM_SENHA"));
		return usuario;
	}

}
