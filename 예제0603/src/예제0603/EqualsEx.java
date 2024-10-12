// 예제 6-3 : Point 클래스의 equals() 작성
// Point 클래스에 x, y 점 좌표가 같으면 true를 리턴하는 equals()를 작성하라.

package 예제0603;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj; // obj를 Point 타입으로 다운 캐스팅
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		if(a == b) System.out.println("a==b");
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
	}
}
