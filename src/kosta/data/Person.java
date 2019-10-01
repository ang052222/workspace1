package kosta.data;

import java.util.Comparator;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person ps) {
		// 최초의 정렬 기준을 세워보자
		
		if(this.age > ps.getAge()) {
			
			return 1;
			
		}else if(this.age < ps.getAge()) {
		
			return -1;
		}
		
		
		return 0;
		
	}

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
