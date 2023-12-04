package spielerKartenBaum;

import main.Zugstapel;

public class SpielerKarten {

	Zugstapel zg;
	String farbe;
	
	public SpielerKarten() {
		Baum gelb = new Baum();
		Baum rot = new Baum();
		Baum gruen = new Baum();
		Baum blau = new Baum();
	}

	public void karteGespielt() {
		
	}
	
	public void zieheNeueKarte() {
		farbe = zg.getNeueKarteFarbe();
		
		switch(farbe) {
		case "Rot":
			
			break;
		case "Gelb":
			break;
		case "Gruen":
			break;
		case "Blau":
			break;	
		}
	}
	

}
