/*package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//Ceci est une idée que j'ai eue

public class FenetrePrincipale2 extends JFrame implements ActionListener {
    private final static int NB_J_MENU_ITEM = 9;
    private final static int NB_MENUS = 4;

    private Container frameContainer;
    private JMenuBar menuBar;
    private JMenu nouvelleInscription, gestionMembreFamille, locationVelo, recherches;
    private JMenuItem nouveauClient, nouveauMembreFamille, modifierInformationMembreFamille, supprimerMembreFamille, afficherMembreFamille, louerVelo, rechercheVeloLoue, historiqueAncienneInscription, informationMembreFamille;
    private MessageAccueil accueil;

    public FenetrePrincipale2(){
        super("LibiaVelo");
        setVisible(true);
        setBounds(100,100,1100,600);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        frameContainer = this.getContentPane();
        frameContainer.setLayout(new BorderLayout());
        frameContainer.setLayout(new BorderLayout());
        accueil = new MessageAccueil();
        frameContainer.add(accueil, BorderLayout.CENTER);
//TODO : METTRE LES MENUS EN TABLEAU
        menuBar = new JMenuBar();
        JMenu [] menus = new JMenu [NB_MENUS];
        setJMenuBar(menuBar);
        nouvelleInscription = new JMenu("Nouvelle inscription");
        gestionMembreFamille = new JMenu("Gestion des membres de la famille");
        locationVelo = new JMenu("Louer un vélo");
        recherches = new JMenu("Recherches");

        menuBar.add(nouvelleInscription);
        menuBar.add(gestionMembreFamille);
        menuBar.add(locationVelo);
        menuBar.add(recherches);


        //Création tableau JMenuItem avec Mnemonic pour identification du menu plus simple.
        JMenuItem [] itemsJMenu = new JMenuItem[NB_J_MENU_ITEM];

        itemsJMenu[0] = new JMenuItem("Ajouter un nouveau client");
        itemsJMenu[0].addActionListener(this);
        itemsJMenu[0].setMnemonic(0);

        itemsJMenu[1] = new JMenuItem("Ajouter un nouveau membre");
        itemsJMenu[1].addActionListener(this);
        itemsJMenu[1].setMnemonic(1);

        itemsJMenu[2] = new JMenuItem("Modifier les informations d'un membre");
        itemsJMenu[2].addActionListener(this);
        itemsJMenu[2].setMnemonic(2);

        itemsJMenu[3] = new JMenuItem("Supprimer un membre de la famille");
        itemsJMenu[3].addActionListener(this);
        itemsJMenu[3].setMnemonic(3);

        itemsJMenu[4] = new JMenuItem("Afficher tous les membres d'une famille");
        itemsJMenu[4].addActionListener(this);
        itemsJMenu[4].setMnemonic(4);

        itemsJMenu[5] = new JMenuItem("Louer un vélo");
        itemsJMenu[5].addActionListener(this);
        itemsJMenu[5].setMnemonic(5);

        itemsJMenu[6] = new JMenuItem("Rechercher les informations d'un vélo loué");
        itemsJMenu[6].addActionListener(this);
        itemsJMenu[6].setMnemonic(6);

        itemsJMenu[7] = new JMenuItem("Afficher l'historique des anciennes inscriptions");
        itemsJMenu[7].addActionListener(this);
        itemsJMenu[7].setMnemonic(7);

        itemsJMenu[8] = new JMenuItem("Afficher les informations d'un membre de la famille");
        itemsJMenu[8].addActionListener(this);
        itemsJMenu[8].setMnemonic(8);

        nouvelleInscription.add(itemsJMenu[0]);
        gestionMembreFamille.add(itemsJMenu[1]);
        gestionMembreFamille.add(itemsJMenu[2]);
        gestionMembreFamille.add(itemsJMenu[3]);
        gestionMembreFamille.add(itemsJMenu[4]);
        locationVelo.add(itemsJMenu[5]);
        recherches.add(itemsJMenu[6]);
        recherches.add(itemsJMenu[7]);
        recherches.add(itemsJMenu[8]);

        //Fermeture de la fenêtre
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public void actionPerformed(ActionEvent event) {
        JMenuItem source = (JMenuItem) event.getSource();

        frameContainer.removeAll();
        MessageAccueil affichageTest = new MessageAccueil("Clic sur le bouton : " + source.getActionCommand());
        frameContainer.add(affichageTest, BorderLayout.CENTER);

        frameContainer.revalidate();
        frameContainer.repaint();
    }
}*/