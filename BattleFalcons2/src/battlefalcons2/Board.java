package battlefalcons2;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import javax.swing.ImageIcon;
        import java.util.LinkedList;
        import java.util.Queue;
        import static battlefalcons2.CardList.*;


public class Board {
    boolean gameover;
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

    JTextArea logLabel = new JTextArea();
    Queue<String> stringQueue = new LinkedList<>();


    JLabel PlayerHealth = new JLabel("HP: " + player.getHealth());
    JLabel PlayerMana = new JLabel("MP: " + player.getMana());

    JLabel OpponentHealth = new JLabel("HP: " + enemy.getHealth());
    JLabel OpponentMana = new JLabel("MP: " + enemy.getMana());

    Color Casino = new Color(10, 100, 0);


    java.awt.Rectangle bounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();





    Board() {


        frame = new JFrame();
        frame.setLayout(null);

        frame.setSize(bounds.width,bounds.height);

        frame.setVisible(true);

        frame.getContentPane().setBackground(Casino);
        frame.setTitle("Battle Falcons");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        OpponentHealth.setBounds((int) (bounds.width * 0.88), (int) (bounds.height * 0.4), (int) (bounds.width * 0.09), (int) (bounds.height * 0.04));
        frame.add(OpponentHealth);
        OpponentHealth.setFont(new Font("Serif", Font.PLAIN, 20));
        OpponentHealth.setForeground(Color.white);
        OpponentHealth.setVisible(true);

        OpponentMana.setBounds((int) (bounds.width * 0.93), (int) (bounds.height * 0.4), (int) (bounds.width * 0.09), (int) (bounds.height * 0.04));
        frame.add(OpponentMana);
        OpponentMana.setFont(new Font("Serif", Font.PLAIN, 20));
        OpponentMana.setForeground(Color.white);
        OpponentMana.setVisible(true);

        PlayerHealth.setBounds((int) (bounds.width * 0.88), (int) (bounds.height * 0.55), (int) (bounds.width * 0.09), (int) (bounds.height * 0.04));
        frame.add(PlayerHealth);
        PlayerHealth.setFont(new Font("Serif", Font.PLAIN, 20));
        PlayerHealth.setForeground(Color.white);
        PlayerHealth.setVisible(true);

        PlayerMana.setBounds((int) (bounds.width * 0.93), (int) (bounds.height * 0.55), (int) (bounds.width * 0.09), (int) (bounds.height * 0.04));
        frame.add(PlayerMana);
        PlayerMana.setFont(new Font("Serif", Font.PLAIN, 20));
        PlayerMana.setForeground(Color.white);
        PlayerMana.setVisible(true);


        //Second Row
        JPanel rect1 = new JPanel();
        draw(rect1, (int) (bounds.width * 0.18), (int) (bounds.height * 0.265), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect2 = new JPanel();
        draw(rect2, (int) (bounds.width * 0.315), (int) (bounds.height * 0.265), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect3 = new JPanel();
        draw(rect3, (int) (bounds.width * 0.45), (int) (bounds.height * 0.265), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect4 = new JPanel();
        draw(rect4, (int) (bounds.width * 0.585), (int) (bounds.height * 0.265), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect5 = new JPanel();
        draw(rect5, (int) (bounds.width * 0.72), (int) (bounds.height * 0.265), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));

        //3rd Row
        JPanel rect18 = new JPanel();
        draw(rect18, (int) (bounds.width * 0.18), (int) (bounds.height * 0.53), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect19 = new JPanel();
        draw(rect19, (int) (bounds.width * 0.315), (int) (bounds.height * 0.53), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect20 = new JPanel();
        draw(rect20, (int) (bounds.width * 0.45), (int) (bounds.height * 0.53), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect21 = new JPanel();
        draw(rect21, (int) (bounds.width * 0.585), (int) (bounds.height * 0.53), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect22 = new JPanel();
        draw(rect22, (int) (bounds.width * 0.72), (int) (bounds.height * 0.53), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));


        //Top Row
        JPanel rect6 = new JPanel();
        draw(rect6, (int) (bounds.width * 0.1125), 0, (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect7 = new JPanel();
        draw(rect7, (int) (bounds.width * 0.2475), 0, (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect8 = new JPanel();
        draw(rect8, (int) (bounds.width * 0.3825), 0, (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect9 = new JPanel();
        draw(rect9, (int) (bounds.width * 0.5175), 0, (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect10 = new JPanel();
        draw(rect10, (int) (bounds.width * 0.6525), 0, (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect11 = new JPanel();
        draw(rect11, (int) (bounds.width * 0.7875), 0, (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));

        //Bottom Row
        JPanel rect12 = new JPanel();
        draw(rect12, (int) (bounds.width * 0.1125), (int) (bounds.height * 0.795), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect13 = new JPanel();
        draw(rect13, (int) (bounds.width * 0.2475), (int) (bounds.height * 0.795), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect14 = new JPanel();
        draw(rect14, (int) (bounds.width * 0.3825), (int) (bounds.height * 0.795), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect15 = new JPanel();
        draw(rect15, (int) (bounds.width * 0.5175), (int) (bounds.height * 0.795), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect16 = new JPanel();
        draw(rect16, (int) (bounds.width * 0.6525), (int) (bounds.height * 0.795), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));
        JPanel rect17 = new JPanel();
        draw(rect17, (int) (bounds.width * 0.7875), (int) (bounds.height * 0.795), (int) (bounds.width * 0.1), (int) (bounds.height * 0.2));


        logLabel.setEditable(false);
        logLabel.setLineWrap(true);
        logLabel.setMargin(new Insets(0, 0, 0, 0));
        logLabel.setBounds((int) (bounds.width * 0.04), (int) (bounds.height * 0.24), (int) (bounds.width * 0.12), (int) (bounds.height * 0.49));
        frame.add(logLabel);
        String x = "";

        for (int i = 0; i < 7; i++) {
            stringQueue.add("");
        }

        stringQueue.add("Game Started");

        endTurn = new JButton("End Turn");
        frame.add(endTurn);
        endTurn.setBounds((int) (bounds.width * 0.85), (int) (bounds.height * 0.478), (int) (bounds.width * 0.09), (int) (bounds.height * 0.04));
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
        Button(rect12, button1);

        button2 = new JButton();
        Button(rect13, button2);

        button3 = new JButton();
        Button(rect14, button3);

        button4 = new JButton();
        Button(rect15, button4);

        button5 = new JButton();
        Button(rect16, button5);

        button6 = new JButton();
        Button(rect17, button6);


        buttonArray[0] = button1;
        buttonArray[1] = button2;
        buttonArray[2] = button3;
        buttonArray[3] = button4;
        buttonArray[4] = button5;
        buttonArray[5] = button6;


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerHandToField(0);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerHandToField(1);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerHandToField(2);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerHandToField(3);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerHandToField(4);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerHandToField(5);
            }
        });

        endTurn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateGameLog(stringQueue, logLabel, "You ended your turn");

                battlePhase();

                maxMana += 2;

                if (!enemyDeck.isEmpty()) {
                    drawCard(enemyHand, enemyDeck);
                }

                enemy.setMana(maxMana);
                OpponentMana.setText("MP: " + enemy.getMana());

                enemyTurn();
                if (checkmate()) {
                    endgame();
                } else {
                    if (!playerDeck.isEmpty()) {
                        drawCard(playerHand, playerDeck);
                    }
                    player.setMana(maxMana);
                    PlayerMana.setText("MP: " + player.getMana());

                }
                debugDisplay();


            }
        });

        newGame();

    }


    public void draw(JPanel square, int x, int y, int z, int w) {
        square.setBackground(Casino);
        square.setBounds(x, y, z, w);
        frame.add(square);
    }


    public void Button(JPanel panel, JButton button) {
        button.setPreferredSize(new Dimension((int) (bounds.width * 0.1), (int) (bounds.height * 0.2)));
        panel.add(button);

        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);

        button.setVisible(true);
    }

    public void updateGameLog(Queue<String> stringQueue, JTextArea gameLabel, String newentry) {
        String x = "";
        stringQueue.remove();
        stringQueue.add("\n" + newentry);
        for (String s : stringQueue) x += s;
        gameLabel.setText(x);
        gameLabel.setVisible(true);
    }

    private void debugDisplay() {
        if (playerDeck.size() > 0) {
            Card temp = playerHand.get(0);
            playerHand.remove(0);
            displayPlayerHand();

            playerHand.add(0, temp);
            displayPlayerHand();
        } else {
            playerHand.add(blank);
            displayPlayerHand();

            playerHand.remove(blank);
            displayPlayerHand();
        }
    }

    private void playerHandToField(int index) {
        try {
            if (playerField.size() < 5 && playerHand.get(index).getManaCost() <= player.getMana()) {
                playerField.add(playerHand.get(index));

                player.setMana(player.getMana() - playerHand.get(index).getManaCost());
                PlayerMana.setText("MP: " + player.getMana());

                displayLabels(playerLabels, playerField);
                updateGameLog(stringQueue, logLabel,
                        String.format("You played %s",
                                playerHand.get(index).getCardName()));

                playerHand.remove(index);
                displayPlayerHand();
            } else {
                updateGameLog(stringQueue, logLabel, "Insufficient mana or playing field is full");
            }
        } catch (Exception e) {
            updateGameLog(stringQueue, logLabel, "No card in hand");
        }
    }

    private void displayPlayerHand() {
        for (int i = 0; i < playerHand.size(); i++) {
            buttonArray[i].setIcon(new ImageIcon(playerHand.get(i).getImage()));
        }

        for (int i = playerHand.size(); i < buttonArray.length; i++) {
            buttonArray[i].setIcon(null);
        }
    }

    private void displayEnemyHand() {
        for (int i = 0; i < enemyHand.size(); i++) {
            enemyHandLabels[i].removeAll();
            enemyHandLabels[i].add(new JLabel(new ImageIcon(question.getImage())));
        }

        for (int i = enemyHand.size(); i < enemyHandLabels.length; i++) {
            enemyHandLabels[i].removeAll();
            enemyHandLabels[i].add(new JLabel(new ImageIcon(blank.getImage())));
        }
    }

    private void displayLabels(JPanel[] labelField, LinkedList<Card> battleField) {
        for (int i = 0; i < battleField.size(); i++) {
            labelField[i].removeAll();
            labelField[i].add(new JLabel(new ImageIcon(battleField.get(i).getImage())));
        }

        for (int i = battleField.size(); i < labelField.length; i++) {
            labelField[i].removeAll();
            labelField[i].add(new JLabel(new ImageIcon(blank.getImage())));
        }
    }


    private void enemyTurn() {
        updateGameLog(stringQueue, logLabel, "---------------------------------------------------------Opponent turn has started");

        for (int i = 0; i < enemyHand.size(); i++) {
            if (enemyField.size() < 5 && enemyHand.get(i).getManaCost() <= enemy.getMana()) {
                enemyField.add(enemyHand.get(i));

                enemy.setMana(enemy.getMana() - enemyHand.get(i).getManaCost());
                OpponentMana.setText("MP: " + enemy.getMana());

                updateGameLog(stringQueue, logLabel,
                        String.format("Opponent played %s",
                                enemyHand.get(i).getCardName()));
            }
        }

        for (int i = 0; i < enemyField.size(); i++) {
            enemyHand.remove(enemyField.get(i));
        }

        displayEnemyHand();
        displayLabels(enemyLabels, enemyField);

        updateGameLog(stringQueue, logLabel, "---------------------------------------------------------Your turn has started");
    }

    private void battlePhase() {
        updateGameLog(stringQueue, logLabel, "---------------------------------------------------------Battle phase has started");

        if (playerField.size() < enemyField.size()) {
            cardBattle(playerField, enemyField, playerGrave, enemyGrave, player, PlayerHealth);
        } else {
            cardBattle(enemyField, playerField, enemyGrave, playerGrave, enemy, OpponentHealth);
        }

        if (checkmate()) {
            endgame();
        }

        for (int i = 0; i < playerGrave.size(); i++) {
            playerField.remove(playerGrave.get(i));
        }

        for (int i = 0; i < enemyGrave.size(); i++) {
            enemyField.remove(enemyGrave.get(i));
        }

        playerGrave.clear();
        enemyGrave.clear();

        displayLabels(playerLabels, playerField);
        displayLabels(enemyLabels, enemyField);
        displayEnemyHand();

        updateGameLog(stringQueue, logLabel, "Battle phase has ended");
    }

    private void cardBattle(LinkedList<Card> smallerField, LinkedList<Card> biggerField, LinkedList<Card> smallerGrave, LinkedList<Card> biggerGrave, Player smallerPlayer, JLabel smallerHealth) {
        for (int i = 0; i < smallerField.size(); i++) {
            updateGameLog(stringQueue, logLabel, smallerField.get(i).attacks(biggerField.get(i)));

            if (smallerField.get(i).compareTo(biggerField.get(i)) > 0) {
                biggerGrave.add(biggerField.get(i));
            } else if (smallerField.get(i).compareTo(biggerField.get(i)) < 0) {
                smallerGrave.add(smallerField.get(i));
            } else {
                biggerGrave.add(biggerField.get(i));
                smallerGrave.add(smallerField.get(i));
            }
        }

        for (int i = smallerField.size(); i < biggerField.size(); i++) {
            biggerField.get(i).attacks(smallerPlayer);
            smallerHealth.setText("HP: " + smallerPlayer.getHealth());

            updateGameLog(stringQueue, logLabel,
                    String.format(
                            "%s attacks %s for %d damage\n",
                            biggerField.get(i).getCardName(),
                            smallerPlayer.getPlayerName(),
                            biggerField.get(i).getAtkStr()
                    )
            );
        }
    }

    private boolean checkExodia() {
        boolean head = false;
        boolean leftTalon = false;
        boolean leftWing = false;
        boolean rightTalon = false;
        boolean rightWing = false;

        for (int i = 0; i < playerHand.size(); i++) {
            if (playerHand.get(i) == birdZodiaHead || playerHand.get(i) == birdZodiaHeadDupe) {
                head = true;
            }

            if (playerHand.get(i) == birdZodiaLeftTalon || playerHand.get(i) == birdZodiaLeftTalonDupe) {
                leftTalon = true;
            }

            if (playerHand.get(i) == birdZodiaLeftWing || playerHand.get(i) == birdZodiaLeftWingDupe) {
                leftWing = true;
            }

            if (playerHand.get(i) == birdZodiaRightTalon || playerHand.get(i) == birdZodiaRightTalonDupe) {
                rightTalon = true;
            }

            if (playerHand.get(i) == birdZodiaRightWing || playerHand.get(i) == birdZodiaRightWingDupe) {
                rightWing = true;
            }
        }

        if (head && leftTalon && leftWing && rightTalon && rightWing) {
            return true;
        } else {
            return false;
        }
    }


    private boolean checkmate() {
        if (player.getHealth() <= 0 || enemy.getHealth() <= 0 || checkExodia()) {
            if (!gameover) {
                return true;
            }
        }

        return false;
    }

    private void endgame() {
        gameover = true;


        if (checkExodia()) {
            ImageIcon zodiaicon = new ImageIcon("src/PNG/ExodiaWin.png");
            Image imagezod = zodiaicon.getImage(); // transform it
            Image newimg = imagezod.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            zodiaicon = new ImageIcon(newimg); // reset image icon

            JOptionPane.showMessageDialog(null, "", "Exodia Win!", JOptionPane.INFORMATION_MESSAGE, zodiaicon);
        } else if (player.getHealth() <= 0) {
            ImageIcon loseicon = new ImageIcon("src/PNG/Lose.png");
            Image imagelose = loseicon.getImage(); // transform it
            Image newimg2 = imagelose.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            loseicon = new ImageIcon(newimg2); // reset image icon

            JOptionPane.showMessageDialog(null, "", "You Lose!", JOptionPane.INFORMATION_MESSAGE, loseicon);
        } else {
            ImageIcon winicon = new ImageIcon("src/PNG/Win.png");
            Image imagewin = winicon.getImage(); // transform it
            Image newimg3 = imagewin.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            winicon = new ImageIcon(newimg3); // reset image icon

            JOptionPane.showMessageDialog(null, "", "You Win!", JOptionPane.INFORMATION_MESSAGE, winicon);
        }
        frame.dispose();



        clearBoard();
        displayLabels(playerLabels, playerField);
        displayLabels(enemyLabels, enemyField);
        displayEnemyHand();







    }

    public void newGame() {
        gameover = false;

        deckShuffle(playerDeck);
        deckShuffle(enemyDeck);

        intialDraw(playerHand, playerDeck);
        intialDraw(enemyHand, enemyDeck);

        player.setHealth(30);
        enemy.setHealth(30);

        maxMana = 2;

        player.setMana(maxMana);
        enemy.setMana(maxMana);

        for (int i = 0; i < playerField.size(); i++) {
            playerGrave.add(playerField.get(i));
        }
        for (int i = 0; i < enemyField.size(); i++) {
            enemyGrave.add(enemyField.get(i));
        }
        for (int i = 0; i < playerGrave.size(); i++) {
            playerField.remove(playerGrave.get(i));
        }

        for (int i = 0; i < enemyGrave.size(); i++) {
            enemyField.remove(enemyGrave.get(i));
        }
        playerGrave.clear();
        enemyGrave.clear();




        enemyTurn();
        displayPlayerHand();
    }

    public  void clearBoard() {
        for (int i = 0; i < playerField.size(); i++) {
            playerGrave.add(playerField.get(i));
        }
        for (int i = 0; i < enemyField.size(); i++) {
            enemyGrave.add(enemyField.get(i));
        }
        for (int i = 0; i < playerGrave.size(); i++) {
            playerField.remove(playerGrave.get(i));
        }

        for (int i = 0; i < enemyGrave.size(); i++) {
            enemyField.remove(enemyGrave.get(i));
        }

        playerGrave.clear();
        enemyGrave.clear();

        gameover = false;

        deckShuffle(playerDeck);
        deckShuffle(enemyDeck);

        intialDraw(playerHand, playerDeck);
        intialDraw(enemyHand, enemyDeck);

        player.setHealth(30);
        enemy.setHealth(30);

        maxMana = 2;

        player.setMana(maxMana);
        enemy.setMana(maxMana);

        displayPlayerHand();



    }

    public static void main(String[] args) {
        new Menu();
    }
}
