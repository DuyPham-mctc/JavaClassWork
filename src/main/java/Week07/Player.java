package Week07;

public class Player {
    private String name;
    private boolean knockedOut;
    private int knockoutNumber;
    Player(String name) {
        this.name = name;
        this.knockedOut = false;
    }

    public String getName() {
        return name;
    }

    public void setKnockoutNumber(int knockOutNumber) {
        this.knockoutNumber = knockOutNumber;
    }

    public boolean isKnockedOut(int score) {
        if (score == knockoutNumber) {
            return true;
        }
        else {
            return false;
        }
    }

    public String playTurn(DiceCup diceCup) {
        return null;
    }
}
