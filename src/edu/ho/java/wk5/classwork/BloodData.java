package edu.ho.java.wk5.classwork;

public class BloodData {
	

	public static String bloodType;
	public static String rhfactor;
	
	public static void main(String[] arg) {
		BloodData b1 = new BloodData();
		BloodData b2 = new BloodData();
//		display(b1);
//		display(b2);
		b1.setBloodType("AB");
		b1.setRhfactor("-");
		display(b2);
		
	}
	

	// create constructor
	public void testBlood() {
		
	}
	
	public static void display(BloodData b) {
		System.out.println("The blood type is "+b.getBloodType()+ b.getRhfactor());
	}


	public String getBloodType() {
		return bloodType;
	}


	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}


	public String getRhfactor() {
		return rhfactor;
	}


	public void setRhfactor(String rhfactor) {
		this.rhfactor = rhfactor;
	}
	

}
