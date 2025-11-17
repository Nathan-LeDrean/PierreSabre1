package personnages;

public class Ronin extends Humain {

    private int honneur = 1;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
    }

    public void donner(Commercant beneficiaire) {
        int don = (int)(getArgent() * 0.1);
        parler("Je donne " + don + " sous à " + beneficiaire.getNom() + ".");
        perdreArgent(don);
        beneficiaire.recevoir(don);
    }
}

