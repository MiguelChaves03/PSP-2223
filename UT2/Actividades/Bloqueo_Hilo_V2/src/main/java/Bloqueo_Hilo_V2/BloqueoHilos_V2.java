package Bloqueo_Hilo_V2;

public class BloqueoHilos_V2 {
	
	public static void main (String [] args) {
		
		ObjetoCompartido com = new ObjetoCompartido ();
		
		HiloCadena a = new HiloCadena (com, " TIC ");
		
		HiloCadena b = new HiloCadena (com, " TAC ");
		
		a.start ();
		
		b.start ();
		
	}

}
