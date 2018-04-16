package view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionClicSurMenu extends AbstractAction {
    private String nom;

    public ActionClicSurMenu(String nom){
        putValue(Action.NAME, nom);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("Source : " + event.getSource());
    }
}

