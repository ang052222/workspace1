package kosta.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {

		// 정수 b에서 정수 a를 뺀 값을 구하자.
		// 항상 b가 a보다 커야한다. b>a가 되도록 입력 받음
		
		// 1. do~while
		// 2. while(true) if문 만나서 break 걸게
		
		//1. do~while
		
		int b = 0;
		int a = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			System.out.print("정수 a를 입력 하세요 : ");
			a = sc.nextInt();
			
			System.out.print("정수 b를 입력 하세요 : ");
			b = sc.nextInt();
			
		} while (b < a);
		
		System.out.println("정수 b에서 정수 a를 뺀 값 : " + (b-a) );
		
		
		
		
		//2. while(true)
		
		
		
		while (true) {
			
			System.out.print("정수 a를 입력 하세요 : ");
			a = sc.nextInt();
			
			System.out.print("정수 b를 입력 하세요 : ");
			b = sc.nextInt();
			
			if(a<b) {
				
				System.out.println("정수 b에서 정수 a를 뺀 값 : " + (b-a) );
				break;
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
