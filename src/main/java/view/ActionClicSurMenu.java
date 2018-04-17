package view;

import javax.swing.*;
import java.awt.event.ActionEvent;

//peut-être utilisé pour changer le contentPane, à ne pas supprimer
public class ActionClicSurMenu extends AbstractAction {
    private String nom;

    public ActionClicSurMenu(String nom){
        putValue(Action.NAME, nom);
    }

    public void actionPerformed(ActionEvent event) { }
}

