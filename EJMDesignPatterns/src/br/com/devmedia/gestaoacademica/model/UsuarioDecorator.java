package br.com.devmedia.gestaoacademica.model;

public abstract class UsuarioDecorator implements Usuario{

	protected Usuario usuarioDecorado;
	
	public UsuarioDecorator(Usuario usuarioDecorado){
		this.usuarioDecorado = usuarioDecorado;
	}
	
	public void efetuarLogin(){
		usuarioDecorado.efetuarLogin();
	}
}
