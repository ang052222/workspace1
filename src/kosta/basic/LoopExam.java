package kosta.basic;

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
		
		
		int cnt = 0;
		
		do {
			
			System.out.println(cnt);
			cnt++;
			
		} while (cnt < 10);
		
		System.out.println("Done.");
		
		
		
		
		
		
	}

}
