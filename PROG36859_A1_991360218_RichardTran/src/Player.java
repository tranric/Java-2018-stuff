import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList();
    private int wins = 0;

    public Player(String name) {
        this.name = name;
    }
//adds a card
    public void addCard(Card c) {
        this.hand.add(c);
    }
//adds a win
    public void addWin() {
        this.wins++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
}
