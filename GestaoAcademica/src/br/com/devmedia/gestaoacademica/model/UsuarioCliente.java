package br.com.devmedia.gestaoacademica.model;

public class UsuarioCliente {

	public static void main(String[] args) {

		//TESTANDO SINGLETON
		Administrador administrador = Administrador.getInstancia();
		
		//TESTANDO ABSTRACT FACTORY
		AbstractFactory factory = FactoryMaker.getFactory("USUARIO");
		Usuario usuario = factory.getUsuario("ADMINISTRADOR");
		usuario.efetuarLogin();
		
		//TESTANDO DECORATOR (
		usuario = new SuperUsuarioDecorator(new Professor());
		usuario.efetuarLogin();
		
		//TESTANDO STRATEGY
		UsuarioContext context = new UsuarioContext(new OpEfetuarCadastro());		
	    context.executeStrategy();
	    
	}

}
