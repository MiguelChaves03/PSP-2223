package Contador_1;

public class Contador {
	
	private int c = 0;
	
	Contador (int c) {
		
		this.c = c;
		
	}
	
	public void incrementar () {
		
		c = c + 1;
		
	}
	
	public void decrementar () {
		
		c = c - 1;
		
	}
	
	public int valor () {
		
		return c;
		
	}

}
