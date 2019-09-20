package kosta.oop;

public class Member {

	String name;
	int age;
	String address;
	
	
	public Member(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
				
	}
	
	
	public void print() {
		
		System.out.println("***************************");
		System.out.println("회원내용 입니다.");
		System.out.println();
		System.out.println("이 름 : " + name);
		System.out.println("나 이 : " + age);
		System.out.println("주 소 : " + address);
		System.out.println();
		System.out.println("***************************");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
