// 예제 03-06 : break 문을 이용하여 while 문 벗어나기
// "exit"이 입력되면 while 문을 벗어나도록 break 문을 활용하는 프로그램을 작성하라.

package 예제0306;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) {
			System.out.print(">> ");
			String text = s.nextLine();
			
			if(text.equals("exit"))
				break;
		}
		
		System.out.println("종료합니다...");
		s.close();

	}

}
