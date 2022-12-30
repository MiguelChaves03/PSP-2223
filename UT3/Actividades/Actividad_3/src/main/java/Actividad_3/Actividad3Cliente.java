package Actividad_3;

import java.net.*;

public class Actividad3Cliente {
	
	public static void main (String [] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket (12345);
		
		DatagramPacket recibo;
		
		byte [] bufer = new byte [1024];
		
		recibo = new DatagramPacket (bufer, bufer.length);
		
		socket.receive (recibo);
		
		String mensaje = new String (recibo.getData ()).trim ();
		
		System.out.println ("RECIBIENDO UN SALUDO ... => " + mensaje.toLowerCase ());
		
		socket.close ();
		
	}

}
