package Ejemplo_UDP_V2;

import java.util.*;
import java.net.*;
import java.io.*;

public class UDPcliente {
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String [] args) throws IOException {
		
		DatagramSocket clienteSocket = new DatagramSocket ();
		
		InetAddress IPServidor = InetAddress.getLocalHost ();
		
		int puerto = 12345;
		
		System.out.println ("Introduce mensaje: ");
		
		String cadena = sc.nextLine ();
		
		byte [] enviados = new byte [1024];
		
		enviados = cadena.getBytes ();
		
		DatagramPacket envio = new DatagramPacket (enviados, enviados.length, IPServidor, puerto);
		
		clienteSocket.send (envio);
		
		byte [] recibidos = new byte [2];
		
		DatagramPacket recibo = new DatagramPacket (recibidos, recibidos.length);
		
		System.out.println ("Esperando respuesta ...");
		
		clienteSocket.receive (recibo);
		
		byte [] hh = recibo.getData ();
		
		int numero = hh [0];
		
		System.out.println ("Recibo Nº de caracteres que son a => " + numero);
		
		clienteSocket.close ();
		
	}

}
