package Actividad_2;

public class Actividad2 {

	public static void main (String [] args) {
		
		Clase1 h1 = new Clase1 ();
		
		new Thread (h1).start ();;

		Clase2 h2 = new Clase2 ();		

		new Thread (h2).start ();;
		
	}
	
}
