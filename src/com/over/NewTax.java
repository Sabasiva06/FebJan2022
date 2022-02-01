package com.over;

public class NewTax extends OldTax {

	@Override
	public void taxLimit(int limit) {
		System.out.println("from 2021 to 2023 tax limit :"+limit);
		super.taxLimit(250000);
	}
	
	public static void main(String[] args) {
		NewTax a = new NewTax();
		a.taxLimit(500000);
		
	}
	
}
