package kosta.mission;

public class Mission06 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int arr2[] = {1,2,3,4,6};
		
		// swap → 1과 5의 위치를 변경해보자

		// swap(arr, 0, 4);
		
		/*	reverse(arr);
			
			for(int n : arr) {
				System.out.println(n + ", ");
			}
			
		*/
		
		
		if(equals(arr, arr2)) {
			
			System.out.println("같은 내용의 배열이다. ");
			
		}else {
			
			System.out.println("다른 내용의 배열이다.");
		}
		
		
		
	}
	
	
	// 배열의 내용을 비교 하는 메서드
	public static boolean equals(int[] a, int[] b) {
		
		
		if(a.length == b.length) {
		
		
		for(int i = 0 ; i < a.length ; i++) {
			
			if(a[i] == b[i]) {
				
			}else {
				return false;
				
			}
			
		}
		
		
		}else {
			System.out.println("자릿수가 맞지 않습니다. ");
			return false;
		}
		
		return true;
		
		
	}
	
	
	
	
	// reverse 구현
	public static void reverse(int[] arr) {
		
		/*int temp = arr[0];
		arr[0] = arr[4];
		arr[4] = temp;
		
		temp = arr[1];
		arr[1] = arr[3];
		arr[3] = temp;*/
		
		
		for(int i = 0; i < arr.length/2 ; i++) {
			swap(arr, i, arr.length-1 - i);
		}
		
	}
	
	
	// swap을 구현하는 메서드
	public static void swap(int[] arr, int idx1, int idx2) {  // 배열은 한 번만 보내주면 된다. 
		
		int temp = arr[idx1];
		
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
