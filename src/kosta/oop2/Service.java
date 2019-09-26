package kosta.oop2;

public class Service  {
	
	private Dao dao;
	
	// 디폴트 생성자
	public Service() {}
	
	// 생성자
	public Service(Dao dao) {
		super();
		this.dao = dao;
	}




	public Dao getDao() {
		return dao;
	}


	public void setDao(Dao dao) {
		this.dao = dao;
	}


	// Dao의 insert() 호출 메서드
	public void insertService() {
		dao.insert();
	}


	
	

	

}
