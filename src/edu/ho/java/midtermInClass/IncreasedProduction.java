package edu.ho.java.midtermInClass;
/**
 * 
 * @author Aidan
 *
 */
public class IncreasedProduction {
	
	public static void main(String[] args) {
		int parts = 4000; // starting parts
		double percent =0.06;// increase by 6% each month
		// display month when parts > 7000
		for(int x=1; x <= 24;x++) { // x== month
			int increased = (int) (parts*percent); // number of increased parts
			parts = increased +parts;
			System.out.println("Month number " + x + ", Number of parts: " + parts);
			if (parts >= 7000 && parts <7500) {
				System.out.println("The number of months it take to reach 7000 parts is "+x);
			}
		}
		
	}

}
