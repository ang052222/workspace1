package kosta.io;

import java.io.File;

public class CopyUtil {
	
	// 처음 디렉토리 안의 모든 파일을 복사
	// 새로운 디렉토리 생성하고, 그 안에 파일이 복사 되어져야 한다. 
	public static void copyDirectory(File f, File dest) throws Exception {
		
		
		dest.mkdir();	// copy 폴더 생성
		
		// 디렉토리 안에 파일들은 copyFile()로 복붙해넣고
		// 파일 외에 디렉토리가 있다면 그 디렉토리 파일을 생성하고
		// 재귀함수를 써서 그 디렉토리 파일안에 파일들은 복사하고 디렉토리는 파일 생성 --반복
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	// ByteStream
	// 바이트 값을 가진 source(파일) → dest(파일) 복사
	public static void copyFile(File source, File dest) throws Exception{
		
		
	}
	

}
