package mx.com.everis.tallerjava.hilos;

public class Testing {

	public static void main(String[] args) {
		
		
		System.out.println("Hilo main "+Thread.currentThread());
		//Primera forma de crear un hilo
		Thread miHiloThread = new Thread(new MiHiloThread(),"Hilo 2");
		miHiloThread.start();
		
		//Segunda forma de crear un hilo
		MiHiloRunnable  miHilo = new MiHiloRunnable();
		Thread miHiloRunnable = new Thread(miHilo,"Hilo 3");				
		miHiloRunnable.start();
	}

}
