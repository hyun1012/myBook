package ch10;

import java.util.Scanner;

public class section3 {
	// args... �̰� �˾ƺ���!!
	// �Ű����� ���� ������� ���� �� �ִ� ��

	// 1. ������ ������ ����� ���ϴ� ���
	public static void factor(int num) {

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}
	}

	// 2. ������ �� ���ڿ� �������� �ش��ϴ� ����� ���ϴ� ���
	public static void factor2(int num1, int num2) {
		int rag = num1 > num2 ? num2 : num1;

		for (int i = 1; i <= rag; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				System.out.print(i + " ");
		}

	}

	// 3. ������ �� ���ڿ� �������� �ش��ϴ� ��� �� �ִ��� �����ϴ� ���
	public static void factor3(int num1, int num2) {

		int result = 0;

		factor2(num1, num2);

		System.out.println(num1 + "��" + num2 + "�� �ִ�����: " + result);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("����� ���� �� �������� �Է��Ͻÿ�.");
		int[] val = new int[2];

		// factor(30);
		factor2(280, 30);
	}
}
