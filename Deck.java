public class Deck{
	Card[] cards;
	
	public Deck (){
		cards = new Card[52];}
	public Deck (int n, int suits, int ranks){
		cards = new Card[n];
		int index = 0;
		for (int suit = 0; suit <=suits; suit++){
			for (int rank = 1; rank<=ranks; rank++){
				cards[index] = new Card (suit, rank);
				index++;}
							}
					   	}
	public static void printDeck (Card[] deck) {
        for (int i=0; i<deck.length; i++) {
      		printCard (deck[i]);
    					}
 						   }
        public static void printCard (Card c) {
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
         "7", "8", "9", "10", "Jack", "Queen", "King" };

        System.out.println (ranks[c.rank] + " of " + suits[c.suit]);
  }
}	
