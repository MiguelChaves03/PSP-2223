package Ejemplo_UDP_V2;

import java.io.IOException;
import java.net.*;

public class UDPservidor {
	
	public static void main (String [] args) throws IOException {
		
		DatagramSocket socket = new DatagramSocket (12345);
		
		System.out.println ("Servidor Esperando Datagrama ...");
		
		DatagramPacket recibo;
		
		byte [] bufer = new byte [1024];
		
		recibo = new DatagramPacket (bufer, bufer.length);
		
		socket.receive (recibo);
		
		String mensaje = new String (recibo.getData ()).trim ();
		
		System.out.println ("Servidor Recibe: " + mensaje);
		
		int contador = 0;
		
		for (int i = 0; i < mensaje.length (); i ++) {
			
			if (mensaje.charAt (i) == 'a') {
				
				contador ++;
				
			}
			
		}
		
		InetAddress IPOrigen = recibo.getAddress ();
		
		int puerto = recibo.getPort ();
		
		System.out.println ("Enviando numero de apariciones de la letra a => " + contador);
		
		byte b = (byte) contador;
		
		byte [] enviados = new byte [1024];
		
		enviados [0] = b;
		
		DatagramPacket envio = new DatagramPacket (enviados, enviados.length, IPOrigen, puerto);
		
		socket.send (envio);
		
		System.out.println ("Cerrando conexion ...");
		
		socket.close ();
		
	}

}
