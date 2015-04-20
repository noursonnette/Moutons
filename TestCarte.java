import junit.framework.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Clément on 19/04/2015.
 */
public class TestCarte {
    public Carte c = new Carte();
    ArrayList a = new ArrayList(c.getface1().size());
@Test
public void testConstructor() {
    System.out.println("--------------------\ntestConstructor\n--------------------");
    Assert.assertTrue(c.getface1().isEmpty());
    Assert.assertTrue(c.addElement(1));
    Assert.assertTrue(c.addElement(2));
    Assert.assertTrue(c.addElement(3));
    Assert.assertTrue(c.addElement(4));
    System.out.println(" c  " + c.toString());

    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    Assert.assertEquals(a, c.getface1());
}

 @Test
 public void testPivoterDroite() {
     System.out.println("--------------------\ntestPivoterDroite\n--------------------");
     c.viderTab();
     Assert.assertTrue(c.addElement(1));
     Assert.assertTrue(c.addElement(2));
     Assert.assertTrue(c.addElement(3));
     Assert.assertTrue(c.addElement(4));
     a.clear();
     a.add(2);
     a.add(3);
     a.add(4);
     a.add(1);
     System.out.println(" c before : " + c.toString());
     c.pivoterDroite();
     System.out.println(" c after : " + c.toString());
     Assert.assertEquals(a, c.getface1());
 }

@Test
public void testPivoterGauche(){
    System.out.println("--------------------\ntestPivoterGauche\n--------------------");
    a.clear();
    a.add(4);
    a.add(1);
    a.add(2);
    a.add(3);
    c.viderTab();
    Assert.assertTrue(c.addElement(1));
    Assert.assertTrue(c.addElement(2));
    Assert.assertTrue(c.addElement(3));
    Assert.assertTrue(c.addElement(4));
    System.out.println(" c before : " + c.toString());
    c.pivoterGauche();
    System.out.println(" c after: " + c.toString());
    org.junit.Assert.assertEquals(a, c.getface1());

}



}
