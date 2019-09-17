package kosta.basic;

public class VariableExam {

	public static void main(String[] args) {

		/*
		 * int a = 10; int num = 0;
		 * 
		 * if(a < 5) {
		 * 
		 * num = 20; }
		 * 
		 * System.out.println(num);
		 */
		
		int num1 = 66;
		System.out.println((char)num1);
		
		
		float num2 = 3.14f; // cannot convert from double to float
		System.out.println(num2);
		
		char ch = 'A' ;
		System.out.println((int)ch); // 모든 문자열에 대해서 아스키 코드로 변환이 가능하다.
		
		String str = "ABC"; // String은 기본형 데이터 타입이 아니다.
		
		boolean bool = false ;
		boolean bool2 = true;
		//boolean bool3 = ttt; 
		
		
		
		// 형변환(Casting) : 기본형 데이터 타입 
		// byte < short < int < long < float < double 
		
		int num3 = 10;
		double dnum = num3; // 더 큰 데이터 타입으로 바뀌기 때문에 int가 double로 바뀐다. ** 묵시적 형변환이라고 한다. 
		
		double e = 3 ;
		int num4 = (int)3.14; // 강제 형변환을 해주어야 한다. 원래 큰 데이터타입을 작은 것으로 넣을 수 없기때문에 바꿔줘야한다. 
		System.out.println(num4);  // int형 크기 만큼 잘라 주었기때문에 뒷 소수점이 손실 되었다. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
