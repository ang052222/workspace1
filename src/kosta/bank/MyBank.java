package kosta.bank;

public class MyBank {
	
	private Customer[] customers;
	private int customersNum;
	
	
	public MyBank() {
		
		customers = new Customer[10];
	}

	
	public void addCustomer(String id, String name, long balance) {
		
		Account ac = new Account(id, balance);
		
		
		customers[customersNum++] = new Customer(id, name, ac);
		
		/*System.out.println(customers[--count].getId());
		System.out.println(customers[count].getName());
		System.out.println(customers[count].getAccount().getBalance());
		
		count++;*/
		
	}

	public int getCustomersNum() {
		return customersNum;
	}
	
	
	public Customer getCustomer(String id) {
		
		int idx = -1;
		
		for(int i = 0 ; i < customersNum ; i++) {
			
			if(id.equals(customers[i].getId())) {
			customers[i].getAccount();
			idx = i;
			
			return customers[i];
			
			}
		}
		
		if(idx == -1) {  // try catch 사용
			
			System.out.println("해당하는 이름이 없습니다. ");
			
		}
		
		
		
		return null;
		
		
		
		
		
	}
	

	public Customer[] getAllCustomers() { // 배열크기만큼 카피해서 사이즈 리턴
		
		Customer[] allCust = new Customer[customersNum];
		System.arraycopy(customers, 0, allCust, 0, allCust.length);
		
		
		return allCust;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
