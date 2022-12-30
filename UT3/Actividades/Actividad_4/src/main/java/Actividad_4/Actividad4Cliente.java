package Actividad_4;

import java.net.*;
import java.util.*;

public class Actividad4Cliente {
	
	private static Scanner sc = new Scanner (System.in);

	public static void main (String [] args) throws Exception {
		
		DatagramSocket clienteSocket = new DatagramSocket ();
		
		InetAddress IPServidor = InetAddress.getLocalHost ();
		
		int puerto = 12345;
		
		System.out.println ("INTRODUCE UN NUMERO: ");
		
		String cadena = sc.nextLine ();
		
		byte [] enviados = new byte [1024];
		
		enviados = cadena.getBytes ();
		
		DatagramPacket envio = new DatagramPacket (enviados, enviados.length, IPServidor, puerto);
		
		clienteSocket.send (envio);
		
		System.out.println ("ENVIANDO UN NUMERO ... => " + cadena);
		
		clienteSocket.close ();
		
	}

}
