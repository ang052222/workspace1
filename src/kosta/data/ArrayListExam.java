package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExam {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		int num = list.size();
		
		//for(int i = 0 ; i < num ; i++) {
		//	String str = list.get(i);
		//	System.out.println(str);
		//}
		
		
		// for문 대신 Iterator로 전체 출력
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		System.out.println("remove()");
		
		
		// remove()
		list.remove(1);
		//for(String n : list)
		//	System.out.println(list);
		
		
		// for문 대신 Iterator로 전체출력
		iterator = list.iterator();		// 업데이트를 해줘야한다. 왜냐하면 끝에 가있기때문임
		while(iterator.hasNext()) {
			String str1 = iterator.next();
			System.out.println(str1);
		}
		
		
		
		
		System.out.println("indexOf");
		// indexOf()
		int index = list.indexOf("포도");
		System.out.println(index + "번 째에 있습니다. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
