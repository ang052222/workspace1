package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// 이름과 점수를 한 쌍으로 한 Map 자료 구조를 구현하자.
		// 김자바 : 90, 박자바 : 80
		// 총점, 평균, 최대점수, 최소점수
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김자바", 90);
		map.put("박자바", 80);
		map.put("최자바", 70);
		map.put("이자바", 40);
		map.put("정자바", 50);
		
		
		Set set = map.entrySet();
		//Set set = (Set) map.values();
		Iterator iter = set.iterator();
		
		int sum = 0;
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> e = (Entry<String, Integer>) iter.next();
			//System.out.println(" value : " + e.getValue());
			
			sum += e.getValue();
			
		}
		
		System.out.println("총점 : " + sum);
		
		
		// 평균
		
		System.out.println("평균 : " + sum / map.size());
		
		//System.out.println(sum / map.size() + " 평균인가여????" + map.size() );
		
		
		
		// 최고점수
		int highScore = 0;
		iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> e = (Entry<String, Integer>) iter.next();
			//System.out.println(" value : " + e.getValue());
			
			if(highScore < e.getValue()) {
				highScore = e.getValue();
			}
			
			
		}
		
		System.out.println("최고 점수 : " + highScore);
		
		
		
		
		
		// 최저점수
		
		int lowScore = 100;
		iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> e = (Entry<String, Integer>) iter.next();
			//System.out.println(" value : " + e.getValue());
			
			if(lowScore > e.getValue()) {
				lowScore = e.getValue();
			}
			
			
		}
		
		System.out.println("최저 점수 : " + lowScore);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
