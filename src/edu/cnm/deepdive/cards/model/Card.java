package edu.cnm.deepdive.cards.model;

public class Card implements Comparable<Card>{

  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public int compareTo(Card other) {
    int comparison  = suit.compareTo(other.suit);
    if (comparison ==0){
      comparison = rank.compareTo(other.rank);
    }
    return 0;
  }

  @Override
  public String toString() {
    return rank.getSymbol() + suit.getSymbol();
  }
}
