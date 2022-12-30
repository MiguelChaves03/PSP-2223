package Actividad_6;

import java.net.*;
import java.io.*;

public class Actividad6Cliente {
	
	public static void main (String [] args) throws Exception {
		
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		
		InetAddress IPServidor = InetAddress.getLocalHost ();

		int puerto = 12345;

		DatagramSocket socket = new DatagramSocket ();
		
		String mensaje = "";
		
		while (!mensaje.trim ().equals ("*")) {
			
			System.out.println ("INTRODUZCA UNA CADENA: ");
			
			mensaje = in.readLine ();
			
			System.out.println ("");
									
			DatagramPacket envio = new DatagramPacket (mensaje.getBytes (), mensaje.length (), IPServidor, puerto);
			
			socket.send (envio);
			
			System.out.println ("ENVIANDO: " + mensaje);
			
			System.out.println ("");
 
		}
		
		socket.close ();
		
	}

}
