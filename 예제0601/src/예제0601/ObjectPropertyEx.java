// 예제 6-1 : Object 클래스로 객체 속성 알아내기
// Object 클래스를 이용하여 객체의 클래스명, 해시 코드 값, 객체의 문자열을 출력해보자.

package 예제0601;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

public class ObjectPropertyEx {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
	}

}

// 해시 코드의 16진수 값. 이 값은 실행할 때마다 달라질 수 있음