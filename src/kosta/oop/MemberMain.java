package kosta.oop;

public class MemberMain {

	public static void main(String[] args) {

		Member mb = new Member("홍길동", 20, "광주광역시");
		Member mb2 = new Member("가나다", 30, "서울특별시");
		Member mb3 = new Member("라마바", 24, "부산광역시");
		
		
		
		mb.print();
		mb2.print();
		mb3.print();
		
	}

}
