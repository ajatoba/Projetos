package br.com.devmedia.antipadroes.sufoco;

import java.sql.*;
import java.util.*;

import br.com.devmedia.antipadroes.Usuario;

public class Sufoco {

	public void adicionarUsuarios (ArrayList<Usuario> usuarios) throws Exception{
	
		Iterator<Usuario> it = usuarios.iterator();
		
		Connection con = null;	
		Statement stmt = con.createStatement();
		
		while (it.hasNext()) {
			Usuario usuario = (Usuario) it.next();
			stmt.execute("INSERT INTO TB_USUARIO (NOME) VALUES ('"+ usuario.getNome() +"')");
		}
	}
	
}
