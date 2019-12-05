package battlefalcons2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by farzinadil on 12/4/19.
 */
public class Menu {
    JFrame startmenu;
    JButton startgame;
    JButton instrutions;
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
        startgame.setBounds((int)(screenSize.width*0.12), (int)(screenSize.height*0.15), (int)(screenSize.width*0.1) , (int)(screenSize.height*0.1));
        startgame.setVisible(true);
        startmenu.add(startgame);


        instrutions = new JButton("Instruction");
        instrutions.setBounds((int)(screenSize.width*0.25), (int)(screenSize.height*0.15), (int)(screenSize.width*0.1) , (int)(screenSize.height*0.1));
        instrutions.setVisible(true);
        startmenu.add(instrutions);








        startgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main();
            }
        });

        instrutions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Type Instructions out here");
            }
        });




    }
}
