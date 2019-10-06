package kosta.dos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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
	public void fileMove(File file, String crr1) {
		
		String fileMName =  DosMain.fileSource + "\\" + crr1;
		
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
	public void parentsFileMove(String fileSource, File file) {
		
		String parent = file.getParent();
		
		File parentFile = new File(parent);
		File[] frr = parentFile.listFiles();
		
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
	
	// 4. 새로운 디렉토리 생성
	public void newDirectory(String crr, File file) {
		String newFileName =  DosMain.fileSource + "\\" + crr;
		File dest = new File(newFileName);
		dest.mkdir();
		
		fileList(file);
		
		
		
	}
	
	// 5. 현재 디렉토리에 있는 모든 파일 복사
	public void psDirectoryCopy(File mk, File cf) throws Exception {
		
		File arr[] = cf.listFiles();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			String name = arr[i].getName();
			
			
			if(arr[i].isDirectory()) {	// Directory일 경우
				// 파일이름 똑같게 복사해주어야 한다. 
				File df = new File(mk, arr[i].getName());
				df.mkdir();
				
				psDirectoryCopy(arr[i], df);	// 디렉토리 안의 디렉토리까지 복사 가능해짐. 재귀함수 때문에
				
				
			}else if(arr[i].isFile()) {	// 일반 파일일 경우
				// copyFile()로 복사해와야한다.
				File df = new File(mk, arr[i].getName());
				copyFile(arr[i], df);
				
				
			}
			
		}
	
		
		
		
	}
	
	
	public static void copyFile(File source, File dest) throws Exception{
		
		
		FileInputStream  fis = null;
		FileOutputStream fos = null;
		
		byte[] brr = new byte[16];
		
		
		try {
			
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			
			
			int i = 0;
			
			while ((i = fis.read(brr, 0, brr.length)) != -1) {
				
				fos.write(brr, 0, i);
				
			}
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
			
		}finally {
			try {
				
				fis.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}


	

}
