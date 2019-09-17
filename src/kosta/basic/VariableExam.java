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
		
		
		int num5 = 100 % 3;
		System.out.println("num5 : " + num5);
		
		int num6 = num5 + 2 ;
		System.out.println("num6 : " + num6);
		
		num5 += 2;
		System.out.println("num5 " + num5);
				
		
		
		int x = 10;
		int y = 0;
		
		y = x++;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		System.out.println("Hello, Java. \n하이하이");
		System.out.println("나는 \"비틀즈는 1970년에 해체됐어요\"라고 말했다. ");
		
		String str1 = "살어리 살어리랏다 청산에 살어리랏다 " + "머루랑 다래랑 먹고 청산에 살어리랏다 " + "얄리얄리 얄라셩 얄라리 얄라";
		
		System.out.println(str1);
		
		
		String str2 = "70" + 10 + "20";
		System.out.println(str2);
		
		int num7 = Integer.parseInt(str2);
		int result = num7 + 10;
		System.out.println(result);
		
		
		//----------------------------------
		
		System.out.println("//----------------------------------");
		
		int a = 3, b= 5, c= 9;
		String result2;
		
		if(a==3 & b==5) {
			System.out.println("두 값이 모두 true여서 true");
			
		}else {
			System.out.println("나오면 오답1");
		}
		
		if(a==5 | c== 3) {
			System.out.println("이게 나오면 true라느ㅡㄴ 것 오답2");
		}else {
			System.out.println("두 값이 모두 false여서  false");
			
		}
		
		
		if(b==5 ^ a==9) {
			System.out.println("하나가 true 나머지 하나가 false면 true");
		}else {
			System.out.println("나오면 오답3");
		}
		
		if(!(a == b)) {
			System.out.println("값이 false면 true가 되어서 true 됨!");
		}else {
			System.out.println("나오면 오답4");
		}
		
		System.out.println();
		System.out.println("-삼항연산자--------------------------------------------");
		
		int score = 65;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		
		System.out.println(grade);
		
		
		
		int score1 = 30, score2 = 50;
		int max = (score1 > score2) ? score1 : score2;
		
		System.out.println("max : " + max);
		
		
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문자열 : String 클래스
		// 문자열 비교 == => equals() 사용한다.
		
		String str3 = "abc";
		String str4 = new String("abc");  // 원래는 이렇게 생성해야 한다. String만큼은 너무 자주 사용하기 때문에 생략해도 되도록 약속함.
		
	
		if(str3 == str4) {
			System.out.println("str3와 str4가 같음");
		}else {
			System.out.println("str3와 str4가 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3와 str4가 같음");
		}else {
			System.out.println("str3와 str4가 다름");
		}
		
		
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
