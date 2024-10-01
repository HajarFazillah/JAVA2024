// 예제 02-11 : if-else 사용하기
// 나이를 입력 받아 20대인지 판별하는 프로그램을 작성하라

package 예제0211;

import java.util.Scanner;

public class Twenties {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();
		
		if((age>=20)&&(age<30)) {
			System.out.println("20대가 맞습니다.");
			System.out.println("20대라서 행복합니다!");
		}else {
			System.out.println("20대가 아닙니다.");
			System.out.println("30대도 나쁘지 않습니다.");
		}
			
		s.close();
	}

}
