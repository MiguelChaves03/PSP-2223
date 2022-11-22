package Cajera_V2;

public class Cajera implements Runnable {

	private String nombre;
	
	private Cliente cliente;
	
	private long timeStamp;
	
	public Cajera (String nombre, Cliente cliente, long timeStamp) {
		
		this.nombre = nombre;
		this.cliente = cliente;
		this.timeStamp = timeStamp;
		
	}
		
	public void run () {
		
		System.out.println ("LA CAJERA " + this.nombre +
				" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre () +
				" EN EL TIEMPO: " + (System.currentTimeMillis () - timeStamp) / 1000 +
				" SEG");
		
		System.out.println ("");
		
		for (int i = 0; i < cliente.getCarroCompra ().length; i ++) {
			
			this.esperarXsegundos (cliente.getCarroCompra () [i]);
			
			System.out.println ("PROCESANDO EL PRODUCTO " + (i + 1) +
					" -> TIEMPO: " + (System.currentTimeMillis () - timeStamp) / 1000 +
					" SEG");
			
		}
		
		System.out.println ("");
		
		System.out.println ("LA CAJERA " + this.nombre + " HA TERMINADO DE PROCESAR " +
				cliente.getNombre () + " EN EL TIEMPO: " +
				(System.currentTimeMillis () - timeStamp) / 1000 + " SEG");
		
		System.out.println ("");
		
	}
	
	private void esperarXsegundos (int segundos) {
		
		try {
			
			Thread.sleep (segundos * 1000);
			
		} catch (InterruptedException ex) {
			
			Thread.currentThread ().interrupt ();
			
		}
		
	}

}
