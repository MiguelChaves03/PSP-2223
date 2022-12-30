package Actividad_4;

import java.net.*;

public class Actividad4Servidor {
	
	public static void main (String [] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket (12345);
		
		DatagramPacket recibo;
		
		byte [] bufer = new byte [1024];
		
		recibo = new DatagramPacket (bufer, bufer.length);
		
		socket.receive (recibo);
		
		String mensaje = new String (recibo.getData ()).trim ();
		
		System.out.println ("RECIBIENDO EL DOBLE DE UN NUMERO ... => " + Integer.valueOf (mensaje) * Integer.valueOf (mensaje));
		
		socket.close ();
		
	}

}
