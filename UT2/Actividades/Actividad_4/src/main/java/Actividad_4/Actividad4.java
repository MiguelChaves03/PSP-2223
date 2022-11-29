package Actividad_4;

import java.util.*;

public class Actividad4 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		MyHilo hilo = new MyHilo ();

		String cad;
		
		while (true) {
			
			System.out.print ("\tIntroduce CADENA: ");
			cad = sc.nextLine ();
			
			if (!hilo.isAlive ()) {
				
				System.out.println ("");
				
				System.out.println ("LANZANDO HILO ...");
				
				System.out.println ("");
				
				hilo.start ();
				
			}

			if (cad.equals ("*")) {
				
				break;
			
			}
			
			if (cad.equals ("S")) {
				
				hilo.Suspende ();
			
			}
			
			if (cad.equals ("R")) {
				
				hilo.Reanuda ();
			
			}
			
		}		
		
		hilo.Reanuda ();
		
		System.out.println ("");
		
		System.out.println ("CONTADOR:" + hilo.getContador ());
		
		System.out.println ("");
		
		hilo.pararHilo ();
		
	}

}
