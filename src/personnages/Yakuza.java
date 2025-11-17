package personnages;

public class Yakuza extends Humain{
	private int reputation;
	private String clan;
	
	public Yakuza(String nom,  String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + "si tu tiens � la vie donne moi ta bourse et un m�tre de pastis!");
		int argentVole = victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler("J�ai piqu� les "  + argentVole + " sous de " + victime.getNom()+ " , ce qui me fait " + getArgent() + " sous dans ma\r\n"
				+ " poche. Hi ! Hi !");	
	}
    public int perdre() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        reputation--;
        parler("J’ai perdu mon duel et mes " + argentPerdu +
               " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        return argentPerdu;
    }

    public void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;
        parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " +
               clan + " ? Je l'ai dépouillé de ses " + getArgent() + " sous.");
    }

    public int getReputation() {
        return reputation;
    }
}

