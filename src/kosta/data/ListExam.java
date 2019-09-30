package kosta.data;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ListExam {

	public static void main(String[] args) {
		
		// 배열을 이용해서 로또 프로그램을 출력
		Random r = new Random();
		
		/*int[] arr = new int[6];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = r.nextInt(45) +1 ;
			
			for(int j = 0 ; j < i ; j++) {
				if(arr[i] == arr[j]) {
					i -= 1;
				}
			}
			
		} // 1~45 임의의 값 중 하나의 난수를 넣는다. 
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " , ");
		}*/
		
		
		
		// List 자료구조를 이용한 로또 프로그램
		/*List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			
			int n = r.nextInt(45)+1;
			
			if(list.contains(n)) {
				continue; // 아래 실행하지 말고 while문의 true로 간다. 
			}else {
				list.add(n);
			}
			
			if(list.size() == 6) break;
			
		}
		
		for(int n : list) {
			System.out.print(n + ", ");
		}*/
		
		
		
		
		
		
		// Set 자료구조 이용하여 로또 프로그램 출력
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0 ; set.size() < 6 ; i++) { // set은 중복된 값이 들어 갈 수 없다. 
			set.add(r.nextInt(45)+1);
			
		}
		
		
		System.out.println(set);	// set 자체가 중복을 허용하지 않는다. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
