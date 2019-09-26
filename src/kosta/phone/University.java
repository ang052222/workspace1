package kosta.phone;

public class University extends PhoneInfo {

	private String major;
	private int year;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(String name, String phoneNo, String birth, String major, int year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("전공 : " + major);
		System.out.println("학번 : " + year);
		
	}
	
	
	
	
	
	
	
	
	
}
