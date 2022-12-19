package Productor_Consumidor_V3;

public class Product_Consum_V3 {
	
	public static void main (String [] args) {
		
		Cola cola = new Cola ();
		
		Productor p1 = new Productor (cola, 1);
		
		Consumidor c1 = new Consumidor (cola, 1);
		
		Productor p2 = new Productor (cola, 2);
		
		Consumidor c2 = new Consumidor (cola, 2);

		p1.start ();
		
		c1.start ();
		
		p2.start ();

		c2.start ();

	}

}
