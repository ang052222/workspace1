package kosta.oop;

public class Book {

	String name;
	int price;
	double dc;
	int tPrice;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	public void dcBook() {
		
		if(name.equals("JAVA")) {
			dc = 0.75;
		}
		if(name.equals("JSP")) {
			dc = 0.8;
		}
		if(name.equals("Oracle")) {
			dc = 0.85;
		}
		
		
		//System.out.println("dc뭐야 : " + dc);
	}
	
	
	public void totalPrice() {
		
		dcBook();
		
		tPrice = (int)(price * dc);
		
		//System.out.println("토탈프라이스뭐야 : " + tPrice);
	}
	
	public void totalPrint() {
		
		totalPrice();
		
		System.out.println(name+"교재는 정가는 " + price + "원 \n 할인된 가격은 " + tPrice + "원 입니다.");
		System.out.println();
	
	}
	
	
	
	/*
	 * 20일
	 * 1. 누구를 객체로 할 것인가 ? 객체 대상을 판단한다.
			- 상태와/ 행동으로 구분될 수 있다면 객체 후보가 된다.
			- 소프트웨어에서 필요한 객체여야 한다. 
	
		2. 상태와 행동으로 구분해야 한다. 
	
		3. 해당하는 Class를 생성해야한다. 
			-객체들이 가지고 있는 공통 된 데이터 구조와 기능을 추출해서 만든다.
	
		4. 객체를 생성해서 사용을 하면 된다. 
	
	
	
		** 객체 모델링이 우리나라는 취약하다. 객체 설계가. 
		jpa가 객체 모델링을 사용하는 툴
		오브젝트라는 책
		클린아키텍처
	
	
	
	
	
		new 할때마다 새로운 메모리가 생성 되는 것이다. 
	
		형변환할때 int랑 Integer.parseInt 차이점
	
	*/
	
	
}
