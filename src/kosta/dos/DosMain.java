package kosta.dos;

import java.io.File;
import java.util.Scanner;

public class DosMain {
	// 미니 도스 프로그램 만들기
	
	static String fileSource = "C:\\Users\\user\\Desktop\\test\\정처기 실기\\tta";
	
	
	// 미니 도스 Main
	public static void main(String[] args) {
		
		
		
		File file = new File(fileSource);
		
		Scanner sc = new Scanner(System.in);
		DosHomeWork dh = new DosHomeWork();
		
		do{
		System.out.println();
		System.out.println("*********미니도스 프로그램***********");
		System.out.println("1. 파일목록 출력");
		System.out.println("2. 디렉토리 이동");
		System.out.println("3. 부모 디렉토리로 이동");
		System.out.println("4. 새로운 디렉토리 생성");
		System.out.println("5. 현재 디렉토리에 있는 모든 파일 복사");
		System.out.println("6. 종료");
		System.out.print("수행하고 싶은 메뉴를 선택하세요 ▶");
		String menu = sc.next();
		
		switch (menu) {
		case "1":	dh.fileList(file);
			
			break;
		case "2":	System.out.print("이동할 디렉토리를 적으세요 :");
					String directoryName = sc.next();
					dh.fileMove(file, directoryName);
			
			break;
		case "3":	dh.parentsFileMove();
			
			break;
		case "4":	dh.newDirectory();
			
			break;
		case "5":	dh.psDirectoryCopy();
			
			break;
		case "6":	System.out.println("***미니도스 프로그램 종료***");
					System.out.println("         안녕히가세요!");
			
			return;


		}
		
		}while(true);
		

	}

}
