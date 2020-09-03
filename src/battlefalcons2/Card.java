package battlefalcons2;

public class Card implements Comparable<Card> {
    private String cardName;
    private String image;

    private int atkStr;
    private int manaCost;

    public Card() {
        this("default", "", 0, 0);
    }

    public Card(String cardName) {
        this(cardName, "", 0, 0);
    }

    public Card(String cardName, String image) {
        this(cardName, image, 0, 0);
    }

    public Card(String cardName, String image, int atkStr) {
        this(cardName, image, atkStr, 0);
    }

    public Card(String cardName, String image, int atkStr, int manaCost) {
        setCardName(cardName);
        setImage(image);
        setAtkStr(atkStr);
        setManaCost(manaCost);
    }

    public String getCardName() {
        return cardName;
    }

    public String getImage() {
        return image;
    }

    public int getAtkStr() {
        return atkStr;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAtkStr(int atkStr) {
        if (atkStr > 0) {
            this.atkStr = atkStr;
        }

        else {
            this.atkStr = 0;
        }
    }

    public void setManaCost(int manaCost) {
        if (manaCost > 0) {
            this.manaCost = manaCost;
        }

        else {
            this.manaCost = 0;
        }
    }

    public void attacks(Player enemy) {
        enemy.setHealth(enemy.getHealth() - atkStr);
    }

    public String attacks(Card enemy) {
        if (this.compareTo(enemy) > 0) {
            return String.format (
                    "%s kills %s",
                    cardName,
                    enemy.getCardName()
            );
        }

        else if(this.compareTo(enemy) < 0) {
            return String.format (
                    "%s kills %s",
                    enemy.getCardName(),
                    cardName
            );
        }

        else {
            return String.format (
                    "%s and %s kill each other",
                    cardName,
                    enemy.getCardName()
            );
        }
    }

    @Override
    public int compareTo(Card enemy) {
        return atkStr - enemy.atkStr;
    }

    @Override
    public String toString() {
        return String.format(
                "Card Name: %s\n"
                        + "Attack Strength: %d\n"
                        + "Mana Cost: %d",
                cardName,
                atkStr,
                manaCost
        );
    }
}