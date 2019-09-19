package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission08 {

	public static void main(String[] args) {
		// Up Down Game
		// 1~100 임의의 정수를 맞추는 게임
		// 몇 번째만에 맞췄습니다. 출력까지
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int re = r.nextInt(100);
		
		System.out.println(re);
		
		
		
		int answer = 0;
		int count = 0;
		
		
		do {
			
			System.out.print("숫자를 입력하세요 : ");
			answer = sc.nextInt();
			count++;
			
			if(answer > re) {
				System.out.println("더 작은 숫자를 입력해주세요 !");
			}else {
				System.out.println("더 큰 숫자를 입력해주세요 ! ");
			}
			
			//System.out.println("몇 번째입니까?" + count);
			
		} while (re != answer);
		
		System.out.println();
		System.out.println();
		System.out.println("★★★★★★축하합니다.★★★★★★★★★★★");
		System.out.println(count+"번째에 정답을 맞추셨습니다. ");
		
		
		
		
		

	}

}
