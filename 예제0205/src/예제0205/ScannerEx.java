// 예제 2-5 : Scanner를 이용한 키 입력 연습
// Scanner를 이용하여 이름, 도시, 나이, 체중, 독신 여부를 입력 받고 
// 다시 출력하는 프로그램을 작성하라.

package 예제0205;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요:");
		
		String name = s.next();
		String city = s.next();
		int age = s.nextInt();
		double weight = s.nextDouble();
		boolean single = s.nextBoolean();
		
		s.close(); // 자원 반납
		
		System.out.println(name + " " + city + " " + age + " " + weight + " " + single);
	}

}
