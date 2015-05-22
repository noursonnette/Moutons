/**
 * Created by Charline & Kévin on 20/04/2015.
 */
public class Joueur {

    private String nom;
    private int poscouleur;
    private int nbCarte;
    private String[] couleur;
    private Carte[] tabCarte;
    private int posCarte=0;

    public Joueur(String nom, int poscouleur){
        this.nom=nom;
        this.poscouleur=poscouleur;
        couleur= new String[]{"rouge","bleu","jaune","noir","village","foret","loup","chasseur"};
        this.nbCarte=77;
        tabCarte=new Carte[nbCarte];
    }

    public String getNom() {
        return nom;
    }

    public String getCouleur(){
        return couleur[this.poscouleur];
    }

    public int getPosCarte(){return this.posCarte;}

    public void piocheUneCarte(){
        Pioche p = new Pioche();
        Carte c = p.piocherCarte();
        this.tabCarte[posCarte]=new Carte();
        this.posCarte+=1;
    }

    public void JoueUneCarte(int posCarte){
        // Supprime element du tableau à position posCarte
        // Place la carte sur la grille (plateau)
    }
}
