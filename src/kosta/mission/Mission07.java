package kosta.mission;

import java.util.Scanner;

public class Mission07 {

	
	public static void cm(int[] arr) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print((i+1) +"번째 사람의 키를 입력하세요 : ");
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println();
		/*System.out.print("배열 되니??");
		for(int n : arr) {
			System.out.print(n);
		}
		*/
		
	}
	
	
	public static void taller(int[] arr) {
		
		int best = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(best < arr[i]) {
				best = arr[i];
			}
			
		}
		
		
		System.out.println("가장 큰 키는 : " + best + "cm 입니다. ");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// 배열을 이용하여 각 사람의 키를 입력 받아
		// 가장 큰 키를 출력하세요!

		int[] arr = new int[5];
		
		cm(arr);
		taller(arr);
		
	}
	

}
