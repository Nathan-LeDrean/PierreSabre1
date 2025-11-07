package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
    private void parler(String texte) {
        System.out.println("\"" + texte + "\"");
    }
    
	public String getNom() {
		return nom;
	}

	public String getBoissonFavorite() {
		return boissonFavorite;
	}

	public int getArgent() {
		return argent;
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
    public void direBonjour() {
        parler("Bonjour je m'appelle " + nom + " et j'aime le " +  boissonFavorite + ".");
    }
    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite +  " ! GLOUPS !");
    }
    public void acheter(String objet, int prix) {
    	if (argent >= prix) {
    		perdreArgent(prix);
    		parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + objet + " à " + prix + " sous");
    	}else {
    		parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + objet + " à\r\n "
    				+ prix + " sous");
    	}
        
    }
    

    
}
