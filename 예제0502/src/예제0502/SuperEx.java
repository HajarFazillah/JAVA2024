// 예제 5-2 : super()를 활용한 ColorPoint 작성
// super()를 이용하여 ColorPoint 클래스의 생성자에서
// 서브 클래스 Point의 생성자를 호출하는 예를 보인다.

package 예제0502;

class Point{
	private int x, y;
	public Point() {
		this.x = this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

}

class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();

	}

}
