package Actividad_1;

public class Clase2 extends Thread {

	public void run () {
		
		for (; ; ) {
			
			System.out.println ("TAC");
			
			try {
				
				sleep (1500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace ();
				
			}

		}
		
	}

}
