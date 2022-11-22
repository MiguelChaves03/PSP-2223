package Primer_Hilo_R;

public class UsaPrimerHiloR {
	
	public static void main (String [] args) {
		
		PrimerHiloR hilo1 = new PrimerHiloR ();
		
		new Thread (hilo1).start ();
		
		PrimerHiloR hilo2 = new PrimerHiloR ();

		new Thread (hilo2) .start ();
		
		PrimerHiloR hilo3 = new PrimerHiloR ();
		
		new Thread (hilo3).start ();
		
	}

}
