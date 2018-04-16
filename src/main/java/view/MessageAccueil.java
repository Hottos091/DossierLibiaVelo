package view;

import javax.swing.*;
import java.awt.*;

public class MessageAccueil extends JPanel {
    private JLabel line1Label;

    public MessageAccueil(){
        line1Label = new JLabel("Bienvenue sur le site de LibiaVelo");
        line1Label.setFont(new Font("Arial",Font.BOLD,50));
        this.setLayout(new FlowLayout());
        this.add(line1Label);
    }

    public MessageAccueil(String message){
        line1Label = new JLabel(message);
        line1Label.setFont(new Font("Arial",Font.BOLD,50));
       // this.setLayout(new FlowLayout());
        this.add(line1Label);
    }
}
