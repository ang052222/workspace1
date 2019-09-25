package kosta.phone;

public class Main {

	public static void main(String[] args) {

		// 1. 추가 2. 전체출력 3. 종료
		
		Manager mg = new Manager();
		DataInput di = new DataInput();
		
		
		
		while(true) {
			System.out.println();
			System.out.println("1. 추가");
			System.out.println("2. 전체출력");
			System.out.println("3. 검색");
			System.out.println("4. 종료");
			System.out.println();
			System.out.print("메뉴입력 : ");
			String menu = di.sc.nextLine();
			
			
			switch (menu) {
			case "1": mg.addPhoneInfo();
				
				break;
				
			case "2": mg.listPhoneInfo();
				
				break;
				
			case "3": mg.searchPhoneInfo();
			
				break;
				
			case "4":
				System.out.println("프로그램 종료");
				return;

			}
		}
	}

}
