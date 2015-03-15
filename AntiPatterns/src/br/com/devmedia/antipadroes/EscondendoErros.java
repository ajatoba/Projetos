package br.com.devmedia.antipadroes;

import java.io.*;

public class EscondendoErros {

	public static void main(String[] args) {

	    File file = new File("C:\\arquivo.txt");
	    FileInputStream fis = null;
	    BufferedInputStream bis = null;
	    DataInputStream dis = null;

	    try {
	      fis = new FileInputStream(file);
	      bis = new BufferedInputStream(fis);
	      dis = new DataInputStream(bis);

	      while (dis.available() != 0) {
	        System.out.println(dis.readLine());
	      }

	      fis.close();
	      bis.close();
	      dis.close();

	    }catch (Exception e) {
	    	System.out.println("Erro ao importar arquivo");
	    }
	  }
}
