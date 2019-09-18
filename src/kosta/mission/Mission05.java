package kosta.mission;

import java.util.Scanner;

public class Mission05 {

	
	
	public static void input(int[] arr, String[] subject) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print(subject[i]+" 성적을 입력하세요 : ");
			arr[i] = sc.nextInt();
			
			System.out.println(arr[i]);
			
			arr[3] += arr[i];
		}
		
		arr[4] = arr[3] / 3;
	}
	
	
	
	
	public static void output(int[] arr, String[] subject) {
		
		for(String s : subject) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		for(int n : arr) {
			System.out.print(n + "\t");
		}
		System.out.println();
		
		
		
	}
	
	
	public static void main(String[] args) {
		// 성적관리 프로그램을 구현하자
		// 국어, 영어, 수학 점수 입력 받을 수 있는 변수를 선언
		// 변수에 적절히 초기화 하자
		// 총점과 평균을 구하자
		// 총점과 평균을 출력해 보자
		// 배열을 이용하여 구현해 보자
		
		
		
		
		
		int arr[] = new int[5];
		String subject[] = {"국어", "영어", "수학", "평균", "총점"};
	
		
		
		input(arr, subject);
		output(arr, subject);
		
		
		

	}
	
	
	
	
	
	
	
	
	
	

}
