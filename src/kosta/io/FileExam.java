package kosta.io;

import java.io.File;
import java.util.GregorianCalendar;

public class FileExam {

	public static void main(String[] args) {
		// 디렉토리와 파일내역 출력만 하기
		
		
		File file = new File("C:\\Users\\kosta\\Desktop\\juang\\교재PPT");
		File arr[]  = file.listFiles();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			String name = arr[i].getName();
			
			if(arr[i].isFile()) {
				System.out.printf("%-25s %7d " , name , arr[i].length());
				System.out.println();
				
			}else {
				System.out.printf("%-25s    <DIR> " , name);
				System.out.println();
				
			}
			
			/*long time = arr[i].lastModified();
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(time);
			System.out.printf("%1$tF %1$tT %n" , calendar);
			System.out.println();*/
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
