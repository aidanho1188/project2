package edu.ho.java.wk10.classwork;

public class Suit {

	static public final Suit spade = new Suit(4, "spades");
	static public final Suit heart = new Suit(3, "hearts");
	static public final Suit diamond = new Suit(2, "diamonds");
	static public final Suit club = new Suit(1, "clubs");

	private int order;
	private String name;

	// take int order and name of the card
	private Suit(int ord, String nm) {
		name = nm;
		order = ord;
	}

	// compareTo method for other suit
	public int compareTo(Object other) {
		if (!(other instanceof Suit))
			throw new IllegalArgumentException("Parameter must be a Suit");
		Suit otherSuit = (Suit) other;
		return order - otherSuit.order;
	}

	public String toString() {
		return name;
	}

}
