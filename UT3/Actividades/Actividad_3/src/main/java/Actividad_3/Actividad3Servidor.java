package Actividad_3;

import java.net.*;

public class Actividad3Servidor {
	
	public static void main (String [] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket ();
		
		InetAddress IPServidor = InetAddress.getLocalHost ();
		
		int puerto = 12345;
		
		String saludo = "HOLA";
		
		byte [] enviados = new byte [1024];
		
		enviados = saludo.getBytes ();
	
		DatagramPacket envio = new DatagramPacket (enviados, enviados.length, IPServidor, puerto);
		
		socket.send (envio);
		
		System.out.println ("ENVIANDO UN SALUDO ... => " + saludo);

		socket.close ();
		
	}

}
