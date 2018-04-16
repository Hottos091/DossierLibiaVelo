package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FenetrePrincipale extends JFrame {
    private Container frameContainer;
    private JMenuBar menuBar;
    private JMenu nouvelleInscription, gestionMembreFamille, locationVelo, recherches;
    private JMenuItem nouveauClient, nouveauMembreFamille, modifierInformationMembreFamille, supprimerMembreFamille, afficherMembreFamille, louerVelo, rechercheVeloLouer, historiqueAncienneInscription, informationMembreFamille;
    private MessageAccueil acceuil;

    public FenetrePrincipale(){
        super("LibiaVelo");
        setVisible(true);
        setBounds(100,100,1100,600);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        frameContainer = this.getContentPane();
        frameContainer.setLayout(new BorderLayout());
        frameContainer.setLayout(new BorderLayout());
        acceuil = new MessageAccueil();
        frameContainer.add(acceuil, BorderLayout.CENTER);

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

        nouveauClient = new JMenuItem("Ajouter un nouveau client");
        nouveauMembreFamille = new JMenuItem("Ajouter un nouveau membre");
        modifierInformationMembreFamille = new JMenuItem("Modifier les informations d'un membre");
        supprimerMembreFamille = new JMenuItem("Supprimer un membre de la famille");
        afficherMembreFamille = new JMenuItem("Afficher tous les membres d'une famille");
        louerVelo = new JMenuItem("Louer un vélo");
        rechercheVeloLouer = new JMenuItem("Rechercher les informations d'un vélo loué");
        historiqueAncienneInscription = new JMenuItem("Afficher l'historique des anciennes inscriptions");
        informationMembreFamille = new JMenuItem("Afficher les informations d'un membre de la famille");

        nouvelleInscription.add(nouveauClient);
        gestionMembreFamille.add(nouveauMembreFamille);
        gestionMembreFamille.add(modifierInformationMembreFamille);
        gestionMembreFamille.add(supprimerMembreFamille);
        gestionMembreFamille.add(afficherMembreFamille);
        locationVelo.add(louerVelo);
        recherches.add(rechercheVeloLouer);
        recherches.add(historiqueAncienneInscription);
        recherches.add(informationMembreFamille);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
