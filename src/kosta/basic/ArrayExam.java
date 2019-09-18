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
		
		
		System.out.println();
		System.out.println();
		
		// 1. 배열에 사용 될 데이터 타입은 무엇인가?
		// 2. 배열의 크기는 얼마인가?
		// 3. 배열을 어떻게 초기화 시킬 것인가?? ( 직접인덱스 접근/ for문 / 생성과 동시에 )
		// → 배열 크기를 초과 했을 때  → ArrayIndexOfBoundsException
		// 4. 배열 안에 데이터를 어떻게 출력할 것인지?? ( for문 / 향상 된 for문 ) 
		
		// 퀴즈 → 구구단 7단의 결과를 배열 안에 초기화 후 배열에 있는 데이터를 출력하자.
		
		int arr4[] = new int[9];
		
		
		for(int i = 0 ; i < 9 ; i++) {
			
			//System.out.println(" 7 * " + (i+1) + " = " + (7*(i+1)));
			arr4[i] = 7*(i+1);
			System.out.println("arr4 [" + i + "] = " + arr4[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
