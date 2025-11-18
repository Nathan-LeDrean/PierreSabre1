package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
    protected static final int TAILLE_MEMOIRE = 30;   
    protected Humain[] memoire;
    protected int nbConnaissances = 0;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.memoire = new Humain[TAILLE_MEMOIRE];
	}
    protected void parler(String texte) {
        System.out.println(nom + " - " + "\"" + texte + "\"");
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
    		parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + objet + " � " + prix + " sous");
    	}else {
    		parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir un " + objet + " �\r\n "
    				+ prix + " sous");
    	}
        
    }
    
    public void faireConnaissanceAvec(Humain autreHumain) {
        this.direBonjour();
        autreHumain.direBonjour();
        this.memoriser(autreHumain);
        autreHumain.memoriser(this);
    }
    
    protected void memoriser(Humain humain) {
        if (nbConnaissances < TAILLE_MEMOIRE) {
            memoire[nbConnaissances] = humain;
            nbConnaissances++;
        } else {
            for (int i = 0; i < TAILLE_MEMOIRE - 1; i++) {
                memoire[i] = memoire[i + 1];
            }
            memoire[TAILLE_MEMOIRE - 1] = humain;
        }
    }

    public void listerConnaissance() {
        if (nbConnaissances == 0) {
            parler("Je ne connais encore personne.");
            return;
        }

        StringBuilder texte = new StringBuilder("Je connais beaucoup de monde dont : ");
        for (int i = 0; i < nbConnaissances; i++) {
            texte.append(memoire[i].getNom());
            if (i < nbConnaissances - 1) {
                texte.append(", ");
            }
        }
        parler(texte.toString());
    }
    

    
}
