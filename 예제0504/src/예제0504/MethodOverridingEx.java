// 예제 5-4 : 메소드 오버라이딩으로 다형성 실현
// Shape의 draw() 메소드를 Line, Circle,
// Rect 클래스에서 목적에 맞게 오버라이딩하는 다형성의 사례를 보여준다.

package 예제0504;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
