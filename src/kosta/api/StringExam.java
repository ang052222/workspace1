package kosta.api;

public class StringExam {

	public static void main(String[] args) {

		String str = "ABC";
		String str2 = new String("abc");
		
		
		System.out.println(str);
		System.out.println(str2);
		
		
		if(str == str2) {
			
			System.out.println("같다");
			
		}else {
			
			System.out.println("다르다");
		}
		
		
		
		// String 클래스 : 메서드를 이용해도 불변성 유지
		String str4 = str.concat(str2);
		System.out.println(str4);
		System.out.println();
		str.concat(str2);
		System.out.println(str);
		System.out.println();
		
		String sql = "select * from board";
		
		
		
		// StringBuffer, StringBuilder 가변성
		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		System.out.println(sb);
		System.out.println();
		
		
		// 해당 문자열의 위치 파악 → IndexOf("문자열"); → 0 ~ 찾는다. 없으면 return -1;
		
		System.out.println("sql.indexOf(board) = "+sql.indexOf("board"));
		System.out.println();
		
		
		// 문자열 길이 length()
		System.out.println("sql.length() = "+sql.length());
		System.out.println();
		
		
		// 문자열 부분 추출 substring(5), substring(5, 10)
		System.out.println("sql.substring(8) = " + sql.substring(8));
		System.out.println();
		System.out.println("sql.substring(0, 6) = " + sql.substring(0, 6));
		System.out.println();
		
		// sql변수 문자열에 "board" 내용만 추출하자
		System.out.println(sql.indexOf("board"));
		System.out.println(sql.indexOf("d"));
		System.out.println(sql.substring(14,19));
		System.out.println();
		
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board") + 5));
		System.out.println();
		
		String fileName = "kosta.jpg";
		String head = "";
		String pattern = "";
		
		head = fileName.substring(0, 5);
		System.out.println();
		
		
		System.out.println(fileName.indexOf("."));
		
		pattern = fileName.substring(fileName.indexOf(".") + 1 , fileName.length());
		System.out.println(head);
		System.out.println(pattern);
		
		
		
		
		
		// equals
		System.out.println();
		String id = "Kosta";
		String m_id = "kosta";
		
		if(id.equals(m_id)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(id.equalsIgnoreCase(m_id)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		
		
		// 문자열을 → 배열 변환
		System.out.println();
		String fruits = "수박,배,포도,사과";
		String arr[] = fruits.split(",");
		
		for(String i : arr) {
			System.out.println(i);
		}
		
		
		
		
		// startsWith(), endsWith() → 해당 문자열로 문자열이 시작 / 끝이 나는 지 판단.
		// kosta.jpg
		// gif, jpg → 이미지 파일
		System.out.println();
		
		//String image = "kosta.gi";
		
		System.out.println(fileName.endsWith("jpg"));
		
		if(fileName.endsWith("jpg") || fileName.endsWith("gif")) {
			System.out.println("이미지 파일입니다. ");
		}else {
			System.out.println("이미지 파일이 아닙니다. ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
