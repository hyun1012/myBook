package ch10;

import java.util.Scanner;

public class section1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("10진수 -> 16진수 변환 프로그램");
		System.out.println("Press 'A' - 16 -> 10");
		System.out.println("Press 'B' - 10 -> 16");
		System.out.print("Press : ");
		String press = sc.nextLine();
		System.out.print("Enter value: ");
		
		
		if(press.equals("A") || press.equals("a")){ //Press 'A' - 16 -> 10"
			String val = sc.nextLine();
			val = val.toLowerCase();
			System.out.println(val +" -> "+ Integer.parseInt(val,16));			
		}else{ //Press 'B' - 10 -> 16
			int val = sc.nextInt();
			System.out.println(val +" -> "+ Integer.toHexString(val));
		}
		
		
		
	}

}
