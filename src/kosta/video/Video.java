package kosta.video;

public class Video {

	private int videoNo;			// 비디오 번호
	private String videoName;		// 비디오 제목
	private String videoActor;		// 비디오 배우
	
	public Video() {}

	public Video(int videoNo, String videoName, String videoActor) {
		super();
		this.videoNo = videoNo;
		this.videoName = videoName;
		this.videoActor = videoActor;
	}
	
	
	
	
	
	public int getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoActor() {
		return videoActor;
	}

	public void setVideoActor(String videoActor) {
		this.videoActor = videoActor;
	}

	// 비디오 정보 출력 메소드
	public void videoPrint() {
		
		System.out.println();
		System.out.println("★★★비디오 정보 출력 메소드★★★");
		System.out.println("회원이 대여한 비디오 번호 :" + getVideoName());
		System.out.println("회원이 대여한 비디오 제목 : " + getVideoName());
		System.out.println("회원이 대여한 비디오 주인공 : " + getVideoActor());
	}
	
	
	
	
	
	
	
}
