package ch10;

import java.util.Scanner;

public class section5 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~1000 ���̿��� ������ ���� ����� �� ����, ����� ����?");
		System.out.print("1���� 1000 ������ �� �� �ϳ��� �Է� ==>");
		
		int num = sc.nextInt();
		int cnt = 0;
		int add =0;
		
		//�Է��� ������ ���� ����
		for (int i = num; i < 1000 + 1; i++) {
			if(i % num == 0){
				cnt++;
				add += i;
			}
			
		}
	
		System.out.println("1���� 1000���� "+ num+"�� ����� ����: "+cnt+",����� ��: "+add);
	}
}
