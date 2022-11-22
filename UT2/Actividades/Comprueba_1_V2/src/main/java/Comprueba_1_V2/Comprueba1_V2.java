package Comprueba_1_V2;

public class Comprueba1_V2 extends Thread {

	public Comprueba1_V2 () {
		
		super ();
				
	}
	
	public void run () {
		
		System.out.println (getId ());
		
	}
	
	public static void main (String [] args) {
		
		Comprueba1_V2 h1 = new Comprueba1_V2 ();
		
		h1.start ();

		Comprueba1_V2 h2 = new Comprueba1_V2 ();
		
		h2.start ();

		Comprueba1_V2 h3 = new Comprueba1_V2 ();
		
		h3.start ();

		Comprueba1_V2 h4 = new Comprueba1_V2 ();

		h4.start ();

		Comprueba1_V2 h5 = new Comprueba1_V2 ();

		h5.start ();
		
	}

}
