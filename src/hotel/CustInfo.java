package hotel;

public class CustInfo {

	private String name;	// 이름
	private char gender;	// 나이
	private int age;		// 성별
	private String phone;
	
	public CustInfo() {}

	public CustInfo(String name, char gender, int age, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CustInfo [name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone + "]";
	}

	
	
	
	
	
	
}
