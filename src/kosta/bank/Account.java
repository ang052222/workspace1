package kosta.bank;

public class Account {
	
	private String id;
	private long balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public long getBalance() {
		
		System.out.println("account의 getBalance");
		
		return balance;
	}
	
	public void deposit(long amt) {
		System.out.println("디파짓이야");
		
		balance += amt;
		
		
	}
	
	public boolean withdraw(long amt) {
		System.out.println("출금이야");
		
		if(balance < amt) {
			
			return false;
		}else {
			balance -= amt;
			return true;
		}
		
		
		
		
	}
	

}
