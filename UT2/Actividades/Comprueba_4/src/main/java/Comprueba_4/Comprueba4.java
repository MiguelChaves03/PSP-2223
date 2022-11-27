package Comprueba_4;

import java.io.*;

public class Comprueba4 implements Runnable {
	
	static String [] ficheros = new String [] {"C:\\Users\\mchar\\OneDrive\\Escritorio\\PSP\\PSP-2223\\UT2\\Actividades\\Comprueba_4\\src\\main\\java\\Comprueba_4\\Fichero1.txt",
			"C:\\Users\\mchar\\OneDrive\\Escritorio\\PSP\\PSP-2223\\UT2\\Actividades\\Comprueba_4\\src\\main\\java\\Comprueba_4\\Fichero2.txt"};
	
	String fichero;
	
	public Comprueba4 (String fichero) {
		
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
		
		Integer palabras = 1;
		
		Integer letras = 0;
		
		FileReader fr = null;
		
        try {

            fr = new FileReader (fichero);

            int caract = fr.read ();
            
            if (caract == -1) {
            	
            	palabras = 0;
            	
            }

            while (caract != -1) {
            	
            	if (caract == ' ') {
            		
            		palabras ++;
            		
            	}

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
                	
                	if (palabras == 1) {
                		
                		if (letras == 1) {
                			
                        	System.out.println ("El fichero tiene: " + letras + " letra y " + palabras + " palabra.");

                		} else {
                			
                        	System.out.println ("El fichero tiene: " + letras + " letras y " + palabras + " palabra.");
                			
                		}
                		
                	} else {
                		
                    	System.out.println ("El fichero tiene: " + letras + " letras y " + palabras + " palabras.");

                	}
                	
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
			
			Comprueba4 hilo = new Comprueba4 (ficheros [i]);
			
			new Thread (hilo).start ();
						
		}
						
	}

}
