// 예제02-08 : 비교 연산자와 논리 연산자 사용하기

package 예제0208;

public class LogicalOperator {

	public static void main(String[] args) {
		
		System.out.println("a > b "+('a' > 'b'));
		System.out.println("3 >= 2 "+(3 >= 2));
		System.out.println("-1 < 0 "+(-1 < 0));
		System.out.println("3.45 <= 2 "+(3.45 <= 2));
		System.out.println("3 == 2 "+(3 == 2));
		System.out.println("3 != 2 "+(3 != 2));
		System.out.println("!(3 != 2) "+(!(3 != 2)));
		System.out.println("(3 > 2) && (3 > 4) "+((3 > 2) && (3 > 4)));
		System.out.println("(3 != 2) || (-1 > 0) "+((3 != 2) || (-1 > 0)));
		System.out.println("(3 != 2) ^ (-1 > 0) "+((3 != 2) ^ (-1 > 0)));

	}

}
