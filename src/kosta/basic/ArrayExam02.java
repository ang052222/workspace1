package kosta.basic;

public class ArrayExam02 {

	public static void main(String[] args) {
		// 첫 번째 방법 : 2차원 배열

		int arr[][];
		arr = new int[3][2];	// 2차원 배열 생성
		
		
		
		// 2번째 방법 : 2차원 배열의 크기를 상이하게 생성해보자. 각차원의 배열을 다르게 할 수도 있다. 
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		
		
		// 3번째 방법 :  2차원 배열도 선언, 생성, 초기화 
		int arr3[][] = {{1,2},{3,4,5},{5,6,7,8}};
		
		for(int i = 0 ; i < arr3.length ; i++) {
			for(int j = 0 ; j < arr3[i].length ; j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.print(", ");
		}
		
		System.out.println();
		System.out.println();
		
		// 
		String oldArr[] = new String[3];
		oldArr[0] = "10";
		oldArr[1] = "20";		// NumberFormatException이 발생한다. 3개가 안 들어갔기때문이다. 
		//oldArr[2] = "30";
		
		String newArr[] = new String[2];
		
		System.arraycopy(oldArr, 0, newArr, 0, newArr.length);		// 복사
		
		
		for(int i = 0 ; i < newArr.length ; i++) {
			if(Integer.parseInt(newArr[i]) == 20) {
				System.out.println("20");
			}
		}
		
		
		
		
		
	}

}
