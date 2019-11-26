package falconbattles;

import java.util.*;

public class CardList {
    public static final Random rng = new Random();
    
    public static Stack <Card> playerDeck = new Stack<>();
    public static Stack <Card> enemyDeck = new Stack<>();
    
    public static LinkedList <Card> playerField = new LinkedList<>();
    public static LinkedList <Card> enemyField = new LinkedList<>();
    
    public static LinkedList <Card> playerHand = new LinkedList<>();
    public static LinkedList <Card> enemyHand = new LinkedList<>();
    
    public static final Card exodia = new Card("Exodia", 30, 10);
    public static final Card blackLotus = new Card("Black Lotus", 3, 3);
    
    public static final Card[] allCards = {
        exodia,
        blackLotus,
        exodia,
        blackLotus,
        exodia,
        blackLotus,
        exodia,
        blackLotus,
        exodia,
        blackLotus
    };
    
    public static void deckShuffle(Stack <Card> deck) {
        LinkedList <Card> cardsLeft = new LinkedList<>();
        
        for (int i = 0; i < allCards.length; i++) {
            cardsLeft.add(allCards[i]);
        }
        
        for (int i = 0; i < allCards.length; i++) {
            int random = rng.nextInt(cardsLeft.size());
            deck.add(cardsLeft.get(random));
            cardsLeft.remove(random);
        }
    }
    
    public static void intialDraw(LinkedList <Card> hand, Stack <Card> deck) {
        for (int i = 0; i < 5; i++) {
            hand.add(deck.pop());
            System.out.println(hand.get(i) + "\n");
        }
    }
}
