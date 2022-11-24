package Comprueba_2;

public class Comprueba2 implements Runnable {
	
	String texto;
	
	public Comprueba2 (String texto) {
		
		this.texto = texto;
		
	}
	
	public void run () {
				
		System.out.println ("Hola mundo, " + texto + ", " + Thread.currentThread ().getId ());
		
	}
	
	public static void main (String [] args) {

		Comprueba2 hilo1 = new Comprueba2 ("M");
		
		Comprueba2 hilo2 = new Comprueba2 ("A");
		
		Comprueba2 hilo3 = new Comprueba2 ("C");
		
		Comprueba2 hilo4 = new Comprueba2 ("R");
		
		Comprueba2 hilo5 = new Comprueba2 ("L");
		
		new Thread (hilo1).start ();
		
		new Thread (hilo2).start ();
		
		new Thread (hilo3).start ();
		
		new Thread (hilo4).start ();
		
		new Thread (hilo5).start ();
		
	}

}
