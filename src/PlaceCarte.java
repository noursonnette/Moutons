/**
 * Created by User on 20/04/2015.
 */
public class PlaceCarte {
    protected Carte carte ;

    public PlaceCarte(){
        carte = new Carte();
    }

    public PlaceCarte(Carte c){
        carte = new Carte(c);
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte c) {
        carte = new Carte(c);
    }
}
