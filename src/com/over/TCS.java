package com.over;

public class TCS {

	private void employeeInfo(String name) {
		System.out.println("employee name :"+ name);
	}
	
	private void employeeInfo(int age) {
		System.out.println("employee age :"+ age);
	}
	
	private void employeeInfo(long mobileNo) {
		System.out.println("employee mobileNo :"+ mobileNo);
	}
	
	private void employeeInfo(boolean marriedStatus) {
		System.out.println("employee married status:"+ marriedStatus);
	}
	
	public static void main(String[] args) {
		
		TCS a = new TCS();
		a.employeeInfo("Ravikumar");
		a.employeeInfo(30);
		a.employeeInfo(9876543456l);
		a.employeeInfo(true);
		
		
		a.employeeInfo("Suresh");
		a.employeeInfo(32);
		a.employeeInfo(87654345677l);
		a.employeeInfo(true);
	}
	
	
	
}






