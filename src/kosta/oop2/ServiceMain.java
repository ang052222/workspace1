package kosta.oop2;

public class ServiceMain {

	public static void main(String[] args) {
		
	
		/*Dao oracle = new OracleDao();
		Dao sql = new MySQLDao();
		
		Service sv = new Service(oracle);
		
		sv.setDao(sql);
		
		sv.insertService();*/
		
		
		Dao dao = new Dao() {
			
			@Override
			public void insert() {

				System.out.println("MSSQLDao insert() 호출!!!!!!!!!");
			}
		};
	
		
		Service sv = new Service(dao);
		sv.insertService();
		
	}
	
}
