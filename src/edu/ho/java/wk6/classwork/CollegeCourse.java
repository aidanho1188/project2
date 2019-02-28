package edu.ho.java.wk6.classwork;

public class CollegeCourse {

	protected String department;
	protected int courseNum;
	protected int credit;
	protected double courseFee; // $120 /hours
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public double getCourseFee() {
		return courseFee;
	}
	
	
}
