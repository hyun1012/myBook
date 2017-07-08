package ch10;
/*
 * 사용자가 랜덤숫자 맞추기
 */
import java.util.Random;
import java.util.Scanner;

public class section2 {

	private static int cunt = 0;

	public static boolean check(int ranNum) {

		Scanner sc = new Scanner(System.in);

		System.out.println("[" + (cunt++) + "]" + "Enter your number: ");
		int userNum = sc.nextInt();

		if (ranNum > userNum) {
			System.out.println("randon Number is bigger than your num.");
			return false;
		}
		if (ranNum < userNum) {
			System.out.println("randon Number is smaller than your num.");
			return false;
		} else {
			System.out.println("you check figures!");
			return true;
		}

	}

	public static void main(String args[]) {

//		Random ran = new Random();
//		int num = ran.nextInt(100); //Random클래스 와 Math.random()함수 비교

		int num =(int)(Math.random()*10+1);
		
		
		System.out.println("random : " + num);
		while (!check(num));

		System.out.println("wow!" + cunt);
	}

}
