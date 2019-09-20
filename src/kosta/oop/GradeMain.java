package kosta.oop;

public class GradeMain {

	public static void main(String[] args) {

		/*	Grade gd = new Grade("홍길동", 60, 40, 80);
		
			gd.printPerson();
			
			
			
			*/
		
		
		Grade[] arr = {new Grade("홍길동", 90,80,70), new Grade("박길동", 20,30,40), new Grade("조길동", 50,60,70)};

		//arr[0].printPerson();
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].printPerson();
		}
		
		
	}

}
