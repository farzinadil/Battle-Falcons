package battlefalcons2;

/**
 * Created by farzinadil on 11/26/19.
 */

        import java.util.*;
        import javax.swing.*;

        import java.awt.*;
        import java.awt.event.*;
        import javax.swing.Icon;
        import javax.swing.ImageIcon;
        import java.util.LinkedList;
        import java.util.Queue;

        import static battlefalcons2.CardList.*;
        import java.util.LinkedList;


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
    JPanel[] enemyHandLabels = new JPanel[6];

    //String newString = "src/PNG/al.png";
    //Icon al = new ImageIcon(newString);

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
        Text.setBackground(Color.WHITE);
        JTextArea logLabel = new JTextArea();
        logLabel.setEditable(false);
        Text.add(logLabel);
        String x = "";
        Queue<String> stringquee = new LinkedList<>();



        for (int i =0; i<17; i++)
            stringquee.add("");
        stringquee.add("Game Started");

        updateGameLog(stringquee,logLabel,"Player Health 30");




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

        enemyHandLabels[0] = rect6;
        enemyHandLabels[1] = rect7;
        enemyHandLabels[2] = rect8;
        enemyHandLabels[3] = rect9;
        enemyHandLabels[4] = rect10;
        enemyHandLabels[5] = rect11;


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
                updateGameLog( stringquee, logLabel,"button 1 pressed" );
                System.out.println("button 1 pressed");
                playerHandToField(0);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 2 pressed");
                updateGameLog( stringquee, logLabel,"button 2 pressed" );
                playerHandToField(1);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 3 pressed");
                updateGameLog( stringquee, logLabel,"button 3 pressed" );
                playerHandToField(2);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 4 pressed");
                updateGameLog( stringquee, logLabel,"button 4 pressed" );
                playerHandToField(3);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 5 pressed");
                updateGameLog( stringquee, logLabel,"button 5 pressed" );
                playerHandToField(4);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 6 pressed");
                updateGameLog( stringquee, logLabel,"button 6 pressed" );
                playerHandToField(5);
            }
        });

        endTurn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("turn end pressed");
                battlePhase();

                if(!enemyDeck.isEmpty()) {
                    drawCard(enemyHand, enemyDeck);
                }

                enemyTurn();

                if(!playerDeck.isEmpty()) {
                    drawCard(playerHand, playerDeck);
                }

                debugDisplay();
            }
        });

        enemyTurn();
        displayPlayerHand();
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


    /*public void refreshHand(LinkedList <Card> hand, LinkedList <Card> battlefield) {
        for(int i = 0; i < buttonArray.length; i++) {
            try {
                buttonArray[i].setIcon(new ImageIcon(hand.get(i).getImage()));
            }

            catch(Exception e) {
                if (battlefield.size() <= 5) {
                    buttonArray[i].setIcon(null);
                }
            }
        }
    }*/

    public void updateGameLog (Queue<String> stringquee, JTextArea gameLabel, String newentry)
    {
        String x ="";
        stringquee.remove();
        stringquee.add("\n"+newentry);
        for (String s : stringquee) x+=s;
        gameLabel.setText(x);
        gameLabel.setVisible(true);


    }

    private void debugDisplay() {
        if(playerHand.size() == 0) {
            playerHand.add(question);
            displayPlayerHand();

            playerHand.remove(question);
            displayPlayerHand();
        }

        else {
            Card temp = playerHand.get(0);
            playerHand.remove(0);
            displayPlayerHand();

            playerHand.add(0, temp);
            displayPlayerHand();
        }
    }

    private void playerHandToField(int index) {
        try {
            if (playerField.size() < 5) {
                playerField.add(playerHand.get(index));

                displayLabels(playerLabels, playerField);

                playerHand.remove(index);
                displayPlayerHand();
            }

            else {
                System.out.println("Playing field is full");
            }
        }

        catch(Exception e) {
            System.out.println("No card in hand");
        }
    }

    private void displayPlayerHand() {
        for(int i = 0; i < playerHand.size(); i++) {
            buttonArray[i].setIcon(new ImageIcon(playerHand.get(i).getImage()));
        }

        for(int i = playerHand.size(); i < buttonArray.length; i++) {
            buttonArray[i].setIcon(null);
        }
    }
        /*
        for(int i = 0; i < buttonArray.length; i++) {
            try {
                buttonArray[i].setIcon(new ImageIcon(playerHand.get(i).getImage()));
            }

            catch(Exception e) {
                if (playerField.size() <= 5) {
                    buttonArray[i].setIcon(null);
                }
            }
        }*/

    /*private void handToField(int index, LinkedList <Card> hand, LinkedList <Card> battlefield, JPanel[] lables) {
        try {
            if (battlefield.size() <= 5) {
                battlefield.add(hand.get(index));

                setLabel(lables, battlefield);

                hand.remove(index);
                refreshHand(hand, battlefield);
            }

            else {
                System.out.println("Playing field is full");
            }
        }

        catch(Exception e) {
            System.out.println("No card in hand");
        }
    }*/

    private void displayEnemyHand() {
        for(int i = 0; i < enemyHand.size(); i++) {
            enemyHandLabels[i].removeAll();
            enemyHandLabels[i].add(new JLabel(new ImageIcon(question.getImage())));
        }

        for(int i = enemyHand.size(); i < enemyHandLabels.length; i++) {
            enemyHandLabels[i].removeAll();
        }
    }

    private void displayLabels(JPanel[] labelField, LinkedList <Card> battleField) {
        for(int i = 0; i < battleField.size(); i++) {
            labelField[i].removeAll();
            labelField[i].add(new JLabel(new ImageIcon(battleField.get(i).getImage())));
        }

        for(int i = battleField.size(); i < labelField.length; i++) {
            labelField[i].removeAll();
            labelField[i].add(new JLabel(new ImageIcon(blank.getImage())));
        }
    }

    /*private void displayPlayerLabels() {
        for(int i = 0; i < playerField.size(); i++) {
            playerLabels[i].removeAll();
            playerLabels[i].add(new JLabel(new ImageIcon(playerField.get(i).getImage())));
        }

        for(int i = playerField.size(); i < playerLabels.length; i++) {
            playerLabels[i].removeAll();
        }
    }

    private void setLabel(JPanel[] labelField, LinkedList <Card> battleField) {
        JLabel label = new JLabel(new ImageIcon(battleField.getLast().getImage()));

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
    */
    private void enemyTurn() {
        for(int i = 0; i < enemyHand.size(); i++) {
            if(enemyField.size() < 5) {
                enemyField.add(enemyHand.get(i));
            }
        }

        for(int i = 0; i < enemyField.size(); i++) {
            enemyHand.remove(enemyField.get(i));
        }

        displayEnemyHand();
        displayLabels(enemyLabels, enemyField);
    }

    private void battlePhase() {
        if (playerField.size() < enemyField.size()) {
            cardBattle(playerField, enemyField, playerGrave, enemyGrave);
        }

        else {
            cardBattle(enemyField, playerField, enemyGrave, playerGrave);
        }

        for(int i = 0; i < playerGrave.size(); i++) {
            playerField.remove(playerGrave.get(i));
        }

        for(int i = 0; i < enemyGrave.size(); i++) {
            enemyField.remove(enemyGrave.get(i));
        }

        playerGrave.clear();
        enemyGrave.clear();

        displayLabels(playerLabels, playerField);
        displayLabels(enemyLabels, enemyField);
        displayEnemyHand();
    }

    private void cardBattle(LinkedList <Card> smallerField, LinkedList <Card> biggerField, LinkedList <Card> smallerGrave, LinkedList <Card> biggerGrave) {
        for(int i = 0; i < smallerField.size(); i++) {
            System.out.println(smallerField.get(i).attacks(biggerField.get(i)));

            if(smallerField.get(i).compareTo(biggerField.get(i)) > 0) {
                biggerGrave.add(biggerField.get(i));
            }

            else if(smallerField.get(i).compareTo(biggerField.get(i)) < 0) {
                smallerGrave.add(smallerField.get(i));
            }

            else {
                biggerGrave.add(biggerField.get(i));
                smallerGrave.add(smallerField.get(i));
            }
        }

        for(int i = smallerField.size(); i < biggerField.size(); i++) {
            System.out.println(biggerField.get(i).getCardName() +
                    " attacks Player");
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
