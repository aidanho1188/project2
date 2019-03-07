package edu.ho.java.midtermInClass;
/**
 * 
 * @author Aidan
 *
 */
public class DemonPoems {
	
	public static void main(String[] args) {
		// create objects and set name and lines
		Poem poem1 = new Poem("The Raven", 84);
		Couplet poem2 = new Couplet("True Wit");
		Limerick poem3= new Limerick("There was an Old Man with a Bread");
		Haiku poem4 = new Haiku("The Wren");
		
		// call method
		System.out.println("Poem 1");
		print(poem1);
		System.out.println("");
		System.out.println("Poem 2");
		print(poem2);
		System.out.println("");
		System.out.println("Poem 3");
		print(poem3);
		System.out.println("");
		System.out.println
		("Poem 4");
		print(poem4);
	}

	private static void print(Poem poem) {
		// print line
		System.out.println("Poem name: "+poem.getName());
		System.out.println("Number of lines: "+poem.getLines());
	}
}
