package kosta.data;

public class Order {

	private int num;
	private String menuName;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int num, String menuName) {
		super();
		this.num = num;
		this.menuName = menuName;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	public void show() {
		
		
		System.out.println("번호 : " + num);
		System.out.println("주문 내용 : " + menuName);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
