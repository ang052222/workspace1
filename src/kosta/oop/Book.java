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
	
	
	
}
