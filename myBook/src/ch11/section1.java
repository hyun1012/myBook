package ch11;

import java.io.FileReader;
import java.io.FileWriter;
/**
 * 탐욕알고리즘: 가장 유리한 경우를 선택하는 알고리즘
 */
public class section1 {

	public static void main(String args[]) throws Exception{
		

		FileReader fr = new FileReader("C:/Users/nt370r5e/workspace/myBook/src/ch11/input.txt");
//		FileWriter fw = new FileWriter("C:/Users/nt370r5e/workspace/myBook/src/ch11/output.txt");
		
		int val ;
		int caseCnt = fr.read();
		System.out.println(caseCnt-'0');
		
//		while((val = fr.read())!=-1){
//			
//			System.out.print((char)val);
//		}
		
		
		
		
		
		
	}
}
