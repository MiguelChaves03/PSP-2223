package Productor_Consumidor_V3;

public class Produc_Consum_V3 {
	
	public static void main (String [] args) {
		
		Cola cola = new Cola ();
		
		Productor p = new Productor (cola, 1);
		
		Consumidor c = new Consumidor (cola, 1);
		
		p.start ();
		
		c.start ();
		
	}

}
