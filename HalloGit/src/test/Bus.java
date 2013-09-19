package test;



public class Bus {
	private int anzahl;
	private String linie;
	private boolean diesel;
	private int gewicht;

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public Bus(int anzahl) {
		super();
		this.anzahl = anzahl;
		
	}
	
}
