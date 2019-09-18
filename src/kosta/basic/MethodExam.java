package kosta.basic;

public class MethodExam {

	// 메서드 정의
	// 접근제어자 (static)  리턴형  메서드이름(파라미터들){ 
	//             메서드 내용
	// return 변수 ; → 이것은 있을 수도 있고 없을 수도 있다. 선택임  
	// }
	
	
	
	public static void main(String[] args) {

		//printCharacter('★', 30);
		
		int re = getAdd(100, 200);
		System.out.println("와우 ="+re);
		
		
		
	}
	
	
	
	public static void printCharacter(char ch, int num ) {
		
		for(int i = 1 ; i <= num ; i++) {
			
			System.out.print(ch);
			
		}
		
		System.out.println();
		
		
	}
	
	
	public static int getAdd(int a, int b) {
		
		int sum = a + b;
		
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
