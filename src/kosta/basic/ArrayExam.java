package kosta.basic;

public class ArrayExam {

	public static void main(String[] args) {

		// 1. 배열 선언, 생성 분리
		
		int arr[];		// 주소 값을 넣을 수 있는 변수가 하나 생성 된 것임
		
		arr = new int[5];		// int형 변수 5개가 생성되었고, arr변수에 생성 된 배열의 주소 값이 대입 됐다.
		
		
		// 2. 배열선언과 생성을 함께
		int arr2[] = new int[5];
		
		
		// 3. 배열 선언과 생성, 초기화 까지 한꺼번에
		int arr3[] = {1,2,3,4,5};
		
		
		// for문 이용해보기
		for(int i = 0 ; i < arr3.length ; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
			
		}
		
		
		// 향상 된 for문
		for(int n : arr3) {  // n이 첨부터 끝까지 알아서 돌아가기 때문에 배열의 크기를 몰라도 된다는 장점이 있다.
			System.out.print(n + ",");
			
			// 인덱스값을 추출할 순 없어서 그 점에서는 불편하다.
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
