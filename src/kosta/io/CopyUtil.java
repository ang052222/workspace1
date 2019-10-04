package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;


public class CopyUtil {
	
	// 처음 디렉토리 안의 모든 파일을 복사
	// 새로운 디렉토리 생성하고, 그 안에 파일이 복사 되어져야 한다. 
	public static void copyDirectory(File f, File dest) throws Exception {
		
		
		dest.mkdir();	// copy 폴더 생성
		
		// 디렉토리 안에 파일들은 copyFile()로 복붙해넣고
		// 파일 외에 디렉토리가 있다면 그 디렉토리 파일을 생성하고
		// 재귀함수를 써서 그 디렉토리 파일안에 파일들은 복사하고 디렉토리는 파일 생성 --반복
		
		
		File arr[] = f.listFiles();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			String name = arr[i].getName();
			
			
			if(arr[i].isDirectory()) {	// Directory일 경우
				// 파일이름 똑같게 복사해주어야 한다. 
				File df = new File(dest, arr[i].getName());
				df.mkdir();
				
				copyDirectory(arr[i], df);	// 디렉토리 안의 디렉토리까지 복사 가능해짐. 재귀함수 때문에
				
				
			}else if(arr[i].isFile()) {	// 일반 파일일 경우
				// copyFile()로 복사해와야한다.
				File df = new File(dest, arr[i].getName());
				copyFile(arr[i], df);
				
				
			}else {
				System.out.println("★★★★★★★★★★★else야★★★★★★★★★★★★★★");
			}
			
		}
		
	}
	
	
	
	
	
	// ByteStream
	// 바이트 값을 가진 source(파일) → dest(파일) 복사
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
