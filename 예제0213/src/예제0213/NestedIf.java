// 2-13 중첩 if-else문 사례
// 점수와 학년을 입력 받아 60점 이상이면 합격,
// 아니면 불합격을 출력하라. 다만 4학년은 70점 이상이어야 합격이다.
// 60점 이상인 경우 4학년을 구분하여 처리해야 한다.

package 예제0213;

import java.util.Scanner;

public class NestedIf {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.print("Enter score(0~100): ");
		int score = s.nextInt(); 

		System.out.print("Enter year(1~4): ");
		int year = s.nextInt(); 

		if(score >= 60) { // 60점 이상
			if(year != 4)
				System.out.println("Pass"); // 4학년 아니면 합격
			else if(score >= 70)
				System.out.println("Pass"); // 4학년이 70점 이상이면 합격
		else
			System.out.println("Fail"); // 4학년이 70점 미만이면 불합격
		}
		else // 60점 미만 불합격
			System.out.println("Fail");

		s.close();
	}
}
