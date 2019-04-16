package edu.ho.java.wk10.hwChapter11;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("This program will tell you all prime");
		System.out.println("numbers up to a given maximum.");
		System.out.println();

		Scanner console = new Scanner(System.in);
		System.out.print("Maximum number? ");
		int max = console.nextInt();

		List<Integer> primes = sieve(max);
		System.out.println("Prime numbers up to " + max + ":");
		System.out.println(primes);
	}

	// Returns a list of all prime numbers up to given max
	// using the sieve of Eratosthenes algorithm.
	public static List<Integer> sieve(int max) {
		List<Integer> primes = new LinkedList<Integer>();

		// add all numbers from 2 to max to a list
		List<Integer> numbers = new LinkedList<Integer>();
		for (int i = 2; i <= max; i++) {
				numbers.add(i);
		}

		while (!numbers.isEmpty()) {
			int front = numbers.remove(0);
			// check square root
			if (Math.sqrt(numbers.size()) == max) {
				// remove a prime number from the front of the list
				primes.addAll(numbers);
			} else {
				primes.add(front);
			}

			// remove all multiples of this prime number
			Iterator<Integer> itr = numbers.iterator();
			while (itr.hasNext()) {
				int current = itr.next();
				if (current % front == 0) {
					itr.remove();
				}
			}
			
		}

		return primes;
	}
}
