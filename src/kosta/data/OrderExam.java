package kosta.data;

import java.util.LinkedList;
import java.util.Scanner;

public class OrderExam {
	
	

	public static void main(String[] args) {
		// 1. 주문 2. 주문처리
		// 1. 주문에는 번호와 메뉴가 한 객체로 들어가야 한다. 
		// 큐
		
		LinkedList<Order> order = new LinkedList<Order>();
		Scanner sc = new Scanner(System.in);
		
		String num = "";
		
		order.offer(new Order(1, "피자"));
		order.offer(new Order(2, "치킨"));
		order.offer(new Order(3, "김밥"));
		order.offer(new Order(4, "족발"));
		order.offer(new Order(5, "보쌈"));
		order.offer(new Order(6, "떡볶이"));
		
		
		
		
		do {
			
			System.out.println("*******************");
			System.out.println("1. 주문 ");
			System.out.println("2. 주문 처리 ");
			System.out.println();
			System.out.println("*******************");
			System.out.print("번호를 선택해 주세요 : ");
			num = sc.next();
			
			
			switch (num) {
			case "1":
				System.out.print("추가하실 메뉴를 입력해주세요.");
				String menu = sc.next();
				
				order.offer(new Order(order.size()+1, menu));
				
				break;
				
				
			case "2":
				
				while(!order.isEmpty()) {
					
					Order str = order.poll();
					str.show();
					
				}
				System.out.println();
				System.out.println("첫번째 주문을 처리하시겠습니까?");
				String yn = sc.next();
				
				if(yn.equals("y")) {
					order.removeFirst();
					
					while(!order.isEmpty()) {
						
						Order str1 = order.poll();
						str1.show();
						
					}
					
				}
				
				
				break;
			case "3":
				
				return;

			}
			
			
			
			
		} while (num != "3");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
