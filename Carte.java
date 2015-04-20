import java.util.ArrayList;

/**
 * Created by Clément on 19/04/2015.
 */
public class Carte {
    private static final int SIZE=4;

    private ArrayList face1;//tableau de taille 4 qui contiendra les objets présents sur la carte ( haut, gauche, bas, droite)
    private ArrayList face2;
    String path;

    public Carte(){
        face1=new ArrayList(SIZE);
        face2=new ArrayList(SIZE);
        
    }

    public ArrayList getface1() {
        return face1;
    }
    public ArrayList getface2() {
        return face2;
    }

    public boolean addElement(int e){
        return this.face1.add(e);
    }


    public void pivoterDroite() {
        Object o=this.face1.get(0);
        for(int i=0; i<SIZE-1; i++){
            this.face1.set(i, this.face1.get(i + 1));
        }
        this.face1.set(SIZE-1, o);
    }

    public void pivoterGauche() {
        Object o=this.face1.get(SIZE-1);
        for(int i=SIZE-1; i>0; i--){
            this.face1.set(i, this.face1.get(i - 1));
        }
        this.face1.set(0, o);
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
