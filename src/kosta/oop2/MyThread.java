package kosta.oop2;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread t = new Thread(thread);
		t.start();
		
		for(int i=11;i<=20;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			System.out.println(i);
		}
		

	}

}
