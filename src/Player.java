public class Player {
    private int card1;
    private int card2;
    private int card3;
    private int card4;
    private int card5;
    private int card6;
    private int card7;
    private int card8;
    private int points;

    //Both constructors create the bot cards and player cards
    public Player() {
        card1 = (int) (Math.random() * 12) + 1;
        card2 = (int) (Math.random() * 12) + 1;
        card3 = (int) (Math.random() * 12) + 1;
        card4 = (int) (Math.random() * 12) + 1;
        card5 = (int) (Math.random() * 12) + 1;
        card6 = (int) (Math.random() * 12) + 1;
        card7 = (int) (Math.random() * 12) + 1;
        card8 = (int) (Math.random() * 12) + 1;
        points = 0;
    }

    public Player(int num) {
        card1 = (int) (Math.random() * 12) + 1;
        card2 = (int) (Math.random() * 12) + 1;
        card3 = (int) (Math.random() * 12) + 1;
        card4 = (int) (Math.random() * 12) + 1;
        card5 = (int) (Math.random() * 12) + 1;
        card6 = (int) (Math.random() * 12) + 1;
        card7 = (int) (Math.random() * 12) + 1;
        card8 = (int) (Math.random() * 12) + 1;
        points = 0;
    }

    public int chooseCard(int card) {
        if (card == 1) {
            if (card1 != 0) {
                int temp = card1;
                card1 = 0;
                return temp;
            }
        } else if (card == 2) {
            if (card2 != 0) {
                int temp = card2;
                card2 = 0;
                return temp;
            }
        } else if (card == 3) {
            if (card3 != 0) {
                int temp = card3;
                card3 = 0;
                return temp;
            }
        } else if (card == 4) {
            if (card4 != 0) {
                int temp = card4;
                card4 = 0;
                return temp;
            }
        } else if (card == 5) {
            if (card5 != 0) {
                int temp = card5;
                card5 = 0;
                return temp;
            }
        } else if (card == 6) {
            if (card6 != 0) {
                int temp = card6;
                card6 = 0;
                return temp;
            }
        } else if (card == 7) {
            if (card7 != 0) {
                int temp = card7;
                card7 = 0;
                return temp;
            }
        } else if (card == 8) {
            if (card8 != 0) {
                int temp = card8;
                card8 = 0;
                return temp;
            }
        }
        return 0;
    }

    public int botChoose() {
        int num = 0;
        while (num == 0) {
            num = (int)(Math.random() * 8) + 1;
            if (getCard(num) == 0) {
                num = 0;
            }
        }
        return chooseCard(num);
    }

    private int getCard(int num) {
        if (num == 1) {
            return card1;
        } else if (num == 2) {
            return card2;
        } else if (num == 3) {
            return card3;
        } else if (num == 4) {
            return card4;
        } else if (num == 5) {
            return card5;
        } else if (num == 6) {
            return card6;
        } else if (num == 7) {
            return card7;
        } else {
            return card8;
        }
    }

    public int getPoints() {
        return points;
    }

    public String showCards() {
        return card1 + " " + card2 + " " + card3 + " " + card4 + " " + card5 + " " + card6 + " " + card7 + " " + card8;
    }

    public void addPoints() {
        points++;
    }
}
