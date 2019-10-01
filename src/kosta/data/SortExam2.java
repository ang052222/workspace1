package kosta.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam2 {

	public static void main(String[] args) {

		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("김자바", 18));
		list.add(new Person("박자바", 18));
		list.add(new Person("나자바", 18));
		list.add(new Person("이자바", 14));
		list.add(new Person("최자바", 88));
		list.add(new Person("홍자바", 56));
		
		
		
		

		//Collections.sort(list);	// 이걸 해 줘야 입력 된 순서대로 되지 않고 Person 클래스의 compareTo() 메소드대로 정렬이 된다. 
		Collections.sort(list, new Comparator<Person>(){ // 익명 내부 클래스
		
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getName().compareTo(o2.getName()) > 0) {
					
					return 1;	// 자리를 바꾸라는 구나! 라고 생각한다. (컴퓨터가)
					
				}else if(o1.getName().compareTo(o2.getName()) < 0) {
					
					return -1;
				}
				
				return 0;
			}});
		
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
	}

}
