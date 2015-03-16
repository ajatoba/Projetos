package br.com.devmedia.gestaoacademica.model;

public class UsuarioContext {

	private UsuarioStrategy strategy;

	public UsuarioContext(UsuarioStrategy strategy){
		this.strategy = strategy;
	}

	public void executeStrategy(){
		strategy.doEfetuarCadastro();
	}
}
