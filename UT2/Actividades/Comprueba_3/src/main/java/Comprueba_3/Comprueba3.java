package Comprueba_3;

import java.io.*;

public class Comprueba3 implements Runnable {
	
	static String [] ficheros = new String [] {"C:\\Users\\mchar\\OneDrive\\Escritorio\\PSP\\PSP-2223\\UT2\\Actividades\\Comprueba_3\\src\\main\\java\\Comprueba_3\\Fichero1.txt",
	"C:\\Users\\mchar\\OneDrive\\Escritorio\\PSP\\PSP-2223\\UT2\\Actividades\\Comprueba_3\\src\\main\\java\\Comprueba_3\\Fichero2.txt"};
	
	String fichero;
	
	public Comprueba3 (String fichero) {
		
		this.fichero = fichero;
		
	}
	
	public void run () {
		
		long t_comienzo, t_fin;
		
		t_comienzo = System.currentTimeMillis ();

		leer (fichero);
		
		t_fin = System.currentTimeMillis ();
		
		long tiempoTotal = t_fin - t_comienzo;
		
		System.out.println ("");
		
		System.out.println ("El proceso ha tardado: " + tiempoTotal + " milisegundos.");
		
	}
	
	public void leer (String fichero) {
		
		Integer letras = 0;
		
		FileReader fr = null;
		
        try {

            fr = new FileReader (fichero);

            int caract = fr.read ();

            while (caract != -1) {

                caract = fr.read ();
                
                letras ++;
                
            }
            
        }
        
        catch (FileNotFoundException e) {

            System.out.println ("Error de fichero no encontrado");

            System.out.println (e.getMessage());
            
        }
        
        catch (Exception e) {

            System.out.println ("Error de lectura del fichero");
            
            System.out.println (e.getMessage ());
            
        }
        
        finally {

            try {

                if (fr != null) {
                	                    
                	System.out.println ("El fichero tiene: " + letras + " letras.");
                	
                    fr.close ();
                	
                }
                    
            }
            
            catch (Exception e) {
            	
                System.out.println ("Error al cerrar el fichero");
                
                System.out.println (e.getMessage ());
                
            }
            
        }
		
	}
	
	public static void main (String [] args) {
		
		for (int i = 0; i < ficheros.length; i ++) {
			
			Comprueba3 hilo = new Comprueba3 (ficheros [i]);
			
			new Thread (hilo).start ();
						
		}
						
	}

}
