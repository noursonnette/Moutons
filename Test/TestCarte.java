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
    Assert.assertTrue(c.addElementFace1(1));
    Assert.assertTrue(c.addElementFace1(2));
    Assert.assertTrue(c.addElementFace1(3));
    Assert.assertTrue(c.addElementFace1(4));
    System.out.println(" c  " + c.toString());

    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    Assert.assertEquals(a, c.getface1());
}

 @Test
 public void testpivoterFace1Droite() {
     System.out.println("--------------------\ntestpivoterFace1Droite\n--------------------");
     c.viderTabFace1();
     c.viderTabFace2();
     Assert.assertTrue(c.addElementFace1(1));
     Assert.assertTrue(c.addElementFace1(2));
     Assert.assertTrue(c.addElementFace1(3));
     Assert.assertTrue(c.addElementFace1(4));
     a.clear();
     a.add(2);
     a.add(3);
     a.add(4);
     a.add(1);
     System.out.println(" c before : " + c.toString());
     c.pivoterFace1Droite();
     System.out.println(" c after : " + c.toString());
     Assert.assertEquals(a, c.getface1());
 }

@Test
public void testpivoterFace1Gauche(){
    System.out.println("--------------------\ntestpivoterFace1Gauche\n--------------------");
    a.clear();
    a.add(4);
    a.add(1);
    a.add(2);
    a.add(3);
    c.viderTabFace1();
    c.viderTabFace2();
    Assert.assertTrue(c.addElementFace1(1));
    Assert.assertTrue(c.addElementFace1(2));
    Assert.assertTrue(c.addElementFace1(3));
    Assert.assertTrue(c.addElementFace1(4));
    System.out.println(" c before : " + c.toString());
    c.pivoterFace1Gauche();
    System.out.println(" c after: " + c.toString());
    org.junit.Assert.assertEquals(a, c.getface1());

}

@Test
public void testChangePath(){
    System.out.println("--------------------\ntestChangePath\n--------------------");
    String s="../img/";
    System.out.println("Path before : " + c.getPathFace1());
    Assert.assertEquals(s, c.getPathFace1());
    c.changePathFace1("newPath");
    System.out.println("Path after : " + c.getPathFace1());
    s="newPath";
    Assert.assertEquals(s, c.getPathFace1());
}

}
