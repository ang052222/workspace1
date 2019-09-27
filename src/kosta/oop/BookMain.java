package kosta.oop;

public class BookMain {

	public static void main(String[] args) {

		Book[] arr = {new Book("JAVA", 30000), new Book("JSP", 25000), new Book("Oracle", 15000)};
		
		/*arr[0].totalPrint();
		arr[1].totalPrint();
		arr[2].totalPrint();*/
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].totalPrint();
		}
		
		
		
		String str = "Hello, Java";
		System.out.println(str);
		
		
		Integer it = new Integer(100);
		System.out.println(it);
		
		
		
		
		
	}
	
	
	
	/*과제>책값을 계산하는 프로그램을 만들어 보자.
	교재 JAVA, JSP, Oracle 각각 가격이 30000, 25000, 15000 이다.
	교재 DC는 30000원 이상 25% 할인
		20000원 이상 20% 할인
		15000원 이상 15%할인
	
	결과> JAVA교재는 정가는 30000원 할인된 가격은 22500원 입니다.
	
	객체지향 
	책값 DC하는 메서드를 구현
	책값을 출력하는  메서드도 따로 구현 
	
	
	
	
	객체모델링을 위한 상태와 행동으로 추상화 작업을 수행 한 후
	상태  ==> 변수
	행동 ==> 메서드   : 클래스를 완성한다.
	
	클래스에서 new연산자를 통해 객체를 생성하고 그와 함께 적당한 생성자를 구현한다.
	
	그리고 생성된 객체를 통해 구현된 메서드를 호출하여 적당한 값을 연산 하고,
	
	원하는 결과값을 출력한다.
	
	
	--------
	3 개의 객체필요함
	책이라는 클래스가 필요함
	
	book이라는 클래스를 만듬. (java,jsp,oracle) 
	멤버변수 뽑아야하고 , 기능을 뽑아야하고
	
	
	배열로 하면 더 좋음.
	
	만약하면 북 배열, 책값 dc, 책값 출력 */


	
	
	
	
	
	
	
	
	
}
