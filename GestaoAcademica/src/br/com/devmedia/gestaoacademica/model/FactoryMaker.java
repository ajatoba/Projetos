package br.com.devmedia.gestaoacademica.model;

public class FactoryMaker {
	public static AbstractFactory getFactory(String fabrica){
	      if(fabrica.equalsIgnoreCase("USUARIO")){
	         return new UsuarioFactory();
	      }
	      return null;
	}
}
