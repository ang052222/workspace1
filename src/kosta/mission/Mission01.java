package kosta.mission;

import java.util.Scanner;

/*
 * 프로그램 이름 : Hello 출력
 * 프로그램 내용 : 
 * 작성자 : 홍길동
 * 작성일자 : 2019년 9월 17일
 * 
 */
public class Mission01 {
	
	
	public static int totalSubject(int korea, int english, int math) {
		
		int sum = korea + english + math;
		
		return sum;
	}
	
	public static int averageSubject (int sum) {
		
		int average = sum / 3;
		
		return average;
	}
	
	
	

	public static void main(String[] args) {

		// 성적 관리 프로그램을 구현하자
		// 국어, 영어, 수학 점수 입력 받을 수 있는 변수를 선언
		// 변수에 적절히 초기화 하자.
		// 총점과 평균을 구하자
		// 총점과 평균을 출력해 보자.
		
		Scanner sc = new Scanner(System.in);

		
		int korea, english, math; 		// 국어 영어 수학 총점
		
		//int average, total; // 평균
		
		/*
		 * korea = 5; english = 5; math = 3;
		 */
		
		System.out.print("국어 점수를 입력하세요 : ");
		korea = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		english = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		System.out.println();
		
		
		//total = korea + english + math ;
		//average = (int)(total / 3.0);
		
		
		
		int sum1 = totalSubject(korea, english, math);
		
		int average1 = averageSubject(sum1);
		
		
		System.out.println("총점 : " + sum1 + "점");
		System.out.println("평균 : " + average1 + "점");
		//System.out.printf("평균 : %,2f ", average );
		
		
		System.out.println();
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
