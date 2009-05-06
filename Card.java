class Card
{
  int suit, rank;

  public Card () {
    this.suit = 0;  this.rank = 0;
  }

  public Card (int suit, int rank) {
    this.suit = suit;  this.rank = rank;
  }
  public static void printCard(Card c){
    String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
         "7", "8", "9", "10", "Jack", "Queen", "King" };

    System.out.println (ranks[c.rank] + " of " + suits[c.suit]); 
}}
