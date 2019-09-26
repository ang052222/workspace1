package kosta.oop2;

public class ServiceMain {

	public static void main(String[] args) {
		
	
		Dao oracle = new OracleDao();
		Dao sql = new MySQLDao();
		
		Service sv = new Service(oracle);
		
		sv.setDao(sql);
		
		sv.insertService();
	
		
	}
	
}
