// 예제 02-07: 대입 연산자와 증감 연산자 사용하기

package 예제0207;

public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		
		int a=3, b=3, c=3;
		
		a += 3; // a=a+3=6
		b *= 3; // b=b*3=9
		c %= 2; // c=c%2=1
		System.out.println("a="+a+", b="+b+", c="+c);
		
		int d = 3;
		
		a = d++;
		System.out.println("a="+a+", d="+d);
		a = ++d;
		System.out.println("a="+a+", d="+d);
		a = d--;
		System.out.println("a="+a+", d="+d);
		a = --d;
		System.out.println("a="+a+", d="+d);
	}
}
