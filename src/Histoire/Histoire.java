package Histoire;

import personnages.*;

public class Histoire {
	public static void main(String[] args) {
		Humain humain1 = new Humain("Ethan", "Pastis", 50);
		humain1.direBonjour();
		humain1.acheter("verre de pastis", 3);
		humain1.boire();
		humain1.acheter("metre de pastis", 33);
		humain1.acheter("metre de pastis", 33);
		
		Commercant commercant1 = new Commercant("BarMan", 20);
		commercant1.direBonjour();
		commercant1.seFaireExtorquer();
		commercant1.recevoir(33);
		commercant1.boire();
		
		Yakuza yakuza1 = new Yakuza("Nicolas", "Whisky", 100000, "Les R�publicains");
		yakuza1.direBonjour();
		yakuza1.extorquer(commercant1);
		
        Ronin ronin1 = new Ronin("Adam", "Pastis", 60);
        ronin1.direBonjour();
        ronin1.donner(commercant1);
	}
}
