package kosta.oop;

public class SkirtMain {

	public static void main(String[] args) {

		Skirt[] sk = {new Skirt("스티치 디테일 데님 미니 스커트", 27000),
					  new Skirt("언발 유니크 레이스 스커트", 65000),
					  new Skirt("샤이니 새틴 메탈 플리츠 롱 스커트", 13900),
					  new Skirt("로우 찰랑 새틴스커트", 37000)};
		
		for(int i = 0 ; i < sk.length ; i++) {
			sk[i].skritShip();
			sk[i].totalPrice();
			sk[i].skirkPrint();
			System.out.println();
		}
		
		
		
		
	}

}
