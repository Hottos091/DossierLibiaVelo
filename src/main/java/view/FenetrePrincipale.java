package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class FenetrePrincipale extends JFrame implements ActionListener {
    private final static int NB_J_MENU_ITEM = 9;

    private Container frameContainer;
    private JMenuBar menuBar;
    private JMenu nouvelleInscription, gestionMembreFamille, locationVelo, recherches;
    private JMenuItem nouveauClient, nouveauMembreFamille, modifierInformationMembreFamille, supprimerMembreFamille, afficherMembreFamille, louerVelo, rechercheVeloLoue, historiqueAncienneInscription, informationMembreFamille;
    private MessageAccueil accueil;

    public FenetrePrincipale(){
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

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        nouvelleInscription = new JMenu("Nouvelle inscription");
        gestionMembreFamille = new JMenu("Gestion des membres de la famille");
        locationVelo = new JMenu("Louer un vélo");
        recherches = new JMenu("Recherches");

        menuBar.add(nouvelleInscription);
        menuBar.add(gestionMembreFamille);
        menuBar.add(locationVelo);
        menuBar.add(recherches);


        //Création JMenuItem + ajout Listener
        nouveauClient = new JMenuItem("Ajouter un nouveau client");
        nouveauClient.addActionListener(this);
        nouveauClient.setMnemonic(0);

        nouveauMembreFamille = new JMenuItem("Ajouter un nouveau membre");
        nouveauMembreFamille.addActionListener(this);
        nouveauMembreFamille.setMnemonic(1);

        modifierInformationMembreFamille = new JMenuItem("Modifier les informations d'un membre");
        modifierInformationMembreFamille.addActionListener(this);

        supprimerMembreFamille = new JMenuItem("Supprimer un membre de la famille");
        supprimerMembreFamille.addActionListener(this);

        afficherMembreFamille = new JMenuItem("Afficher tous les membres d'une famille");
        afficherMembreFamille.addActionListener(this);

        louerVelo = new JMenuItem("Louer un vélo");
        louerVelo.addActionListener(this);

        rechercheVeloLoue = new JMenuItem("Rechercher les informations d'un vélo loué");
        rechercheVeloLoue.addActionListener(this);

        historiqueAncienneInscription = new JMenuItem("Afficher l'historique des anciennes inscriptions");
        historiqueAncienneInscription.addActionListener(this);

        informationMembreFamille = new JMenuItem("Afficher les informations d'un membre de la famille");
        informationMembreFamille.addActionListener(this);


        //Ajout des JMenuItem aux JMenu
        nouvelleInscription.add(nouveauClient);
        gestionMembreFamille.add(nouveauMembreFamille);
        gestionMembreFamille.add(modifierInformationMembreFamille);
        gestionMembreFamille.add(supprimerMembreFamille);
        gestionMembreFamille.add(afficherMembreFamille);
        locationVelo.add(louerVelo);
        recherches.add(rechercheVeloLoue);
        recherches.add(historiqueAncienneInscription);
        recherches.add(informationMembreFamille);

        //Fermeture de la fenêtre
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public void actionPerformed(ActionEvent event) {
    }
}