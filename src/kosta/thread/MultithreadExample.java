package kosta.thread;

public class MultithreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new DigitThread();	// 스레드를 생성
		Thread thread1 = new Thread(new SmallLetters());
		thread.start();						// 스레드를 시작
		thread1.start();
		
		for(char ch = 'A' ; ch <= 'Z' ; ch++) {
			System.out.print(ch);
			try {	// for문 안에 넣어줘야한다.
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
		
		
		

	}

}
