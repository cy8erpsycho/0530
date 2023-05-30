package com.my.dto;

public class Person { 	  
	private String name; 
	// 부모가 person	 //	다만 자식이 접근을 할수 없음
	// 부모의 private 멤버변수도 자식에게 물려줄수 있다
	// 부모쪽에 공통점을 다 몰아넣는다
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

/*  IS A, (kind of) 관계일때만 상속?
 *  사원 - 사람, 학생 - 사람, 계좌 - 사람
 *  class Account{
 *  String no;
 *  String pwd;
 *  String name;
 *  String ssn;
 *  
 *  계좌 HAS A 사람
 *  Peron p;
 */