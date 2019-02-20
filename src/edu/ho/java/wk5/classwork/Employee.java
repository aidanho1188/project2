package edu.ho.java.wk5.classwork;

import java.util.Scanner;;

public class Employee {

	private static Employee myEmployee;
	private static Employee Employee;

	public static void main(String[] args) {
		Employee = myEmployee;
		myEmployee = getEmployeeData();
		displayEmployee(myEmployee);
	}

	public static Employee getEmployeeData() {
		Employee tempEmp = new Employee();
		int id;
		double sal;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee ID >> ");
		id = input.nextInt();
		tempEmp.setEmpNum(id);
		System.out.print("Enter employee salary >> ");
		sal = input.nextDouble();
		tempEmp.setEmpNum(sal);
		return tempEmp;
	}

	private void setEmpNum(double sal) {
		// TODO Auto-generated method stub

	}

	public static void displayEmployee(Employee anEmp) {
		System.out.println("\nEmployee #" + anEmp.getEmpNum() + "Salary is" + anEmp.getEmpSalary());
	}

	private String getEmpSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getEmpNum() {
		// TODO Auto-generated method stub
		return null;
	}

}
