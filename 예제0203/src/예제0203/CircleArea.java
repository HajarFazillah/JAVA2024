// 예제02-03 : 변수, 리터럴, 상수 사용하기
// 원의 면적을 계산하여 출력하는 프로그램을 작성하라.

package 예제0203;

public class CircleArea {
	
	public static void main(String[] args) {
		
		final double PI = 3.14;
		double radius = 10.2;
		double circleArea = radius*radius*PI;
		
		System.out.println("반지름 "+radius+" ");
		System.out.println("원의 면적 = "+circleArea);
	}
	
}
