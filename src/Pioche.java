import java.util.ArrayList;

/**
 * Created by charline on 20/04/2015.
 */
public class Pioche {

    ArrayList<Carte> listeCartes = new ArrayList<Carte>(77);

    public Pioche(){

        // Centre du village
        Carte c=new Carte();
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace2(4);
        c.addElementFace2(4);
        c.addElementFace2(4);
        c.addElementFace2(4);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Loup rouge
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace2(0);
        c.addElementFace2(0);
        c.addElementFace2(0);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();


        // Loup bleu
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Loup jaune
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Loup noir
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace1(6);
        c.addElementFace2(3);
        c.addElementFace2(3);
        c.addElementFace2(3);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();



    }

    public static void retirerCarte() {
    }
}
