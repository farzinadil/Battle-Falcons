package battlefalconsv2;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import static battlefalconsv2.CardList.*;

public class Main {

    JFrame frame;
    
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton endTurn;
    
    JButton[] buttonArray = new JButton[6];
    JPanel[] playerLabels = new JPanel[5];
    JPanel[] enemyLabels = new JPanel[5];
    String newString = "src/PNG/al.png";

    Icon al = new ImageIcon(newString);
    

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();



    Main(){
        Color Casino = new Color(10,100,0);
        frame = new JFrame();
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.getContentPane().setBackground(Casino);
        frame.setTitle("Battle Falcons");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //Second Row
        JPanel rect1 = new JPanel();
        draw(rect1, (int)(screenSize.width*0.18),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect2 = new JPanel();
        draw(rect2, (int)(screenSize.width*0.315),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect3 = new JPanel();
        draw(rect3, (int)(screenSize.width*0.45),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect4 = new JPanel();
        draw(rect4, (int)(screenSize.width*0.585),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect5 = new JPanel();
        draw(rect5, (int)(screenSize.width*0.72),(int)(screenSize.height*0.265),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        
        //3rd Row
        JPanel rect18 = new JPanel();
        draw(rect18, (int)(screenSize.width*0.18),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect19 = new JPanel();
        draw(rect19, (int)(screenSize.width*0.315),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect20 = new JPanel();
        draw(rect20, (int)(screenSize.width*0.45),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect21 = new JPanel();
        draw(rect21, (int)(screenSize.width*0.585),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect22 = new JPanel();
        draw(rect22, (int)(screenSize.width*0.72),(int)(screenSize.height*0.53),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));


        //Top Row
        JPanel rect6 = new JPanel();
        draw(rect6, (int)(screenSize.width*0.1125),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect7 = new JPanel();
        draw(rect7, (int)(screenSize.width*0.2475),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect8 = new JPanel();
        draw(rect8, (int)(screenSize.width*0.3825),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect9 = new JPanel();
        draw(rect9, (int)(screenSize.width*0.5175),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect10 = new JPanel();
        draw(rect10, (int)(screenSize.width*0.6525),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect11 = new JPanel();
        draw(rect11, (int)(screenSize.width*0.7875),0,(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));

        //Bottom Row
        JPanel rect12 = new JPanel();
        draw(rect12, (int)(screenSize.width*0.1125),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect13 = new JPanel();
        draw(rect13, (int)(screenSize.width*0.2475),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect14 = new JPanel();
        draw(rect14, (int)(screenSize.width*0.3825),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect15 = new JPanel();
        draw(rect15, (int)(screenSize.width*0.5175),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect16 = new JPanel();
        draw(rect16, (int)(screenSize.width*0.6525),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        JPanel rect17 = new JPanel();
        draw(rect17, (int)(screenSize.width*0.7875),(int)(screenSize.height*0.795),(int)(screenSize.width*0.1),(int)(screenSize.height*0.2));
        
        JPanel Text = new JPanel();
        draw(Text,(int)(screenSize.width*0.045),(int)(screenSize.height*0.29),(int)(screenSize.width*0.1),(int)(screenSize.height*0.4));
        Text.setBackground(Color.LIGHT_GRAY);
        
        JLabel piclabel = new JLabel(al);
        rect1.add(piclabel);
        //rect1.remove(piclabel);
        
        endTurn = new JButton("End Turn");
        frame.add(endTurn);
        endTurn.setBounds((int)(screenSize.width*0.85),(int)(screenSize.height*0.478),(int)(screenSize.width*0.09),(int)(screenSize.height*0.04));
        endTurn.setVisible(true);
        
        playerLabels[0] = rect18;
        playerLabels[1] = rect19;
        playerLabels[2] = rect20;
        playerLabels[3] = rect21;
        playerLabels[4] = rect22;
        
        
        enemyLabels[0] = rect1;
        enemyLabels[1] = rect2;
        enemyLabels[2] = rect3;
        enemyLabels[3] = rect4;
        enemyLabels[4] = rect5;
 

        //Buttons for Cards (Left is button 1, right is button 2)
        button1 = new JButton();
        Button(rect12,button1);

        button2 = new JButton();
        Button(rect13,button2);

        button3 = new JButton();
        Button(rect14,button3);

        button4 = new JButton();
        Button(rect15,button4);

        button5 = new JButton();
        Button(rect16,button5);

        button6 = new JButton();
        Button(rect17,button6);


        buttonArray[0] = button1;
        buttonArray[1] = button2;
        buttonArray[2] = button3;
        buttonArray[3] = button4;
        buttonArray[4] = button5;
        buttonArray[5] = button6;
        

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 1 pressed");
                handToField(0);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 2 pressed");
                handToField(1);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 3 pressed");
                handToField(2);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 4 pressed");
                handToField(3);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 5 pressed");
                handToField(4);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 6 pressed");
                handToField(5);
            }
        });
        
        
        initializeHand();
    }
    
    
    public void draw(JPanel square, int x, int y, int z, int w) {
        square.setBackground(Color.gray);
        square.setBounds(x,y,z,w);
        frame.add(square);
    }
    
    
    public void Button(JPanel panel, JButton button) {
        button.setPreferredSize( new Dimension((int)(screenSize.width*0.1), (int)(screenSize.height*0.2)));
        panel.add(button);
        
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);

        button.setVisible(true);
    }
    
    
    public void initializeHand() {
        for(int i = 0; i < buttonArray.length; i++) {
            try {
                buttonArray[i].setText(playerHand.get(i).getCardName());
            }

            catch(Exception e) {
                buttonArray[i].setText("");
            }
        }
    }
    
    
    private void handToField(int index) {
        try {
            if (playerField.size() <= 5) {
                playerField.add(playerHand.get(index));

                setLabel(playerLabels, playerField);

                playerHand.remove(index);
                initializeHand();
            }
            
            else {
                System.out.println("Playing field is full");
            }
        }
        
        catch(Exception e) {
            System.out.println("No card in hand");
        }
    }
    
    
    private void setLabel(JPanel[] labelField, LinkedList <Card> battleField) {
        JLabel label = new JLabel(battleField.getLast().getCardName());
        
        switch (battleField.size() - 1) {
            case 0:
                labelField[0].add(label);
                break;

            case 1:
                labelField[1].add(label);
                break;

            case 2:
                labelField[2].add(label);
                break;

            case 3:
                labelField[3].add(label);
                break;
                
            case 4:
                labelField[4].add(label);
                break;

            default:
                System.out.println("No cards in hand");
        }
    }


    public static void main (String[]args) {
        deckShuffle(playerDeck);
        deckShuffle(enemyDeck);
        
        intialDraw(playerHand, playerDeck);
        intialDraw(enemyHand, enemyDeck);
        
        new Main();
    }
}
