package kosta.phone;

import java.util.Scanner;

public class Manager {
	
	
	//Scanner sc = new Scanner(System.in);
	DataInput di = new DataInput();
	
	
	// 배열선언, 생성
	PhoneInfo arr[];
	static int count;
	
	
	
	public Manager() {
		
		arr = new PhoneInfo[10];
	}
	
	
	
	
	//전화번호 추가
	public void addPhoneInfo() {
		
		
		
		
		
		System.out.print("이름을 입력 하세요 : ");
		String name = DataInput.sc.nextLine();
		
		System.out.print("전화번호를 입력 하세요 : ");
		String phoneNo = DataInput.sc.nextLine();
		
		System.out.print("생일을 입력 하세요 : ");
		String birth = DataInput.sc.nextLine();
		
		System.out.println();
		System.out.println();
		
		
		
		arr[count++] = new PhoneInfo(name, phoneNo, birth);
		
		
		
		/*for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = new PhoneInfo(name, phoneNo, birth);
		}*/
		
		
		
		
	}
	
	
	// 전체목록 출력
	public void listPhoneInfo() {
		
		
		System.out.println("********************************");
		System.out.println("전화번호부 출력");
		System.out.println("이름 \t 전화번호 \t 생일");
		
		
		
		// 배열안에 있는 phoneinfo객체의 show() 메소드를 출력
		
		for(int i = 0 ; i < count ; i++) {
			arr[i].show();
		}
		
	}
	
	
	
	public void searchPhoneInfo() {
		
		
		/*System.out.print("검색 하실 내용을 적어주세요 : ");
		String text = sc.nextLine();
		
		System.out.println();
		System.out.println("********************************");
		System.out.println("이름 \t 전화번호 \t 생일");
		
		for(int i = 0 ; i < count ; i++) {
		
		 if(text.equals(arr[i].name) || text.equals(arr[i].phoneNo) || text.equals(arr[i].birth) ) {
			 arr[i].show();
			 break;
		 }else {
			 System.out.println(" 해당 ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ");
		 }
				
		}
		System.out.println("********************************");
		
		
		*/
		
		System.out.print("검색 하실 내용을 적어주세요 : ");
		String text = DataInput.sc.nextLine();
		
		int idx = -1;
		
		
		System.out.println();
		System.out.println("********************************");
		System.out.println("이름 \t 전화번호 \t 생일");
		
		for(int i = 0 ; i < count ; i++) {
			
			 if(text.equals(arr[i].getName()) ) {
				 arr[i].show();
				 
				 idx = i;
			 }
					
			}
		
		
		if(idx == -1) {
			
			System.out.println("해당하는 이름이 없습니다. ");
		}
		
		
		
		
		
	}
	

}
