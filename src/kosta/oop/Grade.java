package kosta.oop;

import java.util.Scanner;

public class Grade {

	String name;
	int korea;
	int english;
	int math;
	int total;
	int average;
	
	
	public Grade() {
		// TODO Auto-generated constructor stub
	}

	
	public Grade(String name, int korea, int english, int math) {
		super();
		this.name = name;
		this.korea = korea;
		this.english = english;
		this.math = math;
		
		totalPerson();
		averagePerson();
		
	}
	
	
	
	public void totalPerson() {
		
		total = korea + english + math;
		
	}
	
	
	public void averagePerson() {
		
		average = total /3;
	}
	
	
	public void printPerson() {
		
		System.out.println("***************************");
		System.out.println(name + "의 성적 내역입니다.");
		System.out.println();
		System.out.println("국 어 : " + korea);
		System.out.println("영 어 : " + english);
		System.out.println("수 학 : " + math);
		System.out.println("----------------------------");
		System.out.println("총 점 : " + total);
		System.out.println("평 균 : " + average);
		System.out.println();
		System.out.println("***************************");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
