import java.util.ArrayList;

/**
 * Created by User on 20/04/2015.
 */
public class Plateau {
    protected int hauteurBas;
    protected int hauteurHaut;
    protected int hauteur;
    protected int longueurGauche;
    protected int longueurDroite;
    protected int longueur;

    protected ArrayList<PlaceCarte> tableau;

    public Plateau() {
        tableau = new ArrayList<PlaceCarte>();
        hauteurBas = 5;
        longueurDroite = 5;
        hauteurHaut = 0 ;
        longueurGauche = 0 ;
        longueur = longueurGauche + longueurDroite ;
        hauteur = hauteurBas + hauteurHaut ;

        for (int i = 0; i < hauteur * longueur; i++) {
            tableau.add(new PlaceCarte());
        }
    }

    public void addCarte(int emplacementLongueur, int emplacementHauteur, Carte carte) throws mauvaiseLongueurException, mauvaiseHauteurException { //penser à la ligne 0 !
        if (emplacementLongueur > longueur) {
            throw new mauvaiseLongueurException("Longueur incorrecte");
        }
        if (emplacementHauteur > hauteur) {
            throw new mauvaiseHauteurException("Hauteur incorrecte");
        }
        emplacementHauteur--;
        tableau.get((emplacementHauteur * longueur + emplacementLongueur) - 1).setCarte(carte);
    }

    public Carte getCarte(int emplacementLongueur, int emplacementHauteur) {
        return tableau.get(emplacementHauteur * hauteur + emplacementLongueur).getCarte();
    }

    public void augmenterHauteurBas() { // en bas
        for (int i = 0; i <= longueurDroite; i++) {
            tableau.add(hauteurBas * longueur + i, new PlaceCarte());
        }
        hauteurBas++;
        hauteur = hauteurBas + hauteurHaut ;
    }

    public void augmenterLongueurDroite() { // à droite
        for (int i = hauteur * longueur; i > 0; i = i - longueur) {
            System.out.println(i);
            tableau.add(i, new PlaceCarte());
        }
        longueurDroite++;
        longueur = longueurGauche + longueurDroite ;
    }

    public void augmenterLongueurGauche() {
        for (int i = (hauteur * longueur) - (longueur); i >= 0; i = i - longueur) {
            tableau.add(i, new PlaceCarte());
        }
        longueurGauche++;
        longueur = longueurGauche + longueurDroite ;
    }

    public int getTaille() {
        return tableau.size();
    }

    public void augmenterHauteurHaut() {
        for (int i = longueur; i >= 0; i--) {
            tableau.add(0, new PlaceCarte()) ;
        }
        hauteurHaut++;
        hauteur = hauteurBas + hauteurHaut ;
        // ajouter une variable hauteur bas, hauteur haut, longueur gauche et droite (qui va permettre de maîtriser la grille)
    }
}
