package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// Map
		
		Map<String, String> map = new HashMap<String, String>();	//HashMap으로 생성
		
		map.put("1" , "Sk");
		map.put("2", "두산");
		map.put("3", "키움");
		
		System.out.println("요소의 사이즈 : " + map.size());
		
		if(map.containsValue("두산")) {
			map.remove("2");
		}
		
		System.out.println("요소의 사이즈 : " + map.size());
		
		
		
		
		// Map에 있는 전체목록 출력
		// Map → Set → Iterator → 출력
		
		Set set = map.entrySet();	// 해당하는 것을 Set으로 가져온다. 
		Iterator iter = set.iterator();
		
		while (iter.hasNext()) {
			Map.Entry<String, String> e = (Entry<String, String>) iter.next();	// Map의 내부구조의 Entry로 표현함
			System.out.println("key : " + e.getKey() + " value : " + e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
