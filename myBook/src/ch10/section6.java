package ch10;
/*
 * 
 */
public class section6 {

	// 1. 소수 구하기
	public static void factor(int num) {
		int i = 1;
		int j = 2;
		int cnt = 0;
		
		for (i = 1; i <= num; i++) {

			for (j = 2; j < i; j++) {
				// 자기 자신이 아닌 다른 수로 나뉘어지면 소수가 아님.
				if (i % j == 0) {
					break;
				}
			}

			if (i == j) { // 소수
				System.out.print(i + "\t");
				cnt++;
				if(cnt%8 ==0)
					System.out.println();
			}
			


		}

	}

	public static void main(String args[]) {
		factor(55);
	}
}
