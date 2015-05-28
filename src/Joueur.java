import java.util.ArrayList;

/**
 * Created by charline on 20/04/2015.
 */
public class Joueur {

    private String nom;
    private int poscouleur;
    private int nbCarte;
    private String[] couleur;
    private Carte[] tabCarte;
    private int posCarte=0;
    private ArrayList<Carte> MainJoueur;

    public Joueur(String nom, int poscouleur){
        this.nom=nom;
        this.poscouleur=poscouleur;
        couleur= new String[]{"rouge","bleu","jaune","noir","village","foret","loup","chasseur"};
        this.nbCarte=77;
        tabCarte=new Carte[nbCarte];
        MainJoueur=new ArrayList<Carte>();
    }

    public String getNom() {
        return nom;
    }

    public String getCouleur(){
        return couleur[this.poscouleur];
    }

    public int getPosCarte(){return this.posCarte;}

    public void ajouterUneCarte(Carte uneCarte){
        MainJoueur.add(uneCarte);
    }

    public void supprimerUneCarte(int indice){
        MainJoueur.remove(indice);
    }

    public ArrayList<Carte> getMainJoueur(){
        return MainJoueur;
    }

   public void piocheUneCarte(){
   //     Carte c = Pioche.piocherCarte();
   //     this.tabCarte[posCarte]=new Carte();
   //    this.posCarte+=1;
   }

    public void JoueUneCarte(int posCarte){
        // Supprime element du tableau à position posCarte
        // Place la carte sur la grille (plateau)
        supprimerUneCarte(posCarte);
    }
}
