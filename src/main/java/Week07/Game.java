package Week07;

import java.util.ArrayList;

import static input.InputUtils.*;

public class Game {
    // Fields a Game object will work with the dice cup
    // and list of players
    private DiceCup diceCup;
    private ArrayList<Player> players;
    public void main(String[] args) {
        // Make a new Game object and start playing
        Game knockout = new Game();
        knockout.startGame();
    }
    private void startGame() {
        // Make a dice cup with 2 dice
        diceCup = new DiceCup (2);
        // How many players? Create player objects
        int numberOfPlayers = positiveIntInput("How many players?");
        createPlayers(numberOfPlayers);
        // Get each player's knock-out number. Can only be 6, 7, 8 or 9
        setKnockoutNumbers();
        // Play the game.
        play();
        // Print winner
        printGameResults();
    }

    private void printGameResults() {
    }

    // Initialize the ArrayList of players,
    // get names and create Player objects
    private void createPlayers (int numberOfPlayers) {
        players = new ArrayList<>();
        for (int p = 1; p <= numberOfPlayers; p++) {
            String name = stringInput("Enter player "+ p + "'s name:");
            Player player = new Player(name);
            players.add(player);
        }
    }
    // For all the players in the players ArrayList, set their knockout number.

    private void setKnockoutNumbers() {
        for (Player p: players) {
            int knockOutNumber;
            do {
                knockOutNumber = intInput("Player " + p.getName() + ", " +
                        "please enter your knock-out number. It must be 6, 7, 8, or 9");
            } while (knockOutNumber < 6 || knockOutNumber > 9);// Validation
            p.setKnockoutNumber(knockOutNumber);
            // Set this player's knockout number
        }
    }

    private void play() {
            int playerIndex = 0;
            int totalPlayers = players.size();
            // Loop until there is only one player left.
            while (moreThanOnePlayerInPlay()) {
                Player currentPlayer = players.get(playerIndex);
                System.out.println();
                if (currentPlayer.isKnockedOut()) {
                    System.out.println("Sorry player "+currentPlayer.getName() +" , you are knocked out.");

                } else {

                    stringInput("Player "+ currentPlayer.getName() +" , press enter to roll:");

                    // Give the player the cup of dice, for them to roll the dice for their turn.
                    String turnResult = currentPlayer.playTurn (diceCup);
                    System.out.println(turnResult);

                }

                playerIndex = (playerIndex+1) % totalPlayers; // For looping around the ArrayList

            }

        }
    }

    private boolean moreThanOnePlayerInPlay() {
        int totalInPlay = 0;
        for (Player p: players) {
            if (!p.isKnockedOut()) {
                totalInPlay++;
            }
        }
        System.out.println("There are "+ totalInPlay + "player(s) in the game");
        return totalInPlay > 1;
    }
}
