package br.com.devmedia.antipadroes;

public class ProgramacaoPorPermuta {

	public static void main(String[] args){
		
		StringBuffer entrada = new StringBuffer("123abc");
		char[] saida = new char[10];
		 
		int i = 0;
		int j = 0;
		int l = entrada.length();
		 
		while (i < l) {
		    if (Character.isDigit(entrada.charAt(i))) {
		        saida[j++] = entrada.charAt(i++);
		    }
		    i++;
		}
		 
		saida[j] = '\0';
		System.out.println(saida);
		
	}
}
