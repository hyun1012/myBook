package ch10;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * ������� ���� ����ϱ� ������ ��Ģ�� ���缭 ���!!
 * 
 * ����� ���ڸ� ����Ұ�����? 25 
 * �� ������? 5 
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

		System.out.println("����� ���ڸ� ����Ұ�����?");
		int num = sc.nextInt();
		System.out.println("�� ������?");
		int maxLine = sc.nextInt(); // �� �����.

		int val = 1;
		Stack<Integer> stack = new Stack<>();

		//�� �྿ 
		for (int startLine = 1; startLine <= maxLine; startLine++) {

			if (startLine % 2 != 0) { // Ȧ������ ��쿡�� �׳� ������� ���.
				
				//(num / maxLine) = (���� ���� / ���� ��) = ���� ��
				for (int i = 0; i < (num / maxLine); i++) {
					System.out.print((val++) + "\t");
				}

			} else { // ¦������ ��쿡�� �� ���� ������ �ٲ���ϴ� stack���.
			
				//���� ������� ����.
				for (int i = 0; i < (num / maxLine); i++) {
					stack.push(val++); 
				}

				//������ �ݴ� ������ ������ ������ ����� ��µ�.
				while(!stack.isEmpty()) {
					System.out.print(stack.pop() + "\t");
				}
			}

			System.out.println();
		}

	}

}
