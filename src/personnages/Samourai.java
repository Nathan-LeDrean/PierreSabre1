package personnages;

public class Samourai extends Ronin {

    private String seigneur;

    public Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        this.seigneur = seigneur;
    }
    
}