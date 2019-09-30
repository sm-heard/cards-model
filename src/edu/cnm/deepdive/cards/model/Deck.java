package edu.cnm.deepdive.cards.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Deck {

  private final List<Card> cards;
  private final List<Card> dealt;

  public Deck(){
    cards = new ArrayList<>();
    dealt = new LinkedList<>();

    for (Suit s: Suit.values()){
      for (Rank r: Rank.values()){
        cards.add(new Card(r,s));
      }
    }
  }

  public Card deal(){
    if (cards.isEmpty()){
      throw new NoSuchElementException();
    }
    Card card = cards.remove(0);
    dealt.add(card);
    return card;
  }

  public void shuffle(Random rng){
    cards.addAll(dealt);
    dealt.clear();
    Collections.shuffle(cards,rng);
  }

  public void sort(){
    cards.addAll(dealt);
    dealt.clear();
    Collections.sort(cards);
  }

  @Override
  public String toString() {
    return cards.toString();
  }
}
