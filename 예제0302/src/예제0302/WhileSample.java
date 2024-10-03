// 예제 03-02 : while 문을 이용하여 입력된 정수의 평균 구하기
// while 문을 이용하여 정수를 여러 개 입력 받고 평균을 출력하라.
// 0이 입력되면 입력을 종료한다.

package 예제0302;

import java.util.Scanner;

public class WhileSample {
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int count = 0, n = 0;
		double sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		
		while((n=s.nextInt())!=0) {
			sum = sum + n;
			count++;
		}
		System.out.println("수의 개수는 "+count+"개이며 ");
		System.out.println("평균은 "+sum/count+"입니다.");
		
		s.close();
	}
}
