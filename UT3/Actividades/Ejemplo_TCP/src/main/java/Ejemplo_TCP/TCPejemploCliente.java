package Ejemplo_TCP;

import java.net.*;
import java.io.*;

public class TCPejemploCliente {
	
	public static void main (String [] args) throws Exception {
		
		String Host = "localhost";
		
		int Puerto = 6000;
		
		System.out.println ("PROGRAMA CLIENTE INICIADO ...");
		
		Socket Cliente = new Socket (Host, Puerto);
		
		DataOutputStream flujoSalida = new DataOutputStream (Cliente.getOutputStream ());
		
		flujoSalida.writeUTF ("Saludos al SERVIDOR DESDE EL CLIENTE");
		
		DataInputStream flujoEntrada = new DataInputStream (Cliente.getInputStream ());
		
		System.out.println ("Recibiendo del SERVIDOR: \n\t" + flujoEntrada.readUTF ());
		
		flujoEntrada.close ();
		
		flujoSalida.close ();
		
		Cliente.close ();
		
	}

}
