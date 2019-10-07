package kosta.thread;

public class SumMain {

	public static void main(String[] args) throws InterruptedException {
		SumThread thread1 = new SumThread(1, 500);
		SumThread thread2 = new SumThread(501, 1000);
		
		
		thread1.start();
		thread2.start();
		
		
		
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("1~1000까지의 합 : " + (thread1.getSum() + thread2.getSum()));

	}

}
