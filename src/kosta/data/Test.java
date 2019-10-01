package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		String n = "";
		
		
		do {
			System.out.println("************************");
			System.out.println("1. 추가");	// 문자열 추가
			System.out.println("2. 출력");	// 전체 출력 - Iterator
			System.out.println("3. 검색");	// index가 return 되게
			System.out.println("4. 종료");
			System.out.println("************************");
			System.out.print("번호를 선택해 주세요 :");
			n = sc.next();
			
			switch (n) {
			case "1":	// 문자열 추가
					System.out.println("추가할 문자열을 입력하세요 : ");
					String text = sc.next();
					
					arr.add(text);
					
				break;
				
				
			case "2":	// 전체 출력 Iterator로
					Iterator<String> iterator = arr.iterator();
					
					while (iterator.hasNext()) {
						String str =  iterator.next();
						System.out.println(str);
						
					}
				
				break;
				
				
			case "3":	// index가 return 되게하여라
					
					System.out.print("검색하실 텍스트를 작성해주세요 : ");
					String search = sc.next();
				
					System.out.println("=========검색결과==========");
					if(arr.contains(search)) {
						
						System.out.println("해당하는 텍스트가 존재합니다.");
						int index = arr.indexOf(search);
						System.out.println(index + "번째에 들어있습니다. ");
						
						
					}else {
						System.out.println("해당하는 텍스트가 존재하지 않습니다.");
					}
				
				break;
				
				
			case "4":	System.out.println("종료하셨습니다. 안녕히가세요!");
				
				return;

			}
			
		} while ( !n.equals("4"));
		
		
		
		
		
		
		
		
		
		
	}

}
