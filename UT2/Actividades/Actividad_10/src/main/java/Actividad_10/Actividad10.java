package Actividad_10;

public class Actividad10 {
	
	public static void main (String [] args) {
		
		Cola cola = new Cola ();
		
		Productor p1 = new Productor (cola, 1);
		
		Consumidor c1 = new Consumidor (cola, 1);
				
		Consumidor c2 = new Consumidor (cola, 2);

		p1.start ();
		
		c1.start ();
		
		c2.start ();

	}

}
