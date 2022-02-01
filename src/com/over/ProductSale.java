package com.over;

public class ProductSale {

	private void companyInfo(String ownerName, long mobileNo) {
		System.out.println("company owner name:"+ ownerName+"\n" +"company mobileno :"+ mobileNo);
		
	}
	
	private void companyInfo(long aadar, String address) {
		System.out.println("company owners aadar:"+ aadar);
		System.out.println("company address :"+ address);
	}
	
	public static void main(String[] args) {
		
		ProductSale a = new ProductSale();
		a.companyInfo("Murugan", 987654567889l);
		a.companyInfo(987654323456545l, "OMR, Chennai-60097");
		
		a.companyInfo("Babu", 654324567l);
		a.companyInfo(1234567654345l, "Trichy, Anna Nagar");
		
		
		
	}
	
}
