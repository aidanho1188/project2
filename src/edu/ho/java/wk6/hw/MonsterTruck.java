package edu.ho.java.wk6.hw;
/**
 * 
 * @author Aidan
 * Exercise 4
 */
public class MonsterTruck extends Truck{
	
    public void m1() {
        System.out.println("monster 1");
    }
    
    public void m2() {
        super.m1();
        super.m2();
    }
    
    public String toString() {
        return "monster " + super.toString();
    }

}