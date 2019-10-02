package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExam {

	Member m;
	
	
	// 직렬화
	public void write() {
		
		m = new Member("홍길동", 20);
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
			
	}
	
	
	
	// 역직렬화
	public void read() {
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member)(ois.readObject());   // Object 상태이기 때문에 Member로 형변환을 해주어야 한다. 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {

		SerialExam se = new SerialExam();
		
		se.write();		// 위에 따로 뺀 메소드임
		se.m = null;	// 죽여버려야한다. 어떤 Member객체인지 모르기때문에
		se.read();
		
		System.out.println(se.m); 
		
		
		

	}

}
