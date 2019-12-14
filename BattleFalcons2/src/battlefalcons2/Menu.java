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

    public Menu(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        startmenu = new JFrame();
        startmenu.setSize((int)(screenSize.width*0.5), (int)(screenSize.height*0.5));
        startmenu.setLayout(null);
        startmenu.getContentPane().setBackground(Color.white);
        startmenu.setTitle("Battle Falcons");
        startmenu.setVisible(true);
        startmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        startgame = new JButton("Start");
        startgame.setBounds((int)(screenSize.width*0.12), (int)(screenSize.height*0.35), (int)(screenSize.width*0.1) , (int)(screenSize.height*0.1));
        startgame.setVisible(true);
        startmenu.add(startgame);


        instrutions = new JButton("Instruction");
        instrutions.setBounds((int)(screenSize.width*0.25), (int)(screenSize.height*0.35), (int)(screenSize.width*0.1) , (int)(screenSize.height*0.1));
        instrutions.setVisible(true);
        startmenu.add(instrutions);

        logo = new JLabel();
        ImageIcon logoic = new ImageIcon("src/PNG/Battle_Falcon-1.png_3.png");
        logo.setIcon(logoic);
        startmenu.add(logo);
        logo.setBounds((int)(screenSize.width*0.17), (int)(screenSize.height*0.03), (int)(screenSize.width*0.3) , (int)(screenSize.height*0.30));
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
                                + "If a bird is not facing any other birds, it attacks the opponent directly and deals its damage to his health total."
                );
            }
        });
    }
}