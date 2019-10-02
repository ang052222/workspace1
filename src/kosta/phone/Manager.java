package kosta.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Manager /*implements Serializable*/{

	// 배열선언, 생성
	//PhoneInfo arr[];
	//static int count;
	
	ArrayList<PhoneInfo> arr = new ArrayList<PhoneInfo>();
	
	
	public Manager() {
		//arr = new PhoneInfo[10];
	}
	
	
	
	// 전화번호 추가 선택지
	public void selectAddPhoneInfo() {
		
		System.out.println("************************");
		System.out.println("분류하실 그룹을 선택하세요.");
		System.out.println("1. 일반");
		System.out.println("2. 동창");
		System.out.println("3. 회사 ");
		System.out.println("************************");
		System.out.print("선택 : ");
		String i = DataInput.sc.next();
		
		
		switch (i) {
		case "1": addPhoneInfo();
			
			break;
		case "2":
				addUniversity();
			break;
		case "3":
				addCompany();
			break;

		
		}
		
		
	}
	
	//전화번호 추가
	public void addPhoneInfo() {
		
		
		System.out.print("이름을 입력 하세요 : ");
		String name = DataInput.sc.next();
		
		System.out.print("전화번호를 입력 하세요 : ");
		String phoneNo = DataInput.sc.next();
		
		System.out.print("생일을 입력 하세요 : ");
		String birth = DataInput.sc.next();
		
		
		System.out.println();
		System.out.println();
		
		
		//arr[count++] = new PhoneInfo(name, phoneNo, birth);
		arr.add(new PhoneInfo(name, phoneNo, birth));
		
	}
	
	// 동창 추가
	public void addUniversity() {
		
		
		System.out.print("이름을 입력 하세요 : ");
		String name = DataInput.sc.next();
		
		System.out.print("전화번호를 입력 하세요 : ");
		String phoneNo = DataInput.sc.next();
		
		System.out.print("생일을 입력 하세요 : ");
		String birth = DataInput.sc.next();
		
		System.out.print("전공을 입력 하세요 : ");
		String major = DataInput.sc.next();
		
		System.out.print("학번을 입력하세요 :");
		int year = DataInput.sc.nextInt();
		
		
		
		System.out.println();
		System.out.println();
		
		
		//arr[count++] = new University(name, phoneNo, birth, major, year);
		arr.add(new University(name, phoneNo, birth, major, year));
		
		
	}
	
	// 회사동료 추가
	public void addCompany() {
			
		System.out.print("이름을 입력 하세요 : ");
		String name = DataInput.sc.next();
			
		System.out.print("전화번호를 입력 하세요 : ");
		String phoneNo = DataInput.sc.next();
			
		System.out.print("생일을 입력 하세요 : ");
		String birth = DataInput.sc.next();
			
		System.out.print("부서를 입력 하세요 : ");
		String dept = DataInput.sc.next();
			
		System.out.print("직위를 입력 하세요 : ");
		String position = DataInput.sc.next();
			
			
		System.out.println();
		System.out.println();
			
			
		//arr[count++] = new Company(name, phoneNo, birth, dept, position);
		arr.add(new Company(name, phoneNo, birth, dept, position));
			
			
			
		}
	
		
		
		
		
		
	// 전체목록 선택지
	public void listSelect() {
		
		System.out.println("************************");
		System.out.println("전체보기 할 그룹을 선택하세요.");
		System.out.println("1. 일반");
		System.out.println("2. 동창");
		System.out.println("3. 회사 ");
		System.out.println("************************");
		System.out.print("선택 : ");
		String i = DataInput.sc.next();
		
		switch (i) {
		case "1": listPhoneInfo();
			
			break;
		case "2":
				listUniversity();
			break;
		case "3":
				listCompany();
			break;
	
		}
		
	}
	
	// 전체목록 출력
	public void listPhoneInfo() {
		
		System.out.println("********************************");
		System.out.println("전화번호부 출력");
		System.out.println("********************************");
		
		
		
		// 배열안에 있는 phoneinfo객체의 show() 메소드를 출력
		
		/*for(int i = 0 ; i < arr.size() ; i++) {
			//arr[i].show();
			arr.get(i);
			System.out.println("********************************");
		}*/
		
		
		for(int i = 0 ; i < arr.size() ; i++) {
			
			arr.get(i).show();
			System.out.println("********************************");
		
		}
		
		
	}
	
	// 대학동기 목록 출력
	public void listUniversity() {
		
		System.out.println("********************************");
		System.out.println("전화번호부 출력");
		
		/*for(int i = 0 ; i < count ; i++) {
			
			if(arr[i] instanceof University) {
			
				arr[i].show();
				System.out.println("********************************");
			}
			
		}*/
		
		
		for(int i = 0 ; i < arr.size() ; i++) {
			
			if(arr.get(i) instanceof University) {
		
				arr.get(i).show();
				System.out.println("********************************");
			
			}
		}
		
		
		
		
		
		
	}
	
	// 회사동기 목록 출력
	public void listCompany() {
		
		System.out.println("********************************");
		System.out.println("전화번호부 출력");
		
		
		/*for(int i = 0 ; i < count ; i++) {
			if(arr[i] instanceof Company) {
				
				arr[i].show();
				System.out.println("********************************");
			}
		}*/
		
		
		for(int i = 0 ; i < arr.size() ; i++) {
			
			if(arr.get(i) instanceof Company) {
		
				arr.get(i).show();
				System.out.println("********************************");
			
			}
		}
		
	}

	
	
	// 전체 검색
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
		System.out.println("검색결과");
		System.out.println("********************************");
		
		/*for(int i = 0 ; i < count ; i++) {
			
			 if(text.equals(arr[i].getName()) ) {
				 arr[i].show();
				 
				 idx = i;
			 }
					
			}*/
		
		
		for(int i = 0 ; i < arr.size() ; i++) {
			
			 if(text.equals(arr.get(i).getName()) ) {
				 arr.get(i).show();
				 
				 idx = i;
			 }
					
			}
		
		
		if(idx == -1) {
			
			System.out.println("해당하는 이름이 없습니다. ");
		}
		
		
		
		
		
	}


	// 정렬 선택지
	public void selectSort() {
		
		System.out.println("************************");
		System.out.println("정렬을 선택하세요.");
		System.out.println("1. 내림차순");
		System.out.println("2. 오름차순");
		System.out.println("************************");
		System.out.print("선택 : ");
		String i = DataInput.sc.next();
		
		switch (i) {
		case "1":	sortDes();
			
			break;
		case "2":
					sortAsc();
			break;
		
		}
		
	}




	// 이름으로 오름차순
	public void sortAsc() {
		
		
		for(int i = 0 ; i < arr.size() ; i++) {
			
			arr.get(i).show();
			System.out.println("********************************");
		
		}
		
		System.out.println("********************************");
		System.out.println("오름차순 출력");
		System.out.println("********************************");
		
		
		Collections.sort(arr);
		
		for(int i = 0 ; i < arr.size() ; i++) {
			
			arr.get(i).show();
			System.out.println("********************************");
		
		}
		
		
	}




	// 이름으로 내림차순
	public void sortDes() {
		
		
		for(int i = 0 ; i < arr.size() ; i++) {
			
			arr.get(i).show();
			System.out.println("********************************");
		
		}
		
		System.out.println("********************************");
		System.out.println("내림차순 출력");
		System.out.println("********************************");
		
		//Collections.sort(arr, new PhoneDesc());
		Collections.sort(arr, new PhoneInfo() );
		
		
		for(int i = 0 ; i < arr.size() ; i++) {
			
			arr.get(i).show();
			System.out.println("********************************");
		
		}
		
		
	}




	// 파일 저장
	public void saveFile() {
		
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("PhoneInfoFile.ser"));
			oos.writeObject(arr);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

	// 파일 열기
	public void openFile() {
		
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("PhoneInfoFile.ser"));
			arr = (ArrayList<PhoneInfo>) ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}







	
	

}
