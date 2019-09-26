package kosta.oop2;

public class Main {

	public static void main(String[] args) {
		
		
		Work  wk = new Work();
		Drive dr = new Drive();
		Study st = new Study();
		
		Person ps[] = {new Person("최주앙", dr), 
					   new Person("홍길동", wk), 
					   new Person("박길동", st)};
		
		
		
		for(int i = 0 ; i < ps.length ; i++) {
			ps[i].doo();
		}
		
		

	}

}
