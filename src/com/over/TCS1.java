package com.over;

public class TCS1 {

	private void employeeInfo(String name, int age, long mobileNo, boolean marriedStatus) {
		System.out.println("employee name :"+ name);
		System.out.println("employee age :"+ age);
		System.out.println("employee mobileNo :"+ mobileNo);
		System.out.println("employee married status:"+ marriedStatus);
	}
	
	public static void main(String[] args) {
		TCS1 a = new TCS1();
		a.employeeInfo("Ravikumar", 30, 9876543456l, true);
		a.employeeInfo("Suresh", 32, 87654345667l, true);
		
	}
	
	
}
