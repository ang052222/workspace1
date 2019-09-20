package kosta.oop;

public class AccountMain {

	public static void main(String[] args) {

		Account obj = new Account();  // obj는 레퍼런스이다. Account는 클래스타입
		
		// 초기화
		obj.accountNo = "75350201285441";
		obj.ownerName = "홍길동";
		obj.balance = 1000;
		
		obj.deposit(500);
		
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("계좌주 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance + "원");
		
		
	}

}
