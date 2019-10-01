package kosta.phone;

import java.util.Comparator;

public class PhoneInfo implements Comparable<PhoneInfo>, Comparator<PhoneInfo>{
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

		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNo);
		System.out.println("생일 : " + birth);
		
	}

	@Override
	public int compareTo(PhoneInfo p) {
		// 최초의 정렬 기준
		
		if(this.name.compareTo(p.getName()) > 0) {
			
			return 1;
			
		}else if(this.name.compareTo(p.getName()) < 0) {
		
			return -1;
		}
		
		
		return 0;
	}

	@Override
	public int compare(PhoneInfo o1, PhoneInfo o2) {
		// 이름 내림차순으로
		
		if(o1.getName().compareTo(o2.getName()) < 0) {
			return 1;
		}else if(o1.getName().compareTo(o2.getName()) > 0) {
			return -1;
		}
			return 0;
	}


	

	
	

}
