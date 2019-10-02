package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyMission {

	public static void main(String[] args) {
		
		
		FileReader reader = null;
		FileWriter writer = null;
		
		char[] arr = new char[50];
	
		
		
		try {
			reader = new FileReader("poem2.txt");
			writer = new FileWriter("copy1.txt");
			
			int i = 0 ;
			
			while((i = reader.read(arr, 0, arr.length)) != -1) {
				
				writer.write(arr, 0, i);
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
