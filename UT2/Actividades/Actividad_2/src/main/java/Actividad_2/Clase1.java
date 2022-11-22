package Actividad_2;

public class Clase1 implements Runnable {
	
	public void run () {
		
		for (; ; ) {
			
			System.out.println ("TIC");
			
			try {
				
				Thread.sleep (1500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace ();
				
			}
			
		}
		
	}

}
