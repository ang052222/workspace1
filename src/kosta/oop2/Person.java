package kosta.oop2;

public class Person {

	private String name;
	Role role;
	
	public Person() {
	}
	
	
	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}


	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public void doo() {
		System.out.println("이름 : " + name);
		role.doIt();
		System.out.println();
	}


	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	


}
