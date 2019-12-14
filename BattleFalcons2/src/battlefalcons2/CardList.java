package battlefalcons2;

/**
 */
import java.util.LinkedList;
import java.util.Stack;
import java.util.Random;

public class CardList {
    public static final Random rng = new Random();

    public static int maxMana = 2;

    public static Player player = new Player("Player");
    public static Player enemy = new Player("Opponent");

    public static Stack <Card> playerDeck = new Stack<>();
    public static Stack <Card> enemyDeck = new Stack<>();

    public static LinkedList <Card> playerField = new LinkedList<>();
    public static LinkedList <Card> enemyField = new LinkedList<>();

    public static LinkedList <Card> playerHand = new LinkedList<>();
    public static LinkedList <Card> enemyHand = new LinkedList<>();

    public static LinkedList <Card> playerGrave = new LinkedList<>();
    public static LinkedList <Card> enemyGrave = new LinkedList<>();


    public static final Card alToyBarn = new Card("Al from Al's Toy Barn", "src/PNG/al.png", 9, 9);
    public static final Card birdie = new Card("Birdie", "src/PNG/Birdie.png", 2, 2);
    public static final Card evilBat = new Card("Evil Bat", "src/PNG/Evil Bat.png", 4, 4);
    public static final Card flock = new Card("Flock", "src/PNG/Flock.png", 5, 5);
    public static final Card friedChicken = new Card("Fried Chicken", "src/PNG/Fried Chicken.png", 8, 8);
    public static final Card frozenPenguin = new Card("Frozen Penguin", "src/PNG/Frozen Penguin.png", 5, 5);
    public static final Card birdZodiaHead = new Card("Head of Bird Zodia", "src/PNG/Head of Birdzodia.png", 1, 1);
    public static final Card karatePelican = new Card("Karate Pelican", "src/PNG/Karate Pelican.png", 4, 4);
    public static final Card kingPenguin = new Card("King Penguin", "src/PNG/King Penguin.png", 7, 7);
    public static final Card birdZodiaLeftTalon = new Card("Left-Talon of Birdzodia", "src/PNG/Left-Talon of Birdzodia.png", 1, 1);
    public static final Card birdZodiaLeftWing = new Card("Left-Wing of Birdzodia", "src/PNG/Left-Wing of Birdzodia.png", 1, 1);
    public static final Card ostrich = new Card("Ostrich", "src/PNG/Ostrich.png", 6, 6);
    public static final Card pegasus = new Card("Pegasus", "src/PNG/Pegasus.png", 5, 5);
    public static final Card penguin = new Card("Penguin", "src/PNG/Penguin.png", 5, 5);
    public static final Card birdZodiaRightTalon = new Card("Right-Talon of Birdzodia", "src/PNG/Right-Talon of Birdzodia.png", 1, 1);
    public static final Card birdZodiaRightWing = new Card("Right-Wing of Birdzodia", "src/PNG/Right-Wing of Birdzodia.png", 1, 1);
    public static final Card toucan = new Card("Toucan", "src/PNG/Toucan.png", 3, 3);
    public static final Card worldsSmallestBird = new Card("Worlds Smallest Bird", "src/PNG/Worlds Smallest Bird.png", 1, 1);

    public static final Card alToyBarnDupe = new Card("Al from Al's Toy Barn", "src/PNG/al.png", 9, 9);
    public static final Card birdieDupe = new Card("Birdie", "src/PNG/Birdie.png", 2, 2);
    public static final Card evilBatDupe = new Card("Evil Bat", "src/PNG/Evil Bat.png", 4, 4);
    public static final Card flockDupe = new Card("Flock", "src/PNG/Flock.png", 5, 5);
    public static final Card friedChickenDupe = new Card("Fried Chicken", "src/PNG/Fried Chicken.png", 8, 8);
    public static final Card frozenPenguinDupe = new Card("Frozen Penguin", "src/PNG/Frozen Penguin.png", 5, 5);
    public static final Card birdZodiaHeadDupe = new Card("Head of Bird Zodia", "src/PNG/Head of Birdzodia.png", 1, 1);
    public static final Card karatePelicanDupe = new Card("Karate Pelican", "src/PNG/Karate Pelican.png", 4, 4);
    public static final Card kingPenguinDupe = new Card("King Penguin", "src/PNG/King Penguin.png", 7, 7);
    public static final Card birdZodiaLeftTalonDupe = new Card("Left-Talon of Birdzodia", "src/PNG/Left-Talon of Birdzodia.png", 1, 1);
    public static final Card birdZodiaLeftWingDupe = new Card("Left-Wing of Birdzodia", "src/PNG/Left-Wing of Birdzodia.png", 1, 1);
    public static final Card ostrichDupe = new Card("Ostrich", "src/PNG/Ostrich.png", 6, 6);
    public static final Card pegasusDupe = new Card("Pegasus", "src/PNG/Pegasus.png", 5, 5);
    public static final Card penguinDupe = new Card("Penguin", "src/PNG/Penguin.png", 5, 5);
    public static final Card birdZodiaRightTalonDupe = new Card("Right-Talon of Birdzodia", "src/PNG/Right-Talon of Birdzodia.png", 1, 1);
    public static final Card birdZodiaRightWingDupe = new Card("Right-Wing of Birdzodia", "src/PNG/Right-Wing of Birdzodia.png", 1, 1);
    public static final Card toucanDupe = new Card("Toucan", "src/PNG/Toucan.png", 3, 3);
    public static final Card worldsSmallestBirdDupe = new Card("Worlds Smallest Bird", "src/PNG/Worlds Smallest Bird.png", 1, 1);
    public static final Card blank = new Card("Blank", "src/PNG/blank.png");
    public static final Card trueBirdzodia = new Card("The Winged Birdzodia of Ra", "src/PNG/The True Birdzodia.png", 30, 20);
    public static final Card question = new Card("Question", "src/PNG/question.png");
    public static final Card ancientBirdSkull = new Card("Ancient Bird Skull", "src/PNG/Ancient Bird Skull.png",9,9);
    public static final Card ancientEgg = new Card("Ancient Egg", "src/PNG/Ancient Egg.png",10,10);
    public static final Card infinibird = new Card("Infinibird", "src/PNG/Infinibird.png",8,8);
    public static final Card sadClown = new Card("Sad Clown.png", "src/PNG/Sad Clown.png",3,3);
    public static final Card sunnySideUp = new Card("Sunny Side Up", "src/PNG/Sunny Side Up.png",2,2);
    public static final Card trashBird = new Card("Trash Bird", "src/PNG/Trash Bird.png",1,1);
    public static final Card ancientBirdSkullDupe = new Card("Ancient Bird Skull", "src/PNG/Ancient Bird Skull.png",9,9);
    public static final Card ancientEggDupe = new Card("Ancient Egg", "src/PNG/Ancient Egg.png",10,10);
    public static final Card infinibirdDupe = new Card("Infinibird", "src/PNG/Infinibird.png",8,8);
    public static final Card sadClownDupe = new Card("Sad Clown.png", "src/PNG/Sad Clown.png",3,3);
    public static final Card sunnySideUpDupe = new Card("Sunny Side Up", "src/PNG/Sunny Side Up.png",2,2);
    public static final Card trashBirdDupe = new Card("Trash Bird", "src/PNG/Trash Bird.png",1,1);


    public static final Card[] allCards = {
            ancientBirdSkull,
            ancientEgg,
            infinibird,
            sadClown,
            sunnySideUp,
            trashBird,
            sadClownDupe,
            sunnySideUpDupe,
            trashBirdDupe,
            alToyBarn,
            birdie,
            evilBat,
            friedChicken,
            birdZodiaHead,
            karatePelican,
            kingPenguin,
            birdZodiaLeftTalon,
            birdZodiaLeftWing,
            ostrich,
            pegasus,
            penguin,
            birdZodiaRightTalon,
            birdZodiaRightWing,
            toucan,
            worldsSmallestBird,
            frozenPenguin,
            flock,
            birdieDupe,
            evilBatDupe,
            birdZodiaHeadDupe,
            karatePelicanDupe,
            kingPenguinDupe,
            birdZodiaLeftTalonDupe,
            birdZodiaLeftWingDupe,
            ostrichDupe,
            pegasusDupe,
            penguinDupe,
            birdZodiaRightTalonDupe,
            birdZodiaRightWingDupe,
            toucanDupe,
            worldsSmallestBirdDupe,
            frozenPenguinDupe,
            flockDupe
    };


    public static void deckShuffle(Stack <Card> deck) {
        LinkedList <Card> cardsLeft = new LinkedList<>();

        if(!deck.isEmpty()) {
            deck.clear();
        }

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
        if(!hand.isEmpty()) {
            hand.clear();
        }

        for (int i = 0; i < 6; i++) {
            hand.add(deck.pop());
        }
    }

    public static void drawCard(LinkedList <Card> hand, Stack <Card> deck) {
        if(hand.size() < 6 && deck.size() > 0) {
            hand.add(deck.pop());
        }
    }
}