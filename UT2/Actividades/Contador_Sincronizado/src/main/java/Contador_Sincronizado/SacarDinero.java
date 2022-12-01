package Contador_Sincronizado;

public class SacarDinero extends Thread {
	
	private Cuenta c;
	
	String nom;
	
	public SacarDinero (String n, Cuenta c) {
		
		super (n);
		
		this.c = c;
		
	}
	
	public void run () {
		
		for (int i = 1; i <= 4; i ++) {
			
			c.RetirarDinero (10, getName ());
			
		}
		
	}

}
