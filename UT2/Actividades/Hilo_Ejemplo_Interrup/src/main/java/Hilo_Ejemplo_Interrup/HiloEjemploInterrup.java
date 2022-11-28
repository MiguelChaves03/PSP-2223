package Hilo_Ejemplo_Interrup;

public class HiloEjemploInterrup extends Thread {
	
	public void run () {
		
		try {
			
			while (!isInterrupted ()) {
				
				System.out.println ("EN EL HILO");
				
				Thread.sleep (10);
				
			}
			
		} catch (InterruptedException e) {
			
			System.out.println ("HA OCURRIDO UNA EXCEPCION");
			
		}
		
		System.out.println ("FIN HILO");
		
	}
	
	public void interrumpir () {
		
		interrupt ();
		
	}
	
	public static void main (String [] args) {
		
		HiloEjemploInterrup h = new HiloEjemploInterrup ();
		
		h.start ();
		
		for (int i = 0; i < 1000000000; i ++) {
			
		}
		
		h.interrumpir ();
		
	}

}
