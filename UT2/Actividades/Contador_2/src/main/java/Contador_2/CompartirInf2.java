package Contador_2;

public class CompartirInf2 {

	public static void main (String [] args) {
		
		Contador cont = new Contador (200);
		
		HiloA a = new HiloA ("Hilo A", cont);
		
		HiloB b = new HiloB ("Hilo B", cont);
		
		a.start ();
		
		b.start ();
		
	}

}
