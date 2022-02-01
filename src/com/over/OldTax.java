package com.over;

public class OldTax {

	public void taxLimit(int limit) {
		System.out.println("from 2018 to 2020  taX limit:"+ limit);
	}
	
	public static void main(String[] args) {
		
		OldTax a = new OldTax();
		a.taxLimit(250000);
	}
	
	
}
