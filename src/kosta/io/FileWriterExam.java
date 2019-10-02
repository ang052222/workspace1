package kosta.io;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		// FileWriter
		// 키보드로부터 데이터를 입력받을것임
		
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = "";
		String poem = "";
		
		
		while (!(str = sc.nextLine()).equals("q")) {
			// q를 넣지 않으면 계속 반복하겠다. 
			poem += str;
			poem += "\n";
			
		}
		
		try {
			
			writer = new FileWriter("poem2.txt");
			writer.write(poem);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				writer.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
