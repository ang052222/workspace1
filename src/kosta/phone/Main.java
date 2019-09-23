package kosta.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1. 추가 2. 전체출력 3. 종료
		
		Scanner sc = new Scanner(System.in);
		Manager mg = new Manager();
		
		
		
		while(true) {
			System.out.println();
			System.out.println("1. 추가");
			System.out.println("2. 전체출력");
			System.out.println("3. 종료");
			System.out.println();
			System.out.print("메뉴입력 : ");
			String menu = sc.nextLine();
			
			
			switch (menu) {
			case "1": mg.addPhoneInfo();
				
				break;
			case "2": mg.listPhoneInfo();
				
				break;
			case "3":
				System.out.println("프로그램 종료");
				return;

			}
		}
	}

}
