public class Menu {
    public void displayMenuOptions() {
        System.out.println("Menu Options:");
        System.out.println("1. Play Game");
        System.out.println("2. View Rules");
        System.out.println("3. View Scores");
        System.out.println("4. Quit Game");
    }

    public void displayRules() {
        System.out.println("Black Jack Rules:");
        System.out.println("1. The goal is to get as close to 21 and have a higher hand than the dealer without busting.");
        System.out.println("2. The player is dealt two cards and can choose to 'hit' or 'stand'. The dealer is dealt one card face up and one card face down.");
        System.out.println("The dealer must hit until their cards total 17 or higher. Once they reach 17 or higher, they must stand.");
        System.out.println("3. Face cards are worth 10, Aces can be worth 1 or 11 depending on the player's choice.");
        System.out.println("4. If you go over 21, you bust and lose the game unless the dealer busts too.");
    }

    public void playGame() {
        System.out.println("Starting a new game...");
        // Game logic would go here
    }
 
    public void quitGame() {
        System.out.println("Quitting the game.");
        System.out.println("Happy Gambling! Thanks for playing!");
        System.exit(0);
    }

    public void displayScores() {
        System.out.println("Displaying scores...");
        // Score display logic would go here
    }
}
