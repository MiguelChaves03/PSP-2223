package Actividad_1;

public class Clase1 extends Thread {
		
	public void run () {
		
		for (; ; ) {
			
			System.out.println ("TIC");

			try {
				
				sleep (1500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace ();
				
			}
			
		}
		
	}

}
