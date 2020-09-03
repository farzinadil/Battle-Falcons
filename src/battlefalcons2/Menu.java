package battlefalcons2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 */
public class Menu {
    JFrame startmenu;
    JButton startgame;
    JButton instrutions;
    JLabel logo;
    java.awt.Rectangle bounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();


    public Menu(){
        startmenu = new JFrame();
        startmenu.setResizable(false);
        startmenu.setSize((int)(bounds.width*0.5), (int)(bounds.height*0.5));
        startmenu.setLocation((int)(bounds.width*0.25), (int)(bounds.height*0.25) );
        startmenu.setLayout(null);
        startmenu.getContentPane().setBackground(Color.white);
        startmenu.setTitle("Battle Falcons");
        startmenu.setVisible(true);
        startmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        startgame = new JButton("Start");
        startgame.setBounds((int)(bounds.width*0.135), (int)(bounds.height*0.35), (int)(bounds.width*0.1) , (int)(bounds.height*0.1));
        startgame.setVisible(true);
        startmenu.add(startgame);


        instrutions = new JButton("Instructions");
        instrutions.setBounds((int)(bounds.width*0.265), (int)(bounds.height*0.35), (int)(bounds.width*0.1) , (int)(bounds.height*0.1));
        instrutions.setVisible(true);
        startmenu.add(instrutions);


        ImageIcon logoic = new ImageIcon(getClass().getClassLoader().getResource("Battle_Falcon-1.png"));
        logo = new JLabel(logoic);
        startmenu.add(logo);
        logo.setBounds((int)(bounds.width*0.5*0.1875), 0, (int)(bounds.width*0.5*0.625), (int)(bounds.height*0.5*0.9804));
        logo.setVisible(true);




        startgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Board();
            }
        });

        instrutions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Welcome to Battle Falcon!\n"
                                + "This is a card based strategy game where you and a computer controlled opponent duke it out until one of you dies!\n"
                                + "Your two main resources are health and mana. You start with 30 health and if your life points drop to zero, you lose.\n"
                                + "You start with 2 mana and it increments by 2 each turn.\n"
                                + "You use mana to play birds, which automatically get placed on the leftmost tile of your playing field.\n"
                                + "Your birds and your opponent’s will fight according to their placement on the battlefield.\n"
                                + "The bird with the higher attack wins and kills the other bird.\n"
                                + "If a bird is not facing any other birds, it attacks the opponent directly and deals its damage to his health total.", "Instructions", 0, logoic);

            }
        });
    }
}
