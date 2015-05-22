import org.junit.Assert;
import org.junit.Test;

/**
 * Created by charline on 20/04/2015.
 */
public class TestJoueur {

    @Test
    public void testGetNom(){
        Joueur j = new Joueur("Dupont",0);

        Assert.assertEquals("Dupont",j.getNom());
        Assert.assertNotEquals("Dup",j.getNom());
    }

    @Test
    public void testGetCouleur(){
        Joueur j = new Joueur("Dupont",0);
        Assert.assertEquals("rouge",j.getCouleur());
        Assert.assertNotEquals("rou",j.getCouleur());

        Joueur j1 = new Joueur("Dupont",1);
        Assert.assertEquals("bleu",j1.getCouleur());
        Assert.assertNotEquals("ble",j1.getCouleur());

        Joueur j2= new Joueur("Dupont",2);
        Assert.assertEquals("jaune",j2.getCouleur());
        Assert.assertNotEquals("rou",j2.getCouleur());

        Joueur j3 = new Joueur("Dupont",3);
        Assert.assertEquals("noir",j3.getCouleur());
        Assert.assertNotEquals("rou",j3.getCouleur());
    }

    @Test
    public void testPiocheUneCarte(){
        Joueur j1 = new Joueur("nom",4);
        j1.piocheUneCarte();
        int temp=1;
        Assert.assertEquals(j1.getPosCarte(),temp);
    }

    @Test
    public void testJoueUneCarte(){

    }

    @Test
    public void testRevelerSaCouleur(){

    }




}
