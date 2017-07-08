package ch10;

import java.util.Scanner;

public class section3 {
	// args... 이거 알아보기!!
	// 매개변수 갯수 상관없이 받을 수 있는 거

	// 1. 임의의 숫자의 약수를 구하는 방법
	public static void factor(int num) {

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}
	}

	// 2. 임의의 두 숫자에 공통으로 해당하는 약수를 구하는 방법
	public static void factor2(int num1, int num2) {
		int rag = num1 > num2 ? num2 : num1;

		for (int i = 1; i <= rag; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				System.out.print(i + " ");
		}

	}

	// 3. 임의의 두 숫자에 공통으로 해당하는 약수 중 최댓값을 선택하는 방법
	public static void factor3(int num1, int num2) {

		int result = 0;

		factor2(num1, num2);

		System.out.println(num1 + "과" + num2 + "의 최대공약수: " + result);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("약수를 구할 두 정숫값을 입력하시오.");
		int[] val = new int[2];

		// factor(30);
		factor2(280, 30);
	}
}
