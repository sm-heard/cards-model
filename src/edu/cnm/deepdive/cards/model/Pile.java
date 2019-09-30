package edu.cnm.deepdive.cards.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Pile implements Iterable<Card> {

  private final List<Card> cards;

  public Pile(){
    cards  = new LinkedList<>();
  }

  public void add(Card card){
    cards.add(card);
  }

  public void clear(){
    cards.clear();
  }

  public int size(){
    return cards.size();
  }

  public Card deal(){
    if (cards.isEmpty()){
      throw new NoSuchElementException();
    }
    return cards.remove(0);
  }


  @Override
  public String toString() {
    return cards.toString();
  }

  @Override
  public Iterator<Card> iterator() {
    return cards.iterator();
  }
}
