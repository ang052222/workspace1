package kosta.dos;

import java.io.File;

public class DosHomeWork {
	
	
	
	
	
	
	// 1. 파일목록 출력
	public void fileList(File file) {
		
		File[] frr = file.listFiles();
		
		for(int i = 0 ; i < frr.length ;i++){
			
			String name = frr[i].getName();
			
			if(frr[i].isDirectory()){
				System.out.println();
				System.out.printf("*** " + frr[i].getName() + "  DIR ***" );
				
				fileList(frr[i]);
				
			}else if(frr[i].isFile()){
				System.out.println();
				System.out.printf(" %-25s" , name);
				System.out.println();
				
			}
			
			
		}
		
		
	}
	
	// 2. 디렉토리 이동
	public void fileMove(File file, String directoryName) {
		
		String fileMName =  DosMain.fileSource + "\\" + directoryName;
		
		File f = new File(fileMName);
		
		File[] frr = f.listFiles();
		
		for(int i = 0 ; i < frr.length ;i++){
			
			String name = frr[i].getName();
			
			if(frr[i].isDirectory()){
				System.out.println();
				System.out.printf("*** " + frr[i].getName() + "  DIR ***" );
				
				fileList(frr[i]);
				
			}else if(frr[i].isFile()){
				System.out.println();
				System.out.printf(" %-25s" , name);
				System.out.println();
				
			}
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	// 3. 부모 디렉토리로 이동
	public void parentsFileMove() {
		
		
	}
	
	// 4. 새로운 디렉토리 생성
	public void newDirectory() {
		
		
	}
	
	// 5. 현재 디렉토리에 있는 모든 파일 복사
	public void psDirectoryCopy() {
		
		
	}
	

}
