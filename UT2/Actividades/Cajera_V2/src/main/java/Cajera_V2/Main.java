package Cajera_V2;

public class Main {

	public static void main (String [] args) {
		
		Cliente cliente1 = new Cliente ("Cliente 1", new int [] {2, 2, 1, 5, 2, 3});
		
		Cliente cliente2 = new Cliente ("Cliente 2", new int [] {1, 3, 5, 1, 1});
				
		long initialTime = System.currentTimeMillis ();
		
		Cajera hilo1 = new Cajera ("Cajera 1", cliente1, initialTime);
		
		new Thread (hilo1).start ();

		Cajera hilo2 = new Cajera ("Cajera 2", cliente2, initialTime);
		
		new Thread (hilo2).start ();
				
		// SE TARDA 15 SEGUNDOS EN PROCESAR A LOS 2 CLIENTES
		
	}

}
