package br.com.devmedia.gestaoacademica.model;

public class UsuarioFactory extends AbstractFactory {

	public Usuario getUsuario(String usuario){
		if(usuario.equalsIgnoreCase("ADMINISTRADOR")){
			System.out.println(":: FABRICADO OBJETO DO TIPO ADMINISTRADOR ::");
			return Administrador.getInstancia();
		}else if(usuario.equalsIgnoreCase("ESTUDANTE")){
			System.out.println(":: FABRICADO OBJETO DO TIPO ESTUDANTE ::");
			return new Estudante();
		}else if(usuario.equalsIgnoreCase("PROFESSOR")){
			System.out.println(":: FABRICADO OBJETO DO TIPO PROFESSOR ::");
			return new Professor();			
		}
		return null;
	} 
}
