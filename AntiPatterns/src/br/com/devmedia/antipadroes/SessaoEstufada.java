package br.com.devmedia.antipadroes;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/SessaoEstufada")
public class SessaoEstufada extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession( );
		
		Curso curso = new Curso( );
		curso.setCodigo(request.getParameter("FORM_CODIGO"));
		curso.setTitulo(request.getParameter("FORM_TITULO"));
		
		session.setAttribute("antipatterns.curso", curso);
		
		RequestDispatcher dispatcher = getServletContext( ).getRequestDispatcher("/Resposta.jsp");
		dispatcher.forward(request, response);
	}
	
}
