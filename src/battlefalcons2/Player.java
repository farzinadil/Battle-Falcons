package battlefalcons2;

/**
 * Created by farzinadil on 9/2/20.
 */
public class Player {
    private String playerName;
    private int health;
    private int mana;

    public Player() {
        this("guest", 30, 0);
    }

    public Player(String playerName) {
        this(playerName, 30, 2);
    }

    public Player(String playerName, int health, int mana) {
        this.playerName = playerName;
        setHealth(health);
        setMana(mana);
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0) {
            this.health = health;
        }

        else {
            this.health = 0;
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana >= 0) {
            this.mana = mana;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s Health: %d\n",
                playerName,
                health
        );
    }
}