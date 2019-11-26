package falconbattles;

public class Player {
    private String userID;
    private int health;
    
    private int totalGames = 0;
    private int winTotal = 0;
    
    private double fullScore = 0.0;
    private double avgScore;
    
    public Player() {
        this("guest");
    }
    
    public Player(String userID) {
        this.userID = userID;
    }
    
    public String getUserID() {
        return userID;
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
    
    public void newGame() {
        totalGames++;
        avgScore = fullScore / totalGames;
        health = 30;
    }
    
    public void endGame() {
        if(health > 0) {
            winTotal++;
            fullScore += health;
        }
        
        avgScore = fullScore / totalGames;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Player ID: %s\n"
                        + "Games Played: %d\n"
                        + "Win/Loss: %d/%d\n"
                        + "Average Score: %.2f",
                userID,
                totalGames,
                winTotal,
                totalGames - winTotal,
                avgScore
        );
    }
}
