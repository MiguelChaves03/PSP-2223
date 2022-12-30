package Ejemplo_UDP;

import java.net.*;

public class UDPcliente {
	
	public static void main (String [] args) throws Exception {
		
		InetAddress destino = InetAddress.getLocalHost ();
		
		int port = 12345;
		
		byte [] mensaje = new byte [1024];
		
		String Saludo = "Enviando saludos !!";
		
		mensaje = Saludo.getBytes ();
		
		DatagramPacket envio = new DatagramPacket (mensaje, mensaje.length, destino, port);
		
		DatagramSocket socket = new DatagramSocket (34567);
		
		System.out.println ("Enviando Datagrama de longitud: " + mensaje.length);
		
		System.out.println ("Host destino: " + destino.getHostName ());
		
		System.out.println ("IP destino: " + destino.getHostAddress ());
		
		System.out.println ("Puerto local del socket: " + socket.getLocalPort ());
		
		System.out.println ("Puerto al que envio: " + envio.getPort ());
		
		socket.send (envio);
		
		socket.close ();
	}

}
