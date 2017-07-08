package ch10;

import java.util.Scanner;

public class section5 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~1000 사이에서 선택한 수의 배수가 몇 개고, 배수의 합은?");
		System.out.print("1부터 1000 사이의 수 중 하나를 입력 ==>");
		
		int num = sc.nextInt();
		int cnt = 0;
		int add =0;
		
		//입력한 값까지 갯수 세기
		for (int i = num; i < 1000 + 1; i++) {
			if(i % num == 0){
				cnt++;
				add += i;
			}
			
		}
	
		System.out.println("1부터 1000사이 "+ num+"의 배수의 갯수: "+cnt+",배수의 합: "+add);
	}
}
