package edu.ho.java.wk10.classwork;

public class TestSuit {

	public static void main(String[] args) {

		Suit s = Suit.spade;
		Suit h = Suit.heart;
		Suit d = Suit.diamond;
		Suit c = Suit.club;

		System.out.println(s + " " + h + " " + d + " " + c);
		System.out.println(s.equals(s));
		System.out.println(s.equals(h));
		System.out.println(s.compareTo(s));
		System.out.println(s.compareTo(d));
		System.out.println(d.compareTo(s));
	}

}
