package kosta.data;

import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		// 정렬
		// 최초의 정렬기준 = 입력순서로 정렬 
		// Comparable → compareTo()
		// 정렬기준을 변경 → Comparator → compare()
		
		Random r = new Random();
		
		TreeSet<Integer> set = new TreeSet<Integer>(new Descending());	// 오름차순 정렬이 자동으로 되어있다.
																		// descending 써주는건 comparator 객체를 넣어주는 것과 같다. 
		
		for(int i = 0 ; set.size() < 6 ; i++) {
			int num = r.nextInt(45) +1;
			set.add(num);
		}
		
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
