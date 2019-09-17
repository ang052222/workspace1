package kosta.mission;


/*
 * 프로그램 이름 : Hello 출력
 * 프로그램 내용 : 
 * 작성자 : 홍길동
 * 작성일자 : 2019년 9월 17일
 * 
 */
public class Mission01 {

	public static void main(String[] args) {

		// 성적 관리 프로그램을 구현하자
		// 국어, 영어, 수학 점수 입력 받을 수 있는 변수를 선언
		// 변수에 적절히 초기화 하자.
		// 총점과 평균을 구하자
		// 총점과 평균을 출력해 보자.
		
		
//		ㅁ   
//		ㅁ
//		ㅁ
//		ㅁ
//		ㅁ
//		
		
		int korea, english, math; 		// 국어 영어 수학 총점
		
		int average, total; // 평균
		
		korea = 5;
		english = 5;
		math = 3;
		
		total = korea + english + math ;
		average = (int)(total / 3.0);
		
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + average + "점");
		//System.out.printf("평균 : %,2f ", average );
		
		
		
	}

}
