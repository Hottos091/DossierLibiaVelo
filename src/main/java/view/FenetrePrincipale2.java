package view;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.WindowAdapter;
        import java.awt.event.WindowEvent;

//Ceci est une idée que j'ai eue

//=====================FONCTIONNEL=====================
//==========Check le message que j'ai push avec le projet sur Github==========

public class FenetrePrincipale2 extends JFrame implements ActionListener {
    private final static int NB_ITEMS_JMENU = 9;
    private final static int NB_MENUS = 4;

    private Container frameContainer;
    private JMenuBar menuBar;
    private JMenuItemPerso[] menus = new JMenuItemPerso[NB_MENUS];
    private JMenuItem [] itemsJMenu = new JMenuItem[NB_ITEMS_JMENU];
    private String [] labels = {"Ajouter un nouveau client", "Ajouter un nouveau membre", "Modifier les informations d'un membre", "Supprimer un membre de la famille", "Afficher tous les membres d'une famille",
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

        //Initialisation de la barre de menus ainsi que du tableaux de menus
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menus[0] = new JMenuItemPerso("Nouvelle inscription", 1);
        menus[1] = new JMenuItemPerso("Gestion des membres de la famille", 4);
        menus[2] = new JMenuItemPerso("Louer un vélo", 1);
        menus[3] = new JMenuItemPerso("Recherches",3);

        //Boucle sur la barre de menu
        for(int i = 0;i < NB_MENUS;i++) {
            menuBar.add(menus[i]);
            //System.out.println("Ajout barre " + (i+1));
        }

        int cptSauve = 0;
        for(int cptMenu = 0;cptMenu < menus.length;cptMenu++) {
            //Boucle NB_MENUS fois pour remplir les menus avec les bons sous-menus grâce à la variable nbMenus (Voir classe JMenuItemPerso)
            for (int i = 0; (i < NB_ITEMS_JMENU) && (i < menus[cptMenu].getNbSousMenus()); i++) {
                itemsJMenu[cptSauve] = new JMenuItem(labels[cptSauve]);
                itemsJMenu[cptSauve].addActionListener(this);

                menus[cptMenu].add(itemsJMenu[cptSauve]); //Ajout des sous-menus
                //System.out.println("Ajout sous-menu " + (cptSauve+1));
                cptSauve++;
            }
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









//Ancien code
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



        //Vérifier la taille de chaque menu principal
        for(int i = 0;i < menus.length;i++){
            System.out.println("Taille menu " + (i) + " : " + menus[i].getItemCount() );

        }
        */