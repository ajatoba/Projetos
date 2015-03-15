package br.com.devmedia.antipadroes.spinning;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RecursoCompartilhado {

	private Lock lockA;
	private Lock lockB;
	
	public RecursoCompartilhado() 
	{
		lockA = new ReentrantLock();
		lockB = new ReentrantLock();
	}
	
	public Lock getLockA() {return lockA;}	
	public Lock getLockB(){return lockB;}
	
}
