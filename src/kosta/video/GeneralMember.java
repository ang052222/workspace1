package kosta.video;

public class GeneralMember {

	private String id;				// 회원 아이디
	private String name;			// 회원 이름
	private String address;			// 회원 주소
	private Video rentalVideo;		// 내가 빌린 비디오 객체
	
	public GeneralMember() {}


	public GeneralMember(String id, String name, String address, Video rentalVideo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.rentalVideo = rentalVideo;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Video getRentalVideo() {
		return rentalVideo;
	}


	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}


	public void generalMemberPrint() {
		
		System.out.println();
		System.out.println("★★★모든 회원정보 출력 메소드★★★");
		System.out.println("회원의 아이디 : " + id);
		System.out.println("회원의 이름 : " + name);
		System.out.println("회원의 주소 : " + address);
		System.out.println("회원이 대여한 비디오 번호 : " + rentalVideo.getVideoNo() );
		System.out.println("회원이 대여한 비디오 제목 :" + rentalVideo.getVideoName());
		System.out.println("회원이 대여한 비디오 주인공 : " + rentalVideo.getVideoActor());
		
		System.out.println("★★★모든 회원정보 출력 메소드★★★여기까지");
		
		
	}
	
	
}
