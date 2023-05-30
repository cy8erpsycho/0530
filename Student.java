package com.my.student.dto;

import com.my.dto.Person;

public class Student extends Person{
	private String no;
	//private String name;
	public Student() {
		//super();
		//자동생성
	}

	public Student(String no, String name) {
		super();
		this.no = no;
		//this.name = name;
		setName(name);
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void print() {
		// super 현재사용중인 객체의 부모영역, this 현재사용중인 객체
		// 여기서는 getName() 메서드를 this 를 써도 super써도 괜찮음 getName메서드가 부모영역에 밖에 없기 때문
		System.out.println("학번:"+no +" ,이름:"+super.getName()); 
		
		
	
	}

	
	

}
