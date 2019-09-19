package kosta.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		
		// 중첩 for문
		/*for(int i = 1 ; i < 4 ; i++) {
			for(int j = 1 ; j < 3 ; j++) {
				
				System.out.println("i = " + i + ", j = " + j);
				
			}
			System.out.println();
		}*/
		
		
		
		
		/*	for(int i = 2 ; i < 10 ; i++) {
				System.out.println("★★★★★ " + i + "단★★★★★★");
				for(int j = 1 ; j < 10 ; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println();
			}
			
			*/
		
		// 4x + 5y = 60
		
		/*for(int x = 0 ; x < 100 ; x++) {
			for(int y = 0; y < 100 ; y++) {
				
				if((4*x) + (5*y) == 60) {
					
					System.out.println("x는 = " + x + "  y는 = " + y + "입니다. ");
				}
				
			}
		}
		*/
		
		
		int n = 7;
		
		/*for(int i = 1 ; i < n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();System.out.println();
		System.out.println();System.out.println();
		
		for(int i = 1 ; i < n ; i++) {
			for(int j = n-1 ; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		/*System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		*/
		
		
		
		int m = 4;
		
		for(int i = 0 ; i < m ; i++) {
			
			for(int j = 1 ; j <= m-i  ; j++) {
				System.out.print("○");
			}
			for(int z = m ; z <= m+i ; z++) {
				System.out.print("●");
			}
			/*for(int y = m+1 ; y < (2*m)-i  ; y++) {
				System.out.print("★");
			}*/
			
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
