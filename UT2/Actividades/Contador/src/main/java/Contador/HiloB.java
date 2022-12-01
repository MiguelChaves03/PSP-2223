package Contador;

public class HiloB extends Thread {
	
	private Contador contador;
	
	public HiloB (String n, Contador c) {
		
		setName (n);
		contador = c;
		
	}
	
	public void run () {
		
		for (int i = 0; i < 3000; i ++) {
			
			contador.decrementar ();
			
			try {
				
				sleep (50);
				
			} catch (InterruptedException e) {
				
			}
			
		}
		
		System.out.println (getName () + " contador vale " + contador.valor ());
		
	}

}
