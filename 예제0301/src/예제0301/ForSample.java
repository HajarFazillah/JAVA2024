// 예제 0301 : for 문을 이용하여 1부터 10까지 합 출력하기
// for 문을 이용하여 1부터 10까지 덧셈으로 표시하고 합을 출력하라.

package 예제0301;

public class ForSample {

	public static void main(String[] args) {
		
		int i, sum = 0;
		
		for(i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
		
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}
}
