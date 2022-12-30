package Ejemplo_UDP;

import java.net.*;

public class UDPservidor {
	 
	public static void main (String [] args) throws Exception {
		
		byte [] bufer = new byte [1024];
		
		DatagramSocket socket = new DatagramSocket (12345);
		
		System.out.println ("Esperando Datagrama ...");
		
		DatagramPacket recibo = new DatagramPacket (bufer, bufer.length);
		
		socket.receive (recibo);
		
		int bytesRec = recibo.getLength ();
		
		String paquete = new String (recibo.getData ());
		
		System.out.println ("Numero de Bytes recibidos: " + bytesRec);
		
		System.out.println ("Contenido del Paquete: " + paquete.trim ());
		
		System.out.println ("Puerto origen del mensaje: " + recibo.getPort ());
		
		System.out.println ("IP de origen: " + recibo.getAddress ().getHostAddress ());
		
		System.out.println ("Puerto destino del mensaje: " + socket.getLocalPort ());
		
		socket.close ();
		
	}

}
