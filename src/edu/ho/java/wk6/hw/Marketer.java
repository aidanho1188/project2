package edu.ho.java.wk6.hw;

/**
 * 
 * @author Aidan
 * Exercise 1
 */
public class Marketer extends Employee {
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
    
    public int getSalary() {
        return super.getSalary() + 10000;
    }
}
