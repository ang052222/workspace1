package kosta.mission;

import java.util.Scanner;

public class Mission01_01 {

	public static void main(String[] args) {
		// 성적관리프로그램 이차원배열로,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
		
		Scanner sc = new Scanner(System.in);
		
		
		int arr[][];
		arr = new int[3][3];
		String subject[] = {"국어", "영어", "수학"};
		
		
		
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			for(int j = 0 ; j < arr[i].length ; j++) {
				
				System.out.print((i+1)+"번째 학생의 "+ subject[j] + "성적을 입력하세요 :");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		/*for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}
			
		*/
		// 총점
		
		
		//System.out.println("성적의 총합을 구해보자,,,,각자");
		
		System.out.print("몇 번째 학생의 총합을 보시겠습니까? : ");
		int totalperson = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0 ; i < arr[totalperson-1].length  ; i++) {
			//System.out.println(arr[totalperson-1][i]);
			sum += arr[totalperson-1][i];
		}
		
		
		
		System.out.println(totalperson+"번째 학생의 총점은  : " + sum + "점 입니다.");
		
		
		
		
		// 평균
		
		System.out.println(totalperson+"번째 학생의 평균은 : " + (sum / (arr.length)) + "점 입니다.");

	}

}
