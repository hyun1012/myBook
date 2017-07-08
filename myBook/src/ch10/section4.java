package ch10;

public class section4 {

	public static void main(String[] args) {

		
		int first = 0;
		int second = 1;
		int third = 0;
		
		while(third < 300){
			
			third = first + second;
			
			first = second;
			second = third;
			
			System.out.println(third);
		}
		
	}
}
