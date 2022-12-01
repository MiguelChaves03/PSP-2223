package Bloqueo_Hilo_V2;

public class HiloCadena extends Thread {
	
	private ObjetoCompartido objeto;
	
	String cad;
	
	public HiloCadena (ObjetoCompartido c, String s) {
		
		this.objeto = c;
		this.cad = s;
		
	}
	
	public void run () {
		
		synchronized (objeto) {
			
			for (int i = 0; i < 10; i ++) {
				
				objeto.PintaCadena (cad);
				
				objeto.notify ();
				
				try {
					
					objeto.wait ();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace ();
					
				}
				
			}
			
			objeto.notify ();
			
		}
		
		System.out.print ("\n" + cad + " finalizado");
		
	}

}
