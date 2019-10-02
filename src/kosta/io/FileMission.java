package kosta.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		
		// 재귀함수로 해보자
		
		String path = "C:\\Users\\kosta\\Desktop\\juang\\강사님파일";
		//String path = "C:\\\\Users\\\\kosta\\\\Desktop\\\\juang\\\\교재PPT";
		File file = new File(path);
		
		if(file.exists() && file.isDirectory()) {
			fileList(file);
		}
		

	}

	public static void fileList(File file) {
		
		File arr[] = file.listFiles();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			String name = arr[i].getName();
			
			if(arr[i].isFile()) {
				System.out.printf("%-25s %7d " , name , arr[i].length());
				System.out.println();
			}else if(arr[i].isDirectory()) {
				//System.out.printf("%-25s    <DIR> " , name);
				System.out.println();
				System.out.println("***  " + arr[i].getName() + "  DIR***");
				
				fileList(arr[i]);
			
				
			}else {
				System.out.printf("%-25s    <다른거야야야야야> " , name);
				System.out.println();
				
			}
			
			
		}
		
		
	}

}
