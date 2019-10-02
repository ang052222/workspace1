package kosta.io;

import java.io.FileReader;

public class FileReaderExam {

	public static void main(String[] args) {
		
		
		FileReader reader = null;
		char[] arr = new char[50];
		
		try {
			reader = new FileReader("poem.txt");	// 빨대 하나 꼽았다. 
			
			reader.read(arr);	// 아스키코드 (정수형 값)이 들어온다. 
			System.out.println(arr);
			
			/*while (true) {
				int data = reader.read();
				
				if(data == -1) {
					break;
				}
				
				char ch = (char)data;
				System.out.print(ch);
				
			}*/
			
				
			
		} catch (Exception e) {
			e.printStackTrace(); 	// 몇 번째 라인에 났는지 알려준다. 
			
		}finally {
			try {
				reader.close();
			} catch (Exception e2) {}
		}

	}

}
