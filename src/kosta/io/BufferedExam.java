package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class BufferedExam {	// 더이상 입력할 내용이 없다면 Ctrl + Z 로 끝낸다.

	public static void main(String[] args) {
		// 기존 Scanner객체를 이용하지 않고 비코드 입력 구현
		// System.in → InputStream  키보드와 연결하게 된다. 
		// 바이트 스트림이기때문에 문자 인풋스트림으로 바꿔줘야한다. InputStreamReader
		// System.in → InputStream → InputStreamReader → BufferedReader
		
		//InputStream in = System.in;
		//InputStreamReader isr = new InputStreamReader(in);
		//BufferedReader br = new BufferedReader(isr);
		//br.readLine();
		//이 위의 주석들을 한 줄로 표현한 것이 br = ~~~~~;
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		String str = "";
		
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.print("입력 : ");
			
			while ((str = br.readLine()) != null) {

				str += "\n";
				bw.write(str);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
			}
			
		}

	}

}
