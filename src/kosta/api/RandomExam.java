package kosta.api;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {

		
		// 난수 구하기
		int num = (int)(Math.random() * 9) + 1;  // 1~9 중에서 나온다.
		System.out.println(num);
		System.out.println();
		
		// 랜덤클래스로 구하기
		Random r = new Random();
		int num2 = r.nextInt(10)+1; // 1~ 10 중에서 나온다. 
		System.out.println(num2);
		
		
		// 카드 게임
		String cards[] = {"카드1", "카드2", "카드3", "카드4", "카드5", "카드6", "카드7", "카드8", "카드9", "카드10"};
		
		
		for(int i = 0 ; i < 10 ; i++) {
			int num3 = r.nextInt(10);
			int num4 = r.nextInt(10);
			
			String temp;
			temp = cards[num3];
			cards[num3] = cards[num4];
			cards[num4] = temp;
			
			//System.out.println(cards[num3]);
			//System.out.println(cards[num4]);
			
		}
		
		for(String i : cards) {
			System.out.print(i);
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
