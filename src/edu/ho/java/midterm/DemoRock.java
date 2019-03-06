package edu.ho.java.midterm;

public class DemoRock {

	IgneousRock Basalt = new IgneousRock(2220, 100);
	MetamorphicRock Schist = new  MetamorphicRock(3330, 10); 
	SedimentaryRock Shale = new SedimentaryRock(4440, 50);
	
	public static void main(String[] args) {
		
	}
	
	public void print() {
		System.out.println("Type:"+Basalt.getRockType()+" Sample:"+Basalt.getSample()+" Weight:"+Basalt.getWeight());
	}
}
