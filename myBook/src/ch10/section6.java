package ch10;
/*
 * 
 */
public class section6 {

	// 1. �Ҽ� ���ϱ�
	public static void factor(int num) {
		int i = 1;
		int j = 2;
		int cnt = 0;
		
		for (i = 1; i <= num; i++) {

			for (j = 2; j < i; j++) {
				// �ڱ� �ڽ��� �ƴ� �ٸ� ���� ���������� �Ҽ��� �ƴ�.
				if (i % j == 0) {
					break;
				}
			}

			if (i == j) { // �Ҽ�
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
