package personnages;

import java.util.Random;

import javax.naming.ldap.Rdn;

public class Traitre extends Samourai{
	
	private int niveauTraitrise = 0;
	private Random rnd = new Random();
	
	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}

	public int getNiveauTraitrise() {
		return niveauTraitrise;
	}
	
	@Override
    public void direBonjour() {
        super.direBonjour();
        parler("Mais je suis un traître et mon niveau de traîtrise est: " + niveauTraitrise + ". Chut!");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise >= 3) {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}else {
			int argentVole = commercant.getArgent() / 5 * 2;
			
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !\r\n"
					+ "Donne-moi" + argentVole + " sous ou gare à toi !");
			
			commercant.perdreArgent(argentVole);
			this.gagnerArgent(argentVole);
			niveauTraitrise ++;
			commercant.parler("Tout de suite grand " + this.getNom());
			
		}
	}
	
	public void  faireLeGentil(Humain humain) {
		if (nbConnaissances == 0) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else {
			int donArgent = getArgent() / 20;
			int indexAleatoire = rnd.nextInt(nbConnaissances);
			Humain humainChoisi = memoire[indexAleatoire];
			
			
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + donArgent + " sous.");
			perdreArgent(donArgent);
			humainChoisi.gagnerArgent(donArgent);
			humainChoisi.parler("Merci " + this.getNom() + ". Vous êtes quelqu'un de bien.");
			niveauTraitrise --;
		}
	}

}
