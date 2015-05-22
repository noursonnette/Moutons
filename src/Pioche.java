import com.sun.xml.internal.bind.v2.TODO;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by charline on 20/04/2015.
 */
public class Pioche {

    ArrayList<Carte> listeCartes = new ArrayList<Carte>(77);
    private final int nbCartesTotal=77;
    private final int nbCartesInutiles=9;
    private final int nbCartesPiochees=0;

    public Pioche(){

        //TODO : Ajouter les chemins des cartes une fois scannés

        // Centre du village Position 0
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

        // Berger rouge Position 1

        // Berger bleu Position 2

        // Berger jaune Position 3

        // Berger noir Position 4

        // Marqueur rouge Position 5

        // Marqueur bleu Position 6

        // Marqueur jaune Position 7

        // Marqueur noir Position 8

        // Loup rouge Position 9
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


        // Loup bleu Position 10
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

        // Loup jaune Position 11
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

        // Loup noir Position 12
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


        // Chasseur rouge Position 13
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace2(0);
        c.addElementFace2(0);
        c.addElementFace2(0);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();


        // CHasseur bleu Position 14
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // CHasseur jaune Position 15
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Chasseur noir Position 16
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace1(7);
        c.addElementFace2(3);
        c.addElementFace2(3);
        c.addElementFace2(3);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();



    }

    public Carte piocherCarte() {
        Random r = new Random();
        int index=r.nextInt(nbCartesTotal-nbCartesInutiles)+nbCartesInutiles-nbCartesPiochees;
        Carte c=this.listeCartes.get(index);
        this.listeCartes.remove(index);
        return c;
    }
}
