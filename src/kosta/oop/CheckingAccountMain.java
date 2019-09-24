package kosta.oop;

public class CheckingAccountMain {

	public static void main(String[] args) {

		
		CheckingAccount ca = new CheckingAccount("1111", "홍길동", 1000, "1111");
		
		try {
			System.out.println("지불금액 : " + ca.pay("1111", 400));   // Exception을 해결해주지 않았기떄문에 에러가 난다. → try catch로 해결 ㅇㅇ 
		} catch (Exception e) {
			System.out.println("캐치캐치캐치 ㅇ예예예예");
			e.printStackTrace();
		} 
		
		
		System.out.println("잔액 : " + ca.balance + "원입니다. ");
		
		
	}

}
