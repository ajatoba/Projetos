package br.com.devmedia.antipadroes.spinning;

import java.util.concurrent.locks.Lock;

public class Spinning extends Thread{

	protected int threadID;
	protected Lock lockPrimario, lockSecundario;
	

	public Spinning(RecursoCompartilhado recursoCompartilhado, boolean inverterOrdem, int threadID)
	{
		this.threadID = threadID;
		
		if (inverterOrdem)
		{
			this.lockPrimario = recursoCompartilhado.getLockA();
			this.lockSecundario = recursoCompartilhado.getLockB();
		}
		else
		{
			this.lockPrimario = recursoCompartilhado.getLockB();
			this.lockSecundario = recursoCompartilhado.getLockA();
		}
	}

	@Override
	public void run()
	{
		try
		{
			lockPrimario.lock();
			System.out.println("Thread " + getName() + "' está em modo de leitura");

			Thread.sleep(1000*threadID);

			lockSecundario.lock();
			System.out.println("Thread " + getName() + "' está em modo de escrita");
		}
		catch (InterruptedException exce)
		{
			return;
		}

		finally
		{
			lockSecundario.unlock();
			lockPrimario.unlock();
		}

		System.out.println("Thread " + getName() + "' finalizada");
	}
	
	public static void main(String[] args)
	{
		Spinning thread0;
		Spinning thread1;
		RecursoCompartilhado recurso;
		
		recurso = new RecursoCompartilhado();
		
		thread0 = new Spinning(recurso, false, 1);
		thread0.start();
		
		thread1 = new Spinning(recurso,true, 2);
		thread1.start();
	}
}
