package Actividad_5;

import java.net.*;
import java.util.*;

public class Actividad5 {
	
	public static void main (String [] args) throws Exception {
		
		ServerSocket Servidor = new ServerSocket (6000);
				
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("INTRODUZCA EL NUMERO DE CLIENTES: ");
		
		int clientes = sc.nextInt ();
		
		System.out.println ("");
		
		for (int i = 1; i <= clientes; i ++) {
			
			Socket Cliente = new Socket ("localhost", 6000);
			
			Cliente = Servidor.accept ();
			
			System.out.println ("Cliente " + i);

			System.out.println ("Puerto Local: " + Cliente.getLocalPort ());
			
			System.out.println ("Puerto Remoto: " + Cliente.getPort ());
			
			Cliente.close ();
			
			System.out.println ("");

		}
		
		Servidor.close ();

	}	

}
