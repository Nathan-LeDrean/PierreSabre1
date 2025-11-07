package Histoire;

import personnages.Humain;

public class Histoire {
	public static void main(String[] args) {
		Humain humain1 = new Humain("Ethan", "Pastis", 50);
		humain1.direBonjour();
		humain1.acheter("verre de pastis", 3);
		humain1.boire();
		humain1.acheter("metre de pastis", 33);
		humain1.acheter("metre de pastis", 33);
	}
}
