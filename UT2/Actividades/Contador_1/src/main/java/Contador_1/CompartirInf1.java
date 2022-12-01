package Contador_1;

public class CompartirInf1 {
	
	public static void main (String [] args) {
		
		Contador cont = new Contador (100);
		
		HiloA a = new HiloA ("Hilo A", cont);
		
		HiloB b = new HiloB ("Hilo B", cont);
		
		a.start ();
		
		b.start ();
		
	}

}
