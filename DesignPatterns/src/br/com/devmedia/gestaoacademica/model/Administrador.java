package br.com.devmedia.gestaoacademica.model;

public class Administrador implements Usuario{
	private static Administrador instancia = null;
	private Administrador() {}
	public static Administrador getInstancia(){
		if (instancia == null) {
			instancia = new Administrador();
		}
		System.out.println(":: INST�NCIA �NICA DE ADMINISTRADOR OBTIDA ::");
		return instancia;
	}

	public void efetuarLogin(){
		System.out.println(":: LOGIN DE ADMINISTRADOR ::");	
	}
}
