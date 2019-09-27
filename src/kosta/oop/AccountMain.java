package kosta.oop;

public class AccountMain {

	public static void main(String[] args) {

		Account obj, obj2, obj3; 
		
		obj = new Account("1111-1111", "홍길동", 2000 );  // obj는 레퍼런스 변수이다. Account는 클래스타입
		obj2 = new Account("1111-1111", "홍길동", 2000);
		obj3 = new Account();
		
		System.out.println(obj);
		
		if(obj.equals(obj2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		
		System.out.println();
		System.out.println();
		
		// 초기화
		/*obj.accountNo = "7535-02-01285441";
		obj.ownerName = "홍길동";
		obj.balance = 1000;
		
		obj2.accountNo = "01285441";
		obj2.ownerName = "박길동";
		obj2.balance = 5000;*/
		
		obj.deposit(500);
		
		System.out.println("계좌번호1 : " + obj.accountNo);
		System.out.println("계좌주1 : " + obj.ownerName);
		System.out.println("잔액1 : " + obj.balance + "원");
		System.out.println();
		System.out.println("계좌번호2 : " + obj2.accountNo);
		System.out.println("계좌주2 : " + obj2.ownerName);
		System.out.println("잔액2 : " + obj2.balance + "원");
		
		
	}

}
