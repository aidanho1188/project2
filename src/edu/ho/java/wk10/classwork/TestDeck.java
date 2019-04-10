package edu.ho.java.wk10.classwork;

public class TestDeck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		int count = 0;
		while (!deck.isEmpty()) {
			count++;
			Card card = deck.deal();
			System.out.println(count + ": " + card);
		}
	}
}
