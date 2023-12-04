package main;

public class Zugstapel {
	String[] farben = {"Rot", "Blau", "Gruen", "Gelb"};
	int[] werte = {0,1,2,3,4,5,6,7,8,9};
	
	String farbe;
	int wert;
	
	
	public String getNeueKarteFarbe() {
		return farbe = farben[(int) (Math.random()+3)];
		
	}
	public int getNeueKarteWert() {
		return wert = werte[(int) (Math.random()+9)];
	}
	
	public static void main(String[] args) {
		
		
	
	}
	
}
