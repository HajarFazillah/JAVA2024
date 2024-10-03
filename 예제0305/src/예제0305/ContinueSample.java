// 예제 03-05 : continue 문을 이요하여 양수 합 구하기
// 5개의 정수를 입력 받고 양수 합을 구하여 출력하는 프로그램을 작성하라.

package 예제0305;

import java.util.Scanner;

public class ContinueSample {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 5개 입력하세요: ");
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			int n = s.nextInt();
			if(n<=0) continue;
			else sum += n;
		}
		System.out.println("양수의 합은 "+sum);
		s.close();
	
	}

}
