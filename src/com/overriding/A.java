package com.overriding;

public class A { 

	public static void main(String[] args) {
		
		for (int i = 0; i <5; i++) {
			
			if(i==3) {
				//break;-- to terminate from loop
				//continue;-- to skip the loop for a given condition
				System.exit(i);
			}
			System.out.println(i);
		}
		System.out.println("testing");
		
	}

}
