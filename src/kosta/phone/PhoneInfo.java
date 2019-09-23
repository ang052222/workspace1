package kosta.phone;

public class PhoneInfo {
	// 한 사람에 대한 전화번호 내역
	// 상태 ( name ,  phoneNo, birth)
	// 기능 (show : 전화번호부를 출력 )
	private String name;
	private String phoneNo;
	private String birth;
	
	public PhoneInfo() {}

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void show() {
		
		System.out.println(name + " \t " + phoneNo + " \t " + birth );
		
	}
	
	
	
	
	

}
