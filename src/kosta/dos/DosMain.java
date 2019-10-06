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
		
		String crr = "";
		
		do {
			
		
		System.out.print("수행하고 싶은 명령어를 작성하세요 ▶");
		String word = sc.nextLine();
		
		
		if(word.equals("ls")){
			dh.fileList(file);
		
		}else if(word.contains("tta")){
			
			if(word.contains("...")){	// 부모 디렉토리 이동
				dh.parentsFileMove(fileSource, file);
				
			}else if(word.contains(" ")){	// tta 안의 해당 디렉토리 이동
				String[] ttsRoute = word.split(" ");
				String crr1 = ttsRoute[1];
				dh.fileMove(file, crr1);
				
			}else if(word.contains("/")){ // tta 안의 특정 디렉토리 안의 파일들을 mkdir한 디렉토리에 파일을 붙여넣는다.
				
				String[] copyFileRoute = word.split("/");
				String cfr1 = copyFileRoute[0];
				String cfr2 = copyFileRoute[1];
				String cfr3 = copyFileRoute[2];
				
				String mkdirFile = fileSource + "\\" + crr;
				String copyFile = fileSource + "\\" + cfr2 + "\\" + cfr3;
				
				try{
				dh.psDirectoryCopy(new File(mkdirFile), new File(copyFile));
				
				}catch(Exception e){
					e.printStackTrace();
				}
				
				
				
				
			}
	
			
		}else if(word.contains("mkdir")){	// tta 안에 새로운 디렉토리를 만든다. 
			
			String[] newName = word.split(" ");
			crr = newName[1];
			
			dh.newDirectory(crr, file);
			
			
		}
		
		
		
		
		} while (true);
		
		
		
		
		
		
		
		

	}

}
