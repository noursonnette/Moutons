/**
 * Created by csocie3 on 18/11/14.
 */

import javax.management.StringValueExp;
import javax.swing.*;
import java.lang.Math;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener{

    JMenuBar menubar;
    JMenu Menu;
    JMenuItem m1, m2;
    JLabel [] b,mainjoueur;
    JPanel p,main,panelglobal ;
    JButton button;
    Plateau plateau = new Plateau();

    public Fenetre (){
        initAttribut();
        ajoutAFenetre();
        pack();
        setTitle("Guerre des Mouton");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
    }
    private void initAttribut() {

        //Controleur c= new Controleur(this);
        //Controleurb C= new Controleurb(this);


        button = new JButton("soumettre");
       // button.addActionListener(C);

        b= new JLabel[plateau.getTaille()];
        mainjoueur=new JLabel[10];
        p= new JPanel(new GridLayout(plateau.hauteur,plateau.longueur));
        main = new JPanel(new GridLayout(2,5) );
        panelglobal = new JPanel(new GridLayout(2,1));
        m1= new JMenuItem("nouvelle partie");
       // m1.addActionListener(c);

        m2= new JMenuItem("meilleur score");
        //m2.addActionListener(c);

        Menu = new JMenu("option");
        menubar = new JMenuBar();

    }
    private void ajoutAFenetre() {

        Menu.add(m1);
        Menu.add(m2);
        menubar.add(Menu);
        setJMenuBar(menubar);
        int i;
        for (i=0;i<plateau.getTaille();i++){
            b[i]= new JLabel();
            b[i].setBorder(BorderFactory.createLineBorder(Color.black));
            p.add(b[i]);
        }

        for (i=0;i<10;i++){
            mainjoueur[i]= new JLabel();
            mainjoueur[i].setBorder(BorderFactory.createLineBorder(Color.black));
            main.add(b[i]);
        }

        panelglobal.add(p);
        panelglobal.add(main);
        this.setContentPane(panelglobal);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
