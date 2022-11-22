package Comprueba_1;

public class Comprueba1 extends Thread {
	
	public Comprueba1 () {
		
		super ();
				
	}
	
	public void run () {
		
		System.out.println ("Hola mundo");
		
	}
	
	public static void main (String [] args) {
		
		Comprueba1 h1 = new Comprueba1 ();
		
		h1.start ();

		Comprueba1 h2 = new Comprueba1 ();
		
		h2.start ();

		Comprueba1 h3 = new Comprueba1 ();
		
		h3.start ();

		Comprueba1 h4 = new Comprueba1 ();

		h4.start ();

		Comprueba1 h5 = new Comprueba1 ();

		h5.start ();
		
	}

}
