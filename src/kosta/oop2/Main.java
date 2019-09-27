package kosta.oop2;

public class Main {

	public static void main(String[] args) {
		
		
		Work  wk = new Work();
		Drive dr = new Drive();
		Study st = new Study();
		
		Person ps[] = {new Person("최주앙", dr), 
					   new Person("홍길동", wk), 
					   new Person("박길동", st)};
		
		Role role = new Role() {
			
			@Override
			void doIt() {
				// 익명 클래스
				System.out.println("놀고 싶어요!!!!!!!!!!!!!!!!!!!!!!!");
				
			}
		};
		
		
		Person p = new Person("홍길동", role);
		p.doo();
		
		
		for(int i = 0 ; i < ps.length ; i++) {
			ps[i].doo();
		}
		
		System.out.println(p);  // sysout에서는 .toString을 생략할 수 있다. 자동으로 이클립스가 미루어 짐작함

	}

}
