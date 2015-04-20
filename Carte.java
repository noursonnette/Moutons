import java.util.ArrayList;

/**
 * Created by Clément on 19/04/2015.
 */
public class Carte {
    private static final int SIZE=4;

    private ArrayList face1;//tableau de taille 4 qui contiendra les objets présents sur la carte ( haut, gauche, bas, droite)
    private ArrayList face2;
    String pathFace1;
    String pathFace2;

    public Carte(){
        face1=new ArrayList(SIZE);
        face2=new ArrayList(SIZE);
        pathFace1="../img/";
        pathFace2="../img/";
    }

    public Carte(Carte c){
        this.face1=c.getface1();
        this.face2=c.getface2();
        this.pathFace1=c.getPathFace1();
        this.pathFace2=c.getPathFace2();
    }

    public ArrayList getface1() {
        return this.face1;
    }

    public ArrayList getface2() {
        return this.face2;
    }

    public String getPathFace1(){
        return this.pathFace1;
    }

    public String getPathFace2(){
        return this.pathFace2;
    }

    public boolean addElementFace1(int e) {// 0 pour rouge, 1 pour bleu, 2 pour jaune, 3 pour noir, 4 pour village, 5 pour forêt, 6 pour loup et 7 pour chasseur
        if (e >= 0 && e < 8) {
            return this.face1.add(e);
        }
        else return false;
    }

    public boolean addElementFace2(int e){// 0 pour rouge, 1 pour bleu, 2 pour jaune, 3 pour noir, 4 pour village, 5 pour forêt, 6 pour loup et 7 pour chasseur
        if (e >= 0 && e < 8) {
            return this.face2.add(e);
        }
        else return false;
    }
    
    public void changePathFace1(String s){
        this.pathFace1=s;
    }

    public void changePathFace2(String s){
        this.pathFace2=s;
    }

    public void pivoterFace1Droite() {
        Object o=this.face1.get(0);
        for(int i=0; i<SIZE-1; i++){
            this.face1.set(i, this.face1.get(i + 1));
        }
        this.face1.set(SIZE-1, o);
    }

    public void pivoterFace2Droite() {
        Object o=this.face2.get(0);
        for(int i=0; i<SIZE-1; i++){
            this.face2.set(i, this.face2.get(i + 1));
        }
        this.face2.set(SIZE-1, o);
    }

    public void pivoterFace1Gauche() {
        Object o=this.face1.get(SIZE-1);
        for(int i=SIZE-1; i>0; i--){
            this.face1.set(i, this.face1.get(i - 1));
        }
        this.face1.set(0, o);
    }

    public void pivoterFace2Gauche() {
        Object o=this.face2.get(SIZE-1);
        for(int i=SIZE-1; i>0; i--){
            this.face2.set(i, this.face2.get(i - 1));
        }
        this.face2.set(0, o);
    }

    public String toString(){
        String s="";
        for(int i=0; i<SIZE; i++){
            s+=this.face1.get(i).toString();
        }
        return s;
    }

    public void viderTab() {
        this.face1.clear();
    }
}
