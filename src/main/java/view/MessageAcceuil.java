package view;

import javax.swing.*;
import java.awt.*;

public class MessageAcceuil extends JPanel {
    private JLabel line1Label;

    public MessageAcceuil(){
        line1Label = new JLabel("Bienvenu sur le site de LibiaVelo");
        line1Label.setFont(new Font("Arial",Font.BOLD,50));
        this.setLayout(new FlowLayout());
        this.add(line1Label);
    }
}
