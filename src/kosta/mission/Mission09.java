package kosta.mission;

import java.util.Scanner;

public class Mission09 {
	
	static int count = 0;
	
	public static void add(String[] fruits) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("추가할 과일의 이름을 적어주세요.");
		String asw = sc.nextLine();
		
		fruits[count] = asw;
		count++;
		
		
		
	}
	
	public static void print(String[] fruits) {
		
		System.out.println();
		System.out.println();
		System.out.println("★★추가 된 과일의 이름들★★");
		System.out.println();
		
		for(String n : fruits) {
			System.out.println(n);
		}
		System.out.println();
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		// 메뉴 선택 프로그램을 구현하자.
		// 키보드에서 메뉴를 입력하면 해당 메뉴의 출력만 이루어지게 한다.
		// ex) 1. 추가	2. 출력	3. 검색	4. 수정	5. 삭제	6.종료
		// 과일들을 메뉴의 내용대로 실행 해 보자. 
		
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		String[] fruits = new String[10];
		
		do {
			
			System.out.println("**********************************");
			System.out.println("메뉴를 입력하세요");
			System.out.println("1. 추가");
			System.out.println("2. 출력");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("6. 종료");
			System.out.println("**********************************");
			System.out.println();
			System.out.print("선택해주세요 : ");
			answer = sc.nextInt();
			
			switch (answer) {
			case 1:
				add(fruits);
				break;

			case 2:
				print(fruits);
				break;

			case 3:
				
				break;

			case 4:
				
				break;

			case 5:
				
				break;

			case 6:
				System.out.println("종료되었습니다. 안녕히가세요!");
				break;
				
				// return을 해서 아예 빠져나가게 할 수도 있다. 
			
			}
			
			
		} while (answer != 6);
		
		
		
		
		
		
		
	}

}
