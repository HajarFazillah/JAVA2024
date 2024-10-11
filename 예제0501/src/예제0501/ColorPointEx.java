// 예제 5-1 : 클래스 상속
// (x, y)의 한 점을 표현하는 Point 클래스와
// 이를 상속받아 점에 색을 추가한 ColorPoint 클래스를 만들고 활용해보자.

package 예제0501;

class Point{
	private int x,y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.set(1,2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();

	}

}
