package kosta.basic;

import java.util.Scanner;

public class LoopExam {

	public static void main(String[] args) {

		// while : 초기식 → 조건식 → 명령문 → 증감식 : 수직방향
		
		/*	int i = 1;
			int sum = 0;	// 지역변수이기 때문에 초기화를 해주어야 한다.
			
			while (i <= 10) {
		
				sum += i;
				i++;
				
			}
			
			System.out.println("1에서 10까지의 합 : " + sum);
			*/
		
		
		// while문을 이용해서 구구단 7단을 만들자
		// 7 * 1 = 7
		/*		
				int num = 1;
				int sum = 0;
				
				while (num < 10) {
					
					sum = 7 * num;
					System.out.println("7 * " + num + " = " + sum);
					
					num++;
					
				}
				
				
				*/
		
		
		/*int cnt = 0;
		
		do {
			
			System.out.println(cnt);
			cnt++;
			
		} while (cnt < 10);
		
		System.out.println("Done.");*/
		
		
		// do~ while : 명령문을 먼저 실행 후 조건을 비교 → 적어도 1번은 실행을 한다.
		
		// Mission → 키보드로 부터 숫자를 입력받는 프로그램을 만들자
		// 조건 : 음수를 입력하면 다시 입력을 받도록 하여 양수만 출력되도록 하자.
		
		Scanner sc = new Scanner(System.in);
		
		/*int num = 0;
		
		
		do {
			
			System.out.print("숫자를 입력하세요 :");
			num = sc.nextInt();
			
			
			
		} while (num < 0);
		
		
		System.out.println();
		System.out.println("입력 된 숫자 : " + num);
		
		*/
		
		
		// do while문을 이용해서 정수 2자리 숫자만 입력받아 출력하세요.
		
		/*	int num3 = 0;
			
			do {
				
				System.out.print("두자리 숫자를 입력하세요 :");
				num3 = sc.nextInt();
				
			} while (num3 > 100 || num3 < 10 );
			
			System.out.println("입력 된 두 자리 숫자는 : " + num3);
			
			
			
			*/
		
		// for문 : 초기식 → 조건식 → 명령문 → 증감식 : 수평방향
		
		/*	int sum = 0;
			
			for(int i = 1; i <= 10 ; i++) {
				sum += i;
			}
			
			System.out.println("1부터 10까지의 합 : " + sum);
			*/
		
		// 구구단 출력하기
		
		for(int i = 1 ; i < 10 ; i++) {

			System.out.println("7 * " + i + " = " + i*7 );
			
		}
		
		
		/*
		 * int cnt = 0;
		 * 
		 * for( ; cnt < 10 ; ){
		 * 	  이럴 경우는 cnt를 for문 밖에서도 사용하려고 할 경우에 사용한다. 
		 * 
		 * }
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
