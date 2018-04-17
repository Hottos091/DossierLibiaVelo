package view;

import javax.swing.*;

public class JMenuItemPerso extends JMenu{
    private int nbSousMenus;
    private JMenuItem item;
    private String nom;

    public JMenuItemPerso(String nom, int nbSousMenus){
        super(nom);
        this.nbSousMenus = nbSousMenus;
    }

    public int getNbSousMenus(){
        return nbSousMenus;
    }
}
