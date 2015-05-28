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
        
        // Carte 1 Position 17
        c.addElementFace1(0);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(1);
        c.addElementFace2(2);
        c.addElementFace2(3);
        c.addElementFace2(2);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();
        
        // Carte 2 Position 18
        c.addElementFace1(3);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(3);
        c.addElementFace2(0);
        c.addElementFace2(1);
        c.addElementFace2(2);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 3 Position 19
        c.addElementFace1(0);
        c.addElementFace1(4);
        c.addElementFace1(0);
        c.addElementFace1(0);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(1);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 4 Position 20
        c.addElementFace1(3);
        c.addElementFace1(5);
        c.addElementFace1(3);
        c.addElementFace1(3);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(3);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();
        
        // Carte 5 Position 21
        c.addElementFace1(3);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(0);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(2);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();
        
        // Carte 6 Position 22
        c.addElementFace1(2);
        c.addElementFace1(4);
        c.addElementFace1(0);
        c.addElementFace1(0);
        c.addElementFace2(3);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();
        
        // Carte 7 Position 23
        c.addElementFace1(3);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(2);
        c.addElementFace2(1);
        c.addElementFace2(0);
        c.addElementFace2(1);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();
        
        // Carte 8 Position 24
        c.addElementFace1(3);
        c.addElementFace1(4);
        c.addElementFace1(3);
        c.addElementFace1(3);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(1);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();
        
        // Carte 9 Position 25
        c.addElementFace1(0);
        c.addElementFace1(4);
        c.addElementFace1(1);
        c.addElementFace1(1);
        c.addElementFace2(0);
        c.addElementFace2(1);
        c.addElementFace2(3);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();
        
        // Carte 10 Position 26
        c.addElementFace1(0);
        c.addElementFace1(5);
        c.addElementFace1(0);
        c.addElementFace1(0);
        c.addElementFace2(2);
        c.addElementFace2(0);
        c.addElementFace2(3);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 11 Position 27
        c.addElementFace1(0);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(3);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(3);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 12 Position 28
        c.addElementFace1(1);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(3);
        c.addElementFace2(0);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 13 Position 29
        c.addElementFace1(2);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace2(2);
        c.addElementFace2(0);
        c.addElementFace2(1);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        //Carte 14 Position 30
        c.addElementFace1(0);
        c.addElementFace1(1);
        c.addElementFace1(2);
        c.addElementFace1(3);
        c.addElementFace2(1);
        c.addElementFace2(2);
        c.addElementFace2(0);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        //Carte 15 Position 31
        c.addElementFace1(2);
        c.addElementFace1(4);
        c.addElementFace1(3);
        c.addElementFace1(3);
        c.addElementFace2(0);
        c.addElementFace2(3);
        c.addElementFace2(1);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        //Carte 16 Position 32
        c.addElementFace1(3);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(3);
        c.addElementFace2(3);
        c.addElementFace2(0);
        c.addElementFace2(1);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        //Carte 17 Position 33
        c.addElementFace1(2);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(3);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(3);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 18 Position 34
        c.addElementFace1(3);
        c.addElementFace1(4);
        c.addElementFace1(0);
        c.addElementFace1(0);
        c.addElementFace2(2);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 19 Position 35
        c.addElementFace1(3);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(1);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 20 Position 36
        c.addElementFace1(3);
        c.addElementFace1(4);
        c.addElementFace1(2);
        c.addElementFace1(2);
        c.addElementFace2(0);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 21 Position 37
        c.addElementFace1(0);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(1);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(0);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 22 Position 38
        c.addElementFace1(0);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(2);
        c.addElementFace2(3);
        c.addElementFace2(1);
        c.addElementFace2(3);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 23 Position 39
        c.addElementFace1(0);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(0);
        c.addElementFace2(1);
        c.addElementFace2(2);
        c.addElementFace2(3);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 24 Position 40
        c.addElementFace1(1);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(0);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(2);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 25 Position 41
        c.addElementFace1(2);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(1);
        c.addElementFace2(0);
        c.addElementFace2(0);
        c.addElementFace2(3);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 26 Position 42
        c.addElementFace1(2);
        c.addElementFace1(5);
        c.addElementFace1(2);
        c.addElementFace1(2);
        c.addElementFace2(3);
        c.addElementFace2(0);
        c.addElementFace2(1);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 27 Position 43
        c.addElementFace1(3);
        c.addElementFace1(4);
        c.addElementFace1(1);
        c.addElementFace1(1);
        c.addElementFace2(5);
        c.addElementFace2(5);
        c.addElementFace2(5);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 28 Position 44
        c.addElementFace1(2);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(0);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(0);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 29 Position 45
        c.addElementFace1(0);
        c.addElementFace1(3);
        c.addElementFace1(2);
        c.addElementFace1(1);
        c.addElementFace2(3);
        c.addElementFace2(2);
        c.addElementFace2(0);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 30 Position 46
        c.addElementFace1(2);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(0);
        c.addElementFace2(1);
        c.addElementFace2(3);
        c.addElementFace2(1);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 31 Position 47
        c.addElementFace1(2);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(2);
        c.addElementFace2(1);
        c.addElementFace2(3);
        c.addElementFace2(0);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 32 Position 48
        c.addElementFace1(0);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(2);
        c.addElementFace2(1);
        c.addElementFace2(1);
        c.addElementFace2(3);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 33 Position 49
        c.addElementFace1(0);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(3);
        c.addElementFace2(1);
        c.addElementFace2(2);
        c.addElementFace2(1);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 34 Position 50
        c.addElementFace1(1);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(0);
        c.addElementFace2(3);
        c.addElementFace2(2);
        c.addElementFace2(3);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 35 Position 51
        c.addElementFace1(3);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(1);
        c.addElementFace2(2);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 36 Position 52
        c.addElementFace1(2);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(0);
        c.addElementFace2(0);
        c.addElementFace2(1);
        c.addElementFace2(0);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 37 Position 53
        c.addElementFace1(3);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(1);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 38 Position 54
        c.addElementFace1(3);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(0);
        c.addElementFace2(2);
        c.addElementFace2(1);
        c.addElementFace2(2);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 39 Position 55
        c.addElementFace1(0);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace2(2);
        c.addElementFace2(1);
        c.addElementFace2(0);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 40 Position 56
        c.addElementFace1(0);
        c.addElementFace1(4);
        c.addElementFace1(3);
        c.addElementFace1(3);
        c.addElementFace2(5);
        c.addElementFace2(5);
        c.addElementFace2(5);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();


        // Carte 41 Position 57
        c.addElementFace1(2);
        c.addElementFace1(4);
        c.addElementFace1(1);
        c.addElementFace1(1);
        c.addElementFace2(0);
        c.addElementFace2(3);
        c.addElementFace2(3);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 42 Position 58
        c.addElementFace1(1);
        c.addElementFace1(4);
        c.addElementFace1(0);
        c.addElementFace1(0);
        c.addElementFace2(2);
        c.addElementFace2(3);
        c.addElementFace2(3);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 43 Position 59
        c.addElementFace1(1);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(2);
        c.addElementFace2(3);
        c.addElementFace2(3);
        c.addElementFace2(0);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 44 Position 60
        c.addElementFace1(3);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(1);
        c.addElementFace2(0);
        c.addElementFace2(0);
        c.addElementFace2(3);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 45 Position 61
        c.addElementFace1(1);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(1);
        c.addElementFace2(3);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 46 Position 62
        c.addElementFace1(2);
        c.addElementFace1(4);
        c.addElementFace1(2);
        c.addElementFace1(2);
        c.addElementFace2(3);
        c.addElementFace2(3);
        c.addElementFace2(1);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 47 Position 63
        c.addElementFace1(1);
        c.addElementFace1(5);
        c.addElementFace1(1);
        c.addElementFace1(1);
        c.addElementFace2(1);
        c.addElementFace2(0);
        c.addElementFace2(3);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 48 Position 64
        c.addElementFace1(1);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace2(4);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 49 Position 65
        c.addElementFace1(3);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(2);
        c.addElementFace2(0);
        c.addElementFace2(0);
        c.addElementFace2(1);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 50 Position 66
        c.addElementFace1(1);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(2);
        c.addElementFace2(0);
        c.addElementFace2(3);
        c.addElementFace2(0);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 51 Position 67
        c.addElementFace1(0);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(0);
        c.addElementFace2(3);
        c.addElementFace2(2);
        c.addElementFace2(0);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 52 Position 68
        c.addElementFace1(0);
        c.addElementFace1(2);
        c.addElementFace1(1);
        c.addElementFace1(3);
        c.addElementFace2(1);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 53 Position 69
        c.addElementFace1(1);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace2(1);
        c.addElementFace2(2);
        c.addElementFace2(0);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 54 Position 70
        c.addElementFace1(1);
        c.addElementFace1(4);
        c.addElementFace1(3);
        c.addElementFace1(3);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(2);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 55 Position 71
        c.addElementFace1(2);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(2);
        c.addElementFace2(3);
        c.addElementFace2(1);
        c.addElementFace2(0);
        c.addElementFace2(2);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 56 Position 72
        c.addElementFace1(1);
        c.addElementFace1(4);
        c.addElementFace1(2);
        c.addElementFace1(2);
        c.addElementFace2(2);
        c.addElementFace2(1);
        c.addElementFace2(3);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 57 Position 73
        c.addElementFace1(2);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(1);
        c.addElementFace2(3);
        c.addElementFace2(0);
        c.addElementFace2(3);
        c.addElementFace2(3);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 58 Position 74
        c.addElementFace1(1);
        c.addElementFace1(4);
        c.addElementFace1(1);
        c.addElementFace1(1);
        c.addElementFace2(3);
        c.addElementFace2(3);
        c.addElementFace2(2);
        c.addElementFace2(0);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 59 Position 75
        c.addElementFace1(1);
        c.addElementFace1(5);
        c.addElementFace1(5);
        c.addElementFace1(1);
        c.addElementFace2(3);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(1);
        listeCartes.add(c);
        c.viderTabFace1();
        c.viderTabFace2();

        // Carte 60 Position 76
        c.addElementFace1(1);
        c.addElementFace1(4);
        c.addElementFace1(4);
        c.addElementFace1(3);
        c.addElementFace2(0);
        c.addElementFace2(2);
        c.addElementFace2(0);
        c.addElementFace2(0);
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

    public Carte piocherCarte(int indice){
        return this.listeCartes.get(indice);
    }
}
