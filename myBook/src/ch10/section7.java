package ch10;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * 지그재그 숫자 출력하기 일정한 규칙에 맞춰서 출력!!
 * 
 * 몇까지 숫자를 출력할것인지? 25 
 * 몇 행으로? 5 
 * 1 2 3 4 5 
 * 10 9 8 7 6 
 * 11 12 13 14 15
 * 20 19 18 17 16 
 * 21 22 23 24 25
 * 
 */
public class section7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("몇까지 숫자를 출력할것인지?");
		int num = sc.nextInt();
		System.out.println("몇 행으로?");
		int maxLine = sc.nextInt(); // 몇 행까지.

		int val = 1;
		Stack<Integer> stack = new Stack<>();

		//한 행씩 
		for (int startLine = 1; startLine <= maxLine; startLine++) {

			if (startLine % 2 != 0) { // 홀수행일 경우에는 그냥 순서대로 출력.
				
				//(num / maxLine) = (구할 숫자 / 행의 수) = 열의 수
				for (int i = 0; i < (num / maxLine); i++) {
					System.out.print((val++) + "\t");
				}

			} else { // 짝수행일 경우에는 그 행의 순서를 바꿔야하니 stack사용.
			
				//먼저 순서대로 담음.
				for (int i = 0; i < (num / maxLine); i++) {
					stack.push(val++); 
				}

				//뺄때는 반대 순서로 나오기 때문에 제대로 출력됨.
				while(!stack.isEmpty()) {
					System.out.print(stack.pop() + "\t");
				}
			}

			System.out.println();
		}

	}

}
