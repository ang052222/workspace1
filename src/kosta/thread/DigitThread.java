package kosta.thread;

public class DigitThread extends Thread {
	
	public void run() {
		
		for(int cnt = 0 ; cnt < 10; cnt++) {
			System.out.print(cnt);
			try {	// for문 안에 넣어줘야한다.
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
		
		
	}

}
