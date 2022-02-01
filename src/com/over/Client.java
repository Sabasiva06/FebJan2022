package com.over;

public class Client {

	private Integer id;
	private String name;
	private long mobileNo;
	
	public Client(Integer id, String name, long mobileNo) {
		this.id=id;
		this.name=name;
		this.mobileNo=mobileNo;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Client "+id+"+"+name+"+"+mobileNo+"";
	}
	
	
}
