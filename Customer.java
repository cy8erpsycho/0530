package com.my.customer.dto;

public class Customer {
	private String id;
	private String pwd;
	private String name;
	private boolean flag; 
	public void setId(String id) {//전달해주는 역할
		this.id = id;
	}
	public String getId() {  
		return id;  //현재 객체의 프로퍼티값을 반환
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public boolean isFlag() {  // get타입은 is로 시작한다
		return flag;
	}
}
