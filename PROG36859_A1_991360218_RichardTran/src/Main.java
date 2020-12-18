import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


//DO NOT USE USE THE GAME JAVA FILE
//UNFINISHED VERISON AS I FORGOT TO ACCOUNT FOR MODULARITY



//PROG36859 Assignment 1
//Richard Tran 991360218
//submission date: Sept 28, 2018
//instructor name: Syed Tanbeer

public class Main {

	public static void main(String[] args) {

		//4 being suits, 13 being suit ranks
		//suit order: Clubs, Diamonds, Hearts, Spades
		//suit rank:  0, 1, 2, 3, 4

		//card face: deuce, three, four, five...,  ten, jack, queen, king, ace
		// card rank: 2, 3, 4....,11,12,13,14
		// zero for card face is unselectable.
		// 0,3 =  3 of clubs

		//Making the deck/Adding cards to the deck.

		//version 1
		//int[][] DeckofCards = new int[4][14];
		//version 2- creating the deck
		ArrayList<String> CardDeck = new ArrayList();
		//for suits
		for(int x=0; x < 4; x++){
			//for card face
			for(int y=2; y<=14; y++){
				// " " space is being used as a delimiter for seperating
				// the suit and card face for ranking
				CardDeck.add(x + " " + y);
			}

		}

		//card list
		//System.out.println(CardDeck);
		//deck size
		//System.out.println(CardDeck.size());

		//Step 1: Shuffling the deck.

		//version 1
		//Collections.shuffle(CardDeck);

		//version 2
		//shufflelist methods at the bottom
		shuffleList(CardDeck);

		//check if it has been shuffled properly
		//System.out.println(CardDeck);


		ArrayList<String> player1 = new ArrayList();
		ArrayList<String> player2 = new ArrayList();
		ArrayList<String> player3 = new ArrayList();
		ArrayList<String> player4 = new ArrayList();
		ArrayList<ArrayList> allplayers = new ArrayList();
		allplayers.add(player1);
		allplayers.add(player2);
		allplayers.add(player3);
		allplayers.add(player4);

		//distributing cards:
		System.out.println("Card Game simulation by Richard Tran(991360218)" );
		System.out.println("Distribution of cards:");

		//verison 1
		/*
		while(!CardDeck.isEmpty()){
			player1.add(CardDeck.get(0));
			CardDeck.remove(0);
			player2.add(CardDeck.get(0));
			CardDeck.remove(0);
			player3.add(CardDeck.get(0));
			CardDeck.remove(0);
			player4.add(CardDeck.get(0));
			CardDeck.remove(0);
		}
		*/
		//checks the player's cards
		//System.out.println(player1);
		//version 2
		for(int x=0; x < 4; x++){
			System.out.println("\nCards for player " + (x+1));
			//13 cards per player.
			for(int y=0; y < 13; y++){
				allplayers.get(x).add(CardDeck.get(0));
				System.out.println(CardDeck.get(0));
				CardDeck.remove(0);
			}

		}

		//System.out.println(player1);

		//step 3: play / dealing cards from each player
		int player1score=0, player2score=0, player3score=0, player4score=0;
		for(int x=0; x < 13; x++){
			//retrieves the top card from each player
			System.out.print("\nDeal number " + (x+1)
					+ ": " + player1.get(0) + ", " +
					player2.get(0) + ", " +
					player3.get(0) + ", " +
					player4.get(0));
			//checks which player's top card is the highest value
			//if more than one player has the highest value card then
			//no player gets a point

			//gets the value of the card
			String[] player1card = player1.get(0).split(" ");
			String[] player2card = player2.get(0).split(" ");
			String[] player3card = player3.get(0).split(" ");
			String[] player4card = player4.get(0).split(" ");

			//compares each player's card and adds to the score to
			//according player with highest valued card
			if(Integer.parseInt(player1card[1]) > Integer.parseInt(player2card[1])
			&& Integer.parseInt(player1card[1]) > Integer.parseInt(player3card[1])
			&& Integer.parseInt(player1card[1]) > Integer.parseInt(player4card[1])){
				player1score++;
			}
			else if(Integer.parseInt(player2card[1]) >
			Integer.parseInt(player3card[1])
			&& Integer.parseInt(player2card[1]) > Integer.parseInt(player4card[1])
			){
				player2score++;
			}
			else if(Integer.parseInt(player3card[1]) >
			Integer.parseInt(player4card[1])){
				player3score++;
			}

			//removes the top card from each player to get to the next deal.
			player1.remove(0);
			player2.remove(0);
			player3.remove(0);
			player4.remove(0);
		}

		//step 4: print the score and the winner fo the game.




	}
	//takes the arraylist and uses a random number to choose a spot in
	//the arraylist
	//it calls the method swap to change the spots of two spots in the
	//array list and does this the same amount of times as
	//the size of the arraylist.
	public static void shuffleList(ArrayList<String> a) {
	    int n = a.size();
	    Random random = new Random();
	    random.nextInt();
	    for (int i = 0; i < n; i++) {
	      int change = i + random.nextInt(n - i);
	      swap(a, i, change);
	    }
	  }

	// used for the shufflelist method
	//it takes one spot of the array list and saves it into  a a placeholder
	//then takes the second slot choosen to replace the old slot
	//then the original slot of the replacing slot is now replaced
	//by the placeholder, inturn it means both of the two slots
	//have been swapped.
	  private static void swap(ArrayList<String> a, int i, int change) {
	    String placeholder = a.get(i);
	    a.set(i, a.get(change));
	    a.set(change, placeholder);
	  }


}
