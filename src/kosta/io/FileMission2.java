package kosta.io;

import java.io.File;

public class FileMission2 {

	public static void main(String[] args) {
		// 
		String source = "C:\\Users\\kosta\\Desktop\\memo\\teachersfile";
		String dest = "C:\\Users\\kosta\\Desktop\\memo\\copy";
		
		try {
			
			CopyUtil.copyDirectory(new File(source), new File(dest));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
