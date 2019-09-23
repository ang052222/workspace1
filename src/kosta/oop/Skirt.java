package kosta.oop;

public class Skirt {
	
	// 3만원 이상이면 무배로
	
	
	String name;
	int price;
	int ship;
	int total;
	
	
	public Skirt() {}


	public Skirt(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	public void skritShip() {
		
		
		if(price >= 30000) {
			
			ship = 0;
			
					
		}else {
			
			ship = 2500;
		}
		
	}
	
	public void totalPrice() {
		
		total = price + ship;
	}
	
	public void skirkPrint() {
		
		if(ship != 0)
			System.out.println(name + "의 가격은 " + price + "원 이며, 배송비는 " + ship + "원 입니다. 총 가격은 " + total + "원 입니다. "  );
		else
			System.out.println(name + "의 가격은 " + price + "원 이며, 배송비는 무료입니다. 총 가격은 " + total + "원 입니다. "  );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
