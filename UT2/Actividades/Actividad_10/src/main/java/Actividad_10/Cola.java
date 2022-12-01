package Actividad_10;

public class Cola {
	
	private int numero;
	
	private boolean disponible = false;
	
	public synchronized int get () {
		
		while (!disponible) {
			
			try {
				
				wait ();
				
			} catch (InterruptedException e) {
				
			}
			
		}
		
		disponible = false;
		
		notify ();
		
		System.out.println ("\tSE CONSUME: " + numero);
		
		return numero;

	}
	
	public synchronized void put (int valor) {
		
		while (disponible) {
			
			try {
				
				wait ();
				
			} catch (InterruptedException e) {
				
			}
			
		}
		
		numero = valor;
		
		disponible = true;
		
		notify ();
		
		System.out.println ("SE PRODUCE: " + numero);
		
	}

}
