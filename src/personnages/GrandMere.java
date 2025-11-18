package personnages;

import java.util.Random;

public class GrandMere extends Humain{
	
	private enum TypeHumain {
		Commercant, Humain, Ronin, Samourai, Yakuza
	}
	
	private Random rnd = new Random();
	
	public GrandMere(String nom, int argent) {
		super(nom, "Vin rouge", argent);
	}

	@Override
    protected void memoriser(Humain humain) {
        if (nbConnaissances < 5) {
            memoire[nbConnaissances] = humain;
            nbConnaissances++;
        } else {
        	parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
        }
    }
	private String  humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		return types[rnd.nextInt(types.length)].name();
	}
	public void ragoter() {
		for (int i = 0; i < nbConnaissances; i ++) {
			Humain h = memoire[i];
			if (h instanceof Traitre) {
				parler("Je sais que " + h.getNom() +" est un traître. Petit chenapan !");
			}else {
				parler("Je crois que " + h.getNom() + " est un " + humainHasard() + ".");
			}
		}
		
	}
}
