import java.util.Scanner;

public class Wordle {
    Scanner scan = new Scanner(System.in);
    private String word;

    public Wordle(String word) {
        this.word = word;
    }

    //Runs Wordle
    public String wordleGame() {
        System.out.println("You must guess a 5 letter word in 6 tries. - means it's not in the word, * means it is in the word but not in the right place, and a letter means it's in the the word and in the right place.");
        for (int i = 0; i < 6; i++) {
            System.out.print("Guess a word all lowercase: ");
            String guess = scan.nextLine();
            String temp = "";
            for (int h = 0; h < 5; h++) {
                boolean letter = false;
                for (int w = 0; w < 5; w++) {
                    if (guess.substring(h, h + 1).equals(word.substring(w, w + 1))) {
                        if (h == w && !letter) {
                            temp += guess.substring(h, h + 1);
                            letter = true;
                        } else if (!letter) {
                            temp += "*";
                            letter = true;
                        }
                    }
                }
                if (!letter) {
                    temp+="-";
                }
            }
            System.out.println(temp);
            if (temp.equals(word)) {
                return "You WIN!";
            }
        }
        return "You lost.";
    }
}
