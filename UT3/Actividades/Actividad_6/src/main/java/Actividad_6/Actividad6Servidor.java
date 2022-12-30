package Actividad_6;

import java.net.*;

public class Actividad6Servidor {
	
	public static void main (String [] args) throws Exception {
		
		int puerto = 12345;

		DatagramSocket socket = new DatagramSocket (puerto);
		
		DatagramPacket recibo;
		
		String mensaje = "";
		
		while (!mensaje.trim ().equals ("*")) {
			
			byte [] bufer = new byte [1024];
			
			recibo = new DatagramPacket (bufer, bufer.length);
									
			socket.receive (recibo);
			
			mensaje = new String (recibo.getData ()).toUpperCase ();

			System.out.println ("RECIBIENDO: " + mensaje.trim ());
			
			System.out.println ("");
			
		}
		
		socket.close ();
		
	}

}
