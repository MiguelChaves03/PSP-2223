package Productor_Consumidor_V4;

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
				
	}

}
