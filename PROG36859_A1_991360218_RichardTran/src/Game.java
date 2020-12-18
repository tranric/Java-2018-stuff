
/*
Assignment No.: 1
Member 1: Khurram Khan (991474897)
Member 2: Richard Tran (991360218)
Submission Date: September 19, 2018
Instructor’s name: Syed Tanbeer
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Game {
    //These two methods shuffle the deck
    private static void swap(ArrayList<Card> c, int i, int change) {
        Card helper = c.get(i);
        c.set(i, c.get(change));
        c.set(change, helper);
    }

    public static void shuffleList(ArrayList<Card> c) {
        int n = c.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(c, i, change);
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Creates deck
        ArrayList<Card> deck = new ArrayList();
        for (int s = 0; s < 4; s++) {
            for (int f = 2; f <= 14; f++) {
                Card c = new Card(f, s);
                deck.add(c);

            }
        //    System.out.println(deck.get(s));
        }
        //Creates array list of players, then asks user to enter player names
        ArrayList<Player> players = new ArrayList();
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter name of Player "+(i+1)+": ");
            Player p = new Player(input.nextLine());
            players.add(p);
        }

        //Test Code
        /*
        Player p1 = new Player("Alex");
        Player p2 = new Player("John");
        Player p3 = new Player("Tony");
        Player p4 = new Player("Jenifer");
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
*/

        //shuffles the deck
        shuffleList(deck);

        //Deals out the cards
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                players.get(j).addCard(deck.get(0));
                deck.remove(0);
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Cards in the hand of "+players.get(i).getName()+": ");
            for (Card c : players.get(i).getHand()) {
                System.out.println(c.getSuitValue()+" "+c.getFaceValue());
            }
            System.out.println();
        }
//Plays the game
        for (int i = 0; i < 13; i++) {
            System.out.println();
            System.out.println("Round: "+(i+1));
            Card max = players.get(0).getHand().get(i);
            for (int p = 0; p < 4; p++) {
                System.out.println(players.get(p).getName()+": "+players.get(p).getHand().get(i).getSuitValue()+" "+players.get(p).getHand().get(i).getFaceValue());
            }
            //Gets the biggest card
            for (int j = 1; j < 4; j++) {
                Card current = players.get(j).getHand().get(i);
                if (max.getFaceValue() < current.getFaceValue()) {
                    max = current;
                } else if (max.getFaceValue() == current.getFaceValue()) {
                    if (max.getSuitValue() < current.getSuitValue()) {
                        max = current;
                    }
                }
            }
            //Finds who has the biggest card and gives them a win
            for (int k = 0; k < 4; k++) {
                if (players.get(k).getHand().contains(max)) {
                    players.get(k).addWin();
                    System.out.println("Winner: "+players.get(k).getName());
                    System.out.println("With: "+max.getSuitValue()+" "+max.getFaceValue());
                }
            }
        }
        //Displays the number of rounds won per player
        System.out.println();
        System.out.println("# of rounds won: ");
        for (int p = 0; p < 4; p++) {
            System.out.println(players.get(p).getName()+": "+players.get(p).getWins());
        }

        int maxWin = players.get(0).getWins();
        for (int i = 1; i < 4; i++) {
            if (maxWin < players.get(i).getWins()) maxWin = players.get(i).getWins();
        }
        System.out.println();
        System.out.println("Overall Winner(s): ");
        for (int i = 0; i < 4; i++) {
            if (players.get(i).getWins() == maxWin) System.out.println(players.get(i).getName());
        }
    }
}
