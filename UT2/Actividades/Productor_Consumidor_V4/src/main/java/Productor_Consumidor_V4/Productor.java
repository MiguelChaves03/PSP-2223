package Productor_Consumidor_V4;

public class Productor extends Thread {
	
	private Cola cola;
	
	private int n;
	
	public Productor (Cola c, int n) {
		
		cola = c;
		this.n = n;
		
	}
	
	public void run () {
		
		for (int i = 0; i < 5; i ++) {
			
			cola.put (i);
						
			try {
				
				sleep (500);
				
				System.out.print ("PING ");
				
				sleep (500);
				
				System.out.print ("PONG ");

			} catch (InterruptedException e) {
				
			}
			
		}
		
	}

}
