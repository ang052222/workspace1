package kosta.mission;

import java.util.Scanner;

public class Mission09 {
	
	static int count = 0;
	
	public static void add(String[] fruits) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("추가할 과일의 이름을 적어주세요.");
		String asw = sc.nextLine();
		
		fruits[count] = asw;					// fruits[count++] = asw; 로 해도 된다. 
		count++;
		
		
		
	}
	
	public static void print(String[] fruits) {
		
		System.out.println();
		System.out.println();
		System.out.println("★★추가 된 과일의 이름들★★");
		System.out.println();
		
		/*	for(String n : fruits) {      
				System.out.println(n);
			}*/
		
		for(int i = 0 ; i < count ; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println();
		System.out.println();
		
	}
	
	// 배열에 있는 과일을 검색하는 메서드
	// 과일명 → 인덱스를 출력 / 존재하지 않습니다. 
	public static void search(String[] fruits) {
		Scanner sc = new Scanner(System.in);
		
		String fname;
		
		System.out.print("검색하고 싶은 과일을 입력하세요. ");
		fname = sc.nextLine();
		
		int index = -1;
		
		for(int i = 0 ; i< count ; i++) {
			if(fruits[i].equals(fname)) {
				/*System.out.println();
				System.out.println();
				System.out.println("★★★★★검색 결과입니다.★★★★★★★ ");
				System.out.println(i+ "번째에 저장되어있습니다.");
				System.out.println();
				break;*/
				
				index = i;
			
			}
		}
		
		if(index != -1) {
			System.out.println(index +"번째에 존재합니다. ");
		}else {
			System.out.println("검색 결과가 존재하지 않습니다.  ");
		}
		
		
		
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
				search(fruits);
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
