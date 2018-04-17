package view;

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
    JMenu [] menus = new JMenu [NB_MENUS];
    JMenuItem [] itemsJMenu = new JMenuItem[NB_J_MENU_ITEM];
    String [] labels = {"Ajouter un nouveau client", "Modifier les informations d'un membre", "Supprimer un membre de la famille", "Afficher tous les membres d'une famille",
            "Louer un vélo", "Rechercher les informations d'un vélo loué", "Afficher l'historique des anciennes inscriptions" ,"Afficher les informations d'un membre de la famille"};
    private MessageAccueil accueil;

    public FenetrePrincipale2(){
        //Définition dimensions fenêtre + activation fenêtre
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

        //insertion des JMenu dans tableau de menus
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menus[0] = new JMenu("Nouvelle inscription");

        menus[1] = new JMenu("Gestion des membres de la famille");
        menus[2] = new JMenu("Louer un vélo");
        menus[3] = new JMenu("Recherches");


        int cptSauve = 0;
        for(int cptMenu = 0;cptMenu < menus.length;cptMenu++){
            menuBar.add(menus[cptMenu]);
            menus[cptMenu].setMnemonic(cptMenu);
            System.out.println("Coucou");
            for(int cptItemsMenu = cptSauve;cptItemsMenu < menus[cptMenu].getItemCount();cptItemsMenu++){
                itemsJMenu[cptItemsMenu] = new JMenuItem(labels[cptItemsMenu]);
                itemsJMenu[cptItemsMenu].addActionListener(this);
                itemsJMenu[cptItemsMenu].setMnemonic(cptItemsMenu);
                System.out.println("Bruh");

                menus[cptItemsMenu].add(itemsJMenu[cptItemsMenu]);
                cptSauve++;
            }
        }
        //Remplissage du tableau itemsJMenu (contient les JMenuItem). Usage de Mnemonic pour identification du menu plus simple.
        /*
        itemsJMenu[0] = new JMenuItem();
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
        */



        /*
        menus[0].add(itemsJMenu[0]);
        menus[1].add(itemsJMenu[1]);
        menus[1].add(itemsJMenu[2]);
        menus[1].add(itemsJMenu[3]);
        menus[1].add(itemsJMenu[4]);
        menus[2].add(itemsJMenu[5]);
        menus[3].add(itemsJMenu[6]);
        menus[3].add(itemsJMenu[7]);
        menus[3].add(itemsJMenu[8]);
        */
        //Ajout des menus dans la menuBar
        for(int i = 0;i < menus.length;i++){
            System.out.println("Taille menu " + (i) + " : " + menus[i].getItemCount() );

        }
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
}