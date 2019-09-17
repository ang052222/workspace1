package kosta.mission;

public class Mission02 {

	public static void main(String[] args) {

		// 특정 정수값에 대해서 전체 자리 수 중 짝수, 홀수 갯수를 구하자.
		// 5자리의 정수

		int num = 12345;
		int even = 0;
		int odd = 0;
		
		
		System.out.println("num 숫자는 : " + num);
		
		if(num % 2 == 0) {
			even = num / 2;
			odd = even;
			
		}else {
			even = (num-1) /2;
			odd = (num+1) /2;
			
		}
		
		System.out.println("짝수의 갯수: " + even);
		System.out.println("홀수의 갯수 : " + odd);
		
		
		 even = 0;
		 odd = 0;
		System.out.println("even 초기화 : " + even + "\nodd 초기화 : " + odd);
		
		
		even += (num /10000 % 2 == 0) ? 1 : 0;
		even += (num /1000 % 10 % 2 == 0) ? 1 : 0;
		even += (num /100 % 10 % 2 == 0) ? 1 : 0;
		even += (num /10 % 10 % 2 == 0) ? 1 : 0;
		even += (num % 2 == 0) ? 1 : 0;
		
		/*
		 * odd += !(num /10000 % 2 == 0) ? 1 : 0; odd += !(num /1000 % 10 % 2 == 0) ? 1
		 * : 0; odd += !(num /100 % 10 % 2 == 0) ? 1 : 0; odd += !(num /10 % 10 % 2 ==
		 * 0) ? 1 : 0; odd += !(num % 2 == 0) ? 1 : 0;
		 */
		
		odd = 5 - even;
		
		
		
		/*
		 * even = (num % 2 == 0) ? (num / 2 ) : ((num-1) / 2); odd = (num % 2 == 1) ?
		 * ((num+1) / 2) : (num /2);
		 * 
		 */
		
		
		
		
		System.out.println("!!!!삼항!!!!!!짝수의 갯수: " + even);
		System.out.println("!!!!삼항!!!!!!홀수의 갯수 : " + odd);
		
		
		
		
		
	}

}
