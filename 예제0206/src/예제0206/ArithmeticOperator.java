// 예제 2-6 : /와 % 산술 연산자 응용
// 초 단위의 정수를 입력 받고, 몇 시간, 몇 분, 몇 초인지 구하여
// 출력하는 프로그램을 작성하라.

package 예제0206;

import java.util.Scanner;

public class ArithmeticOperator {
	
	public static void main(String[]args) {
		// TODO Auto-generated method sub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the integer: ");
		int time = s.nextInt();
		
		int sec = time % 60;
		int min = (time / 60) % 60;
		int hour = (time/60) / 60;
		System.out.println(time+ " sec = "+hour+" hour "+min+" min "+sec+" sec ");
		
		s.close();
		
	}
}
