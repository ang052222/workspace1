package kosta.video;

public class SpecialMember extends GeneralMember {

	private int bpoint;		// 특별회원 보너스 포인트
	
	
	public SpecialMember() {}


	public SpecialMember(String id, String name, String address, Video rentalVideo, int bpoint) {
		super(id, name, address, rentalVideo);
		this.bpoint = bpoint;
	}
	
	
	
	public int getBpoint() {
		return bpoint;
	}


	public void setBpoint(int bpoint) {
		this.bpoint = bpoint;
	}

	@Override
	// 회원 정보 출력 메소드
	public void memberPrint() { // 오버라이딩
		
		System.out.println();
		super.memberPrint();
		System.out.println("회원의 보너스 포인트 적립 : " + bpoint);
		
		
	}
}
