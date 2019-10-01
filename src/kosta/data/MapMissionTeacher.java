package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMissionTeacher {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김자바", 90);
		map.put("박자바", 80);
		map.put("최자바", 70);
		map.put("이자바", 40);
		map.put("정자바", 50);
		
		
		// Key값 추출
		Set<String> set = map.keySet();
		System.out.println("시험명단 : " + set);
		
		
		// Value 값 추출
		Collection<Integer> values = map.values();
		
		
		// Iterator로 하나씩 추출
		Iterator<Integer> iter = values.iterator();
		
		int total = 0;
		while (iter.hasNext()) {

			int num = iter.next();
			total += num;
			
		}
		
		System.out.println("총점 : " + total);
		
		System.out.println("평균 : " + total / map.size());
		
		System.out.println("최고점수 : " + Collections.max(values));
		
		System.out.println("최저점수 : " + Collections.min(values));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
