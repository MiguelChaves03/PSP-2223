package Actividad_2;

import java.net.*;

public class Actividad2 {
	
	public static void main (String [] args) throws Exception {
		
		ServerSocket Servidor = new ServerSocket (6000);
		
		Socket Cliente1 = new Socket ("localhost", 6000);
				
		Cliente1 = Servidor.accept ();
		
		System.out.println ("Puerto Local Cliente 1: " + Cliente1.getLocalPort ());
		
		System.out.println ("Puerto Remoto Cliente 1: " + Cliente1.getPort ());
		
		Cliente1.close ();
		
		System.out.println ("");
		
		Socket Cliente2 = new Socket ("localhost", 6000);
		
		Cliente2 = Servidor.accept ();
		
		System.out.println ("Puerto Local Cliente 2: " + Cliente2.getLocalPort ());
		
		System.out.println ("Puerto Remoto Cliente 2: " + Cliente2.getPort ());
		
		Cliente2.close ();
		
		System.out.println ("");
		
		Socket Cliente = new Socket ("localhost", 6000);
		
		System.out.println ("Puerto Local Cliente: " + Cliente.getLocalPort ());
		
		System.out.println ("Puerto Remoto Cliente: " + Cliente.getPort ());
				
		InetAddress i = Cliente.getInetAddress ();
		
		System.out.println ("Host Remoto Cliente: " + i.getHostName ().toString ());
		
		System.out.println ("IP Host Remoto Cliente: " + i.getHostAddress ().toString ());
		
		Cliente.close ();
		
		Servidor.close ();
		
	}

}
