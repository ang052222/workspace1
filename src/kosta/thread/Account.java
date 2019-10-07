package kosta.thread;

public class Account {

	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		
		if(balance < amount) {
			return 0;
		}
		
		balance -= amount;
		return amount;
	}
	
	
	
	
}
