package spielerKartenBaum;

import main.Zugstapel;

public class SpielerKarten {

	Zugstapel zg;
	String farbe;
	
	Baum gelb = new Baum();
	Baum rot = new Baum();
	Baum gruen = new Baum();
	Baum blau = new Baum();
	
	public SpielerKarten() {
		
	}

	public void karteGespielt() {
		
	}
	
	public void zieheNeueKarte() {
		farbe = zg.getNeueKarteFarbe();
		
		switch(farbe) {
		case "Rot":
			rot.insert(zg.getNeueKarteWert());
			break;
		case "Gelb":
			gelb.insert(zg.getNeueKarteWert());
			break;
		case "Gruen":
			gruen.insert(zg.getNeueKarteWert());
			break;
		case "Blau":
			blau.insert(zg.getNeueKarteWert());
			break;
		default:
			System.out.println("Error, no color found!");
			break;
		}
	}
	

}
