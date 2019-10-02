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
			System.out.println("4. 정렬");
			System.out.println("5. 저장"); // refresh해야한다.
			System.out.println("6. 로딩");
			System.out.println("7. 종료");
			System.out.println();
			System.out.print("메뉴입력 : ");
			String menu = di.sc.next();
			
			
			switch (menu) {
			case "1": 
						mg.selectAddPhoneInfo();
				
				break;
				
			case "2": 
						mg.listSelect();
				
				break;
				
			case "3": 
						mg.searchPhoneInfo();
				break;
				
			case "4":
						mg.selectSort();
				break;
				
			case "5":
						mg.saveFile();
				break;
				
			case "6":
						mg.arr = null;
						mg.openFile();
						
						for(PhoneInfo i : mg.arr) {
							i.show();
						}
				break;
				
			case "7":
						System.out.println("프로그램 종료");
				return;

			}
		}
	}

}
