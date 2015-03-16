package br.com.devmedia.gestaoacademica.model;

public class SuperUsuarioDecorator extends UsuarioDecorator {

	public SuperUsuarioDecorator (Usuario usuarioDecorado){
		super(usuarioDecorado);
	}
	
	public void efetuarLogin(){
		usuarioDecorado.efetuarLogin();
		tornarSuper(usuarioDecorado);
	}
	
	private void tornarSuper(Usuario usuarioDecorado){
		System.out.println(":: ESSE USU�RIO AGORA TEM PRIVIL�GIOS DE SUPER USU�RIO ::");
	}
}
