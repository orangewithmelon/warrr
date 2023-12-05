import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);
    private int rounds;
    public Game() {  }

    public String startGame() {
        Player player1 = new Player();
        Player bot = new Player(1);
        System.out.println("Welcome to War! This is a game of chance where you have to get 5 points to win this game. You have to choose a card that is higher than the bot to win one point. If you tie, then you have to play wordle in order to win.");
        System.out.println("The card numbers go from 1 to 8. You have to chose one of those card numbers. Once you used a card, you can't use it anymore.");
        while (!(player1.getPoints() == 5 || bot.getPoints() == 5 || rounds == 8)) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Your cards: " + player1.showCards());
            System.out.println("Bot cards: " + bot.showCards());
            System.out.print("What card would you like to choose? ");
            int card = scan.nextInt();
            scan.nextLine();
            int playerCard = player1.chooseCard(card);
            int botCard = bot.botChoose();
            System.out.println("You used " + playerCard + ". The bot chose " + botCard);
            System.out.println("---------------------------------------------------------------------");
            if (playerCard > botCard) {
                player1.addPoints();
                System.out.println("You won one point!");
            } else if (playerCard < botCard) {
                bot.addPoints();
                System.out.println("The bot won one point!");
            } else {
                System.out.println("It's a tie!");
            }
            rounds++;
        }
        if (player1.getPoints() == bot.getPoints()) {
            Wordle wordle = new Wordle(word());
            return wordle.wordleGame();
        }
        if (player1.getPoints() > bot.getPoints()) {
            return "You WIN! You got more points than the bot.";
        } else {
            return "You lost. The bot has more points than you.";
        }
    }

    private String word() {
        String[] array = new String[15]; //https://www.geeksforgeeks.org/java-program-to-write-an-array-of-strings-to-the-output-console/
        array[0] = "water";
        array[1] = "melon";
        array[3] = "apple";
        array[4] = "crane";
        array[5] = "ratio";
        array[6] = "shirt";
        array[7] = "panel";
        array[8] = "burnt";
        array[9] = "cream";
        array[10] = "adore";
        array[11] = "bread";
        array[12] = "build";
        array[13] = "craft";
        array[14] = "mined";
        return array[(int)(Math.random()*15)];
    }
}
