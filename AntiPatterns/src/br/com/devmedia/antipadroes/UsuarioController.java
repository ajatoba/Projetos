package br.com.devmedia.antipadroes;


public class UsuarioController {

	public static Usuario getUsuario(String nome, String password){
		//Esse método, hipoteticamente, iria ao banco de dados e recuperaria o usuário
		
		Usuario usuario = new Usuario();
		
		usuario.setNome(nome);
		usuario.setId(1);
		
		return usuario;
	}
}
