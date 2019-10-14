package hotel;

public class Room {

	private String roomType;	// 룸   유형
	private int roomNo;			// 룸   번호
	private int reservNo;		// 예약 번호
	
	
	public Room() {}


	public Room(String roomType, int roomNo) {
		super();
		this.roomType = roomType;
		this.roomNo = roomNo;
		
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public int getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}


	public int getReservNo() {
		return reservNo;
	}


	public void setReservNo(int reservNo) {
		this.reservNo = reservNo;
	}


	@Override
	public String toString() {
		return "Room [roomType=" + roomType + ", roomNo=" + roomNo + ", reservNo=" + reservNo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
