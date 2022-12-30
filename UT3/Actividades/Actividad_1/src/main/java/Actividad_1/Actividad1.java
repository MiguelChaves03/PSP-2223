package Actividad_1;

import java.net.*;
import java.util.*;

public class Actividad1 {
	
	public static void main (String [] args) {
		
		InetAddress dir = null;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("INTRODUZCA UNA DIRECCION IP: "); // 172.30.160.1 // 192.168.0.214
		
		String ip  = sc.next ();
		
		System.out.println ("======================================================================");
		
		try {
			
			dir = InetAddress.getByName (ip);
						
			InetAddress dir2;

			dir2 = InetAddress.getLocalHost ();

			System.out.println ("\tMetodo getLocalHost (): " + dir2);
			
			System.out.println ("\tMetodo getHostName (): " + dir.getHostName ());
			
			System.out.println ("\tMetodo getHostAddress (): " + dir.getHostAddress ());
			
			InetAddress dir3;

			dir3 = InetAddress.getLoopbackAddress ();

			System.out.println ("\tMetodo getLoopbackAddress (): " + dir3);

			System.out.println ("\tMetodo toString (): " + dir.toString ());
			
		} catch (UnknownHostException e1) {
			
			e1.printStackTrace ();
			
		}
				
	}

}
