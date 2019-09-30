package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		
		// GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc); // 각 개체가 나타내는 내용들이 나온다. 
		
		String now = gc.get(Calendar.YEAR) + "년 " // 객체가 가지고 있는 연도를 뽑아내준다. get : int
				   + (gc.get(Calendar.MONTH) + 1) + "월 " // 0월부터 나오기 때문에 +1을 해주어야 한다. 
				   + gc.get(Calendar.DATE) + "일 "
				   + gc.get(Calendar.HOUR) + "시 "
				   + gc.get(Calendar.MINUTE) + "분 ";
		
		System.out.println("현재시간 : " + now);
		
		
		
		
		
		// Calendar
		Calendar cd = Calendar.getInstance(); // 다른 메소드를 통해 우회해서 사용한다. 싱글톤 방식이라고 한다.  이런식으로 Calendar 객체를 구해오게 된다.  원래 Calendar는 추상클래스이기때문에 객체로 사용할 수 없음.
		cd.add(Calendar.DATE, 100);
		
		String future = cd.get(Calendar.YEAR) + "년 " 
				   + (cd.get(Calendar.MONTH) + 1) + "월 "  
				   + cd.get(Calendar.DATE) + "일 "
				   + cd.get(Calendar.HOUR) + "시 "
				   + cd.get(Calendar.MINUTE) + "분 ";
		
		System.out.println("100일 후 : " + future);
		
		
		
		
		
		
		// 2019.07.31일부터 100일이 되는 날을 구하기
		cd.set(2019, 6, 31);
		cd.add(Calendar.DATE, 100);
		
		// SimpleDateFormat
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh:mm");
		
		String str = df.format(cd.getTime());  // Calendar를 Date 객체로 변환시켜주어야 한다. 
		 System.out.println(str);  // 7월 31일에 만나면 이 날이 100일이 되는 날이 된다. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
