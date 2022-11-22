package Actividad_2;

public class Clase2 implements Runnable {

	public void run () {
		
		for (; ; ) {
			
			System.out.println ("TAC");
			
			try {
				
				Thread.sleep (1500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace ();
				
			}

		}
		
	}

}
