// 예제 3-13 : 0으로 나누는 예외에 대처하는 try-catch 블록 만들기
// try-catch-finally 블록을 이용하여 예제 3-12를 수정하여,
// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하는 프로그램을 작성하라.

package 예제0313;
import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor; // 나눗수

		System.out.print("나뉨수를 입력하시오:");
		dividend = s.nextInt(); // 나뉨수 입력
		System.out.print("나눗수를 입력하시오:");
		divisor = s.nextInt(); // 나눗수 입력
		try {
			System.out.println(dividend+"를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		}
		catch(ArithmeticException e) { // ArithmeticException 예외 처리 코드
			System.out.println("0으로 나눌 수 없습니다.");
		}
		finally {
			s.close(); // 정상적이든 예외가 발생하든 최종적으로 s를 닫는다.
		}

	}

}
