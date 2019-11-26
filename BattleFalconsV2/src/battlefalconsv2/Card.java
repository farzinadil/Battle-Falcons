package battlefalconsv2;

public class Card implements Comparable<Card> {
    private String cardName;
    private int atkStr;
    private int manaCost;
    
    public Card() {
        this("default", 0, 0);
    }
    
    public Card(String cardName) {
        this(cardName, 0, 0);
    }
    
    public Card(String cardName, int atkStr) {
        this(cardName, atkStr, 0);
    }
    
    public Card(String cardName, int atkStr, int manaCost) {
        setCardName(cardName);
        setAtkStr(atkStr);
        setManaCost(manaCost);
    }
    
    public String getCardName() {
        return cardName;
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
    
    public String attacks(Player opponent) {
        opponent.setHealth(opponent.getHealth() - atkStr);
        
        return String.format (
                "%s takes %d damage\n"
                        + "%s's remaining health: %d",
                opponent.getUserID(),
                atkStr,
                opponent.getUserID(),
                opponent.getHealth()
        );
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
