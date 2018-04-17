package view;

import javax.swing.*;

public class JMenuPerso {
    private int nbMenus;
    private JMenuItem item;
    private String nom;


    public JMenuPerso(int nbMenus, String nom){
        this.nbMenus = nbMenus;
        item = new JMenuItem(nom);
    }


}
