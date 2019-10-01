package kosta.data;

import java.util.Comparator;

public class Descending implements Comparator<Integer> {

	
	
	
	
	
	@Override
	public int compare(Integer o1, Integer o2) {
		// 내림차순에 대한 정렬기준 정의
		
		if(o1 < o2) {
			
			return 1;	// 자리를 바꾸라는 구나! 라고 생각한다. (컴퓨터가)
			
		}else if(o1 > o2) {
			
			return -1;
		}
		
		return 0;	// 값이 o1과 o2가 같다. == 그냥 내버려 둬라
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
