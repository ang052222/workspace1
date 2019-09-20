package kosta.oop;

public class BookMain {

	public static void main(String[] args) {

		Book[] arr = {new Book("JAVA", 30000), new Book("JSP", 25000), new Book("Oracle", 15000)};
		
		/*arr[0].totalPrint();
		arr[1].totalPrint();
		arr[2].totalPrint();*/
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].totalPrint();
		}
		
		
		
	}
}
