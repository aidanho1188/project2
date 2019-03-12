package edu.ho.java.wk6.hwChapter9;

/**
 * 
 * @author Aidan 
 * Exercise 2
 */
public class Janitor extends Employee{
	public int getHours() {
		return 2 * super.getHours();
	}

	public int getSalary() {
		return super.getJanitorSalary() - 10000;
	}

	public int getVacationDays() {
		return super.getVacationDays() / 2;
	}

	public void clean() {
		System.out.println("Workin' for the man.");
	}
}
