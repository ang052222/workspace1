package kosta.oop;

public class Account {

	// 공통된 데이터 구조
	// 계좌번호, 계좌주, 잔액 : 상태 → 멤버변수(field, 속성) 멤버변수는 초기화를 할 필요가 없다. 
	String accountNo;
	String ownerName;
	int balance;
	
	
	
	public Account() {
		// 디폴트 생성자
	}
	
	
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}









	// 공통된 기능 : 행동 → 멤버메소드(operation)
	// 입금하다. 출금하다. 
	
	
	
	public void deposit(int amount) {
		
		balance += amount;
		
	}
	
	
	public int withdraw(int amount) {
		
		if(balance < amount) {
			
			return 0;
			
		}else {
			
			balance -= amount;
			
			return amount;
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	
	
	
	
}
