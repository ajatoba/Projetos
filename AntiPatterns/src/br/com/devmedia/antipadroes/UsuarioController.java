package br.com.devmedia.antipadroes;


public class UsuarioController {

	public static Usuario getUsuario(String nome, String password){
		//Esse m�todo, hipoteticamente, iria ao banco de dados e recuperaria o usu�rio
		
		Usuario usuario = new Usuario();
		
		usuario.setNome(nome);
		usuario.setId(1);
		
		return usuario;
	}
}
