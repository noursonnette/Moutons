import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 20/04/2015.
 */
public class TestPlateau {

    @Test
    public void TestPlateau() {
        Plateau p = new Plateau();
        Assert.assertEquals(p.getTaille(), 25);
        /* Test addCarte */
        try {
            p.addCarte(1, 1, new Carte());
        } catch (mauvaiseLongueurException e) {
            e.printStackTrace();
        } catch (mauvaiseHauteurException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(p.getTaille(), 25);
        Assert.assertFalse((p.getCarte(0,0)).equals(null));
        /* Test augmenterTaille */
        boolean verif = false ;
        if(verif){
            p.augmenterLongueurGauche();
            p.augmenterHauteurHaut();
        }
        while(!verif){
            try{
                p.addCarte(5,6, new Carte());
                verif = true ;
            }
            catch (mauvaiseHauteurException e) {
                System.out.println(e);
                p.augmenterHauteurBas();
            }
            catch (mauvaiseLongueurException e) {
                System.out.println(e);
                p.augmenterLongueurDroite();
            }
        }
        /* Test getTaille */
        Assert.assertEquals(p.getTaille(), 30);
    }
}
