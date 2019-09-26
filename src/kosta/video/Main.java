package kosta.video;

public class Main {

	public static void main(String[] args) {
		
		//Video[] vd = {new Video(1, "트랜스포머3", "서봉수"), new Video(2, "쿵더펜더2", "지성민")  };
		
		Video v1 = new Video(1, "엑시트", "임윤아");
		Video v2 = new Video(2, "살인의 추억", "송강호");
		

		GeneralMember arr[] = {new GeneralMember("aa", "홍길동", "가산동", v1), new SpecialMember("bb", "박길동", "강남", v2, 100)};
		 
		System.out.println("메인메소드");
		
		System.out.println();
		
		for(int i = 0 ; i < arr.length ; i++) {  // 오버라이딩으로 가능하다. 
			arr[i].memberPrint();
		
			if(arr[i] instanceof SpecialMember) {
				SpecialMember sm = (SpecialMember)arr[i];
				sm.printBonus();
			}
			
		}
		
		//SpecialMember sp = ((SpecialMember) arr[1]);
		//sp.printBonus();
		
		/*	arr[0].memberPrint();
			arr[1].memberPrint();
			SpecialMember sp = (SpecialMember)arr[1];
			sp.memberPrint();
			
			*/
	}

}
