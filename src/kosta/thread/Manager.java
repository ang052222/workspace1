package kosta.thread;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	List<String> list = new ArrayList<String>();
	
	
	
	// 진열장에 빵을 추가
	public synchronized void push(String threadName, String bread) {
		
		while (list.size() >= 5) {

			try {
				
				System.out.println(threadName + "가 대기상태 입니다. ");
				this.wait(); 	// 여기서 this는 Manager
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
		}
		
		list.add(bread);
		System.out.println(threadName + ": " + bread + " 만듦"); 
		this.notify(); 	// 혹시 자고 있는 놈이 있다면 깨워주고 가는 것
		
		
		
		
	}
	
	
	// 진열장에서 빵을 구매
	public synchronized void pop(String threadName) {
		// 항상 제일 마지막에 있는 빵을 사가도록 한다. 
		
		while (list.size() == 0) {

			try {
				System.out.println(threadName + " 대기상태 입니다.");
				this.wait();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		System.out.println("진열장의 빵 갯수 : " + list.size());
		String bread = list.remove(list.size() -1 );	// 제일 마지막 빵 제거
		
		System.out.println(threadName + " : " + bread + " 사감");
		this.notify(); // 빈자리가 생겼으니 다시 빵을 만들라
		
		
	}
}
