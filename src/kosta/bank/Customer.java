package kosta.bank;

public class Customer {
	
	private String id;
	private String name;
	private Account account;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String name, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}

	public String getId() {
		return id;
	}

	/*public void setId(String id) {
		this.id = id;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		System.out.println("customer의 getaccount임");
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}
