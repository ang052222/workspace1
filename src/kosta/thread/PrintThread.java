package kosta.thread;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	public PrintThread(SharedArea area) {
		this.sharedArea = area;
	}
	
	public void run() {
		for(int cnt = 0 ; cnt < 3 ; cnt++) {
			//synchronized (sharedArea) {
				
			/*int sum = sharedArea.account1.balance 
					+ sharedArea.account2.balance;*/
			
			int sum = sharedArea.getTotal();	// 잔액 합계 메소드
			System.out.println("계좌 잔액 합계 : " + sum);
			
			//}
			
			try {
				Thread.sleep(1);
				
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
