package kosta.mission;

import java.util.Calendar;

public class CalendarMission {

	public static void main(String[] args) {
		// 2019년 10월의 캘린더 만들기
		
		Calendar cd = Calendar.getInstance();
		cd.set(2019, 9, 1); // 2019년 10월 1일로 이동
		int n = cd.getActualMaximum(Calendar.DATE);		// 30일인지 31일인지 알 수 있게 하는 메소드
		//System.out.println(n);
		
		// << 2019년 10월 >>
		// 일 월 화 수 목 금 토 
		//      1  2  3 4  5
		// 6  7  8 9 10 11 12
		
		
		/*char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		
		System.out.println("\t<<   2019년 10월   >>\t");
		System.out.println("일 \t 월 \t 화 \t 수 \t 목 \t 금 \t 토");
		cd.set(2019, 9, 1);
		char c = week[cd.get(Calendar.DAY_OF_WEEK) -1];*/
		//System.out.println(c);
		
		
		
		/*int[] dy = {0,0,0,0,0,0,0} ;
		int n = 1;
		int m = (cd.get(Calendar.DAY_OF_WEEK) -1);
		
		for(int i = 0 ; i <7 ; i++) {
			
			//System.out.print(dy[i]);
			
			dy[m] = n;
			System.out.print(dy[i]);
			System.out.print(" \t ");
			m++; n++;
			
			if(m == 7) {break;}
			
		}*/
		
		
		/*int[] dy = {0,0,0,0,0,0,0} ;
		int n = 1;
		int m = (cd.get(Calendar.DAY_OF_WEEK) -1);
		//System.out.println("m은 : " + m);  2
		
		for(int i = m ; i < 7 ; i++) {
			
			//System.out.print(dy[i]);
			
			
			dy[m] = n;
			System.out.print(dy[i]);
			System.out.print(" \t ");
			
			System.out.print(i +"가 "+"m은 : " + m + "***");
			System.out.print("n은 : " + n);
			System.out.println();
			m++; n++;
			
			
		}*/
		
		
		
		int week = cd.get(Calendar.DAY_OF_WEEK);
		System.out.println(week + "는 " + week);
		System.out.println("\t<<   2019년 10월   >>\t");
		System.out.println("일 \t 월 \t 화 \t 수 \t 목 \t 금 \t 토");
		
		for(int i = 1; i < week ; i++) {
			System.out.print(" \t ");
		}
		
		for(int i = 1; i <= n ; i++) {
			System.out.print(i + " \t ");
			if((week + i -1) % 7 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
