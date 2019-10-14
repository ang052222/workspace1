package hotel;

public class Customer {

	private int reservNo;		// 예약번호
	private int roomNo;			// 룸  번호
	private Bill bil;			// 계산서
	private Receipt receipt;	// 영수증
	
	public Customer() {}

	public Customer(int reservNo, int roomNo) {
		super();
		this.reservNo = reservNo;
		this.roomNo = roomNo;
	}

	public int getReservNo() {
		return reservNo;
	}

	public void setReservNo(int reservNo) {
		this.reservNo = reservNo;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public Bill getBil() {
		return bil;
	}

	public void setBil(Bill bil) {
		this.bil = bil;
	}

	public Receipt getReceipt() {
		return receipt;
	}

	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}

	@Override
	public String toString() {
		return "Customer [reservNo=" + reservNo + ", roomNo=" + roomNo + ", bil=" + bil + ", receipt=" + receipt + "]";
	}
	
	
	public CustInfo getInfo() {
		
		return null ;
	}
	
	
	
	
	
	
	
	
	
	
	
}
