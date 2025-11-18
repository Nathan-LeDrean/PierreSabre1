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
		
		Yakuza yakuza1 = new Yakuza("Nicolas", "Whisky", 100000, "Les Républicains");
		yakuza1.direBonjour();
		yakuza1.extorquer(commercant1);
		
        Ronin ronin1 = new Ronin("Adam", "Pastis", 60);
        ronin1.direBonjour();
        ronin1.donner(commercant1);
        
        ronin1.provoquer(yakuza1);
        
        Commercant commercant2 =  new Commercant("BarMan2", 40);
        Commercant commercant3 =  new Commercant("BarMan3", 10);
        
        commercant1.faireConnaissanceAvec(ronin1);
        commercant1.faireConnaissanceAvec(yakuza1);
        commercant1.faireConnaissanceAvec(commercant2);
        commercant1.faireConnaissanceAvec(commercant3);

        commercant1.listerConnaissance();
        ronin1.listerConnaissance();
        yakuza1.listerConnaissance();
        
        yakuza1.direBonjour();
        
        Samourai samourai1 = new Samourai("Laurent Nunez", "Policier1", "délinquant", 80);
        samourai1.direBonjour();
        samourai1.boire();
        
        Traitre traitre1 = new Traitre("Laurent Nunez", "Traitre1", "délinquant", 80);
        traitre1.direBonjour();
        traitre1.ranconner(commercant1);
        traitre1.direBonjour();
        traitre1.faireConnaissanceAvec(humain1);
        traitre1.faireLeGentil(humain1);
        traitre1.direBonjour();
        
	}
}
