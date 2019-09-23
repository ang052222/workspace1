package kosta.phone;

public class PhoneInfo {
	// 한 사람에 대한 전화번호 내역
	// 상태 ( name ,  phoneNo, birth)
	// 기능 (show : 전화번호부를 출력 )
	String name;
	String phoneNo;
	String birth;
	
	public PhoneInfo() {}

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	
	public void show() {
		
		System.out.println(name + " \t " + phoneNo + " \t " + birth );
		
	}
	
	
	
	
	

}
