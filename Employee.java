package com.my.employee.dto;  //패키지의 목적 : 패키지가 다르면 클래스의 중복을 피할수 있다

import com.my.dto.Person;

public class Employee extends Person{ // 무조건 '단일' 부모로부터 상속받는다
	private String no;
//	private String name;
	private int salary;
	
	public Employee() {  //오버로드된 메서드
	}
	
	
	public Employee(String no, String name) {
		super();
		this.no = no;
//		this.name = name;
		setName(name);
	}


	public Employee(String no, String name, int salary) {
		super();
		this.no = no;
//		this.name = name;
		setName(name);
		this.salary = salary;
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}



	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
