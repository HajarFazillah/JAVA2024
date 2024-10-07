// 예제 4-3 : 두 개의 생성자를 가진 Circle 클래스
// 두 개의 생성자를 가진 Circle 클래스를 만들어 보라.

package 예제0403;

public class Circle {
	
	int radius;
	String name;

	public Circle() { // 매개 변수 없는 생성자
		radius = 1; name = ""; // radius의 초기값은 1
	}
	public Circle(int r, String n) { // 매개 변수를 가진 생성자
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle pizza = new Circle(10, "자바피자"); // Circle 객체 생성, 반지름 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donut = new Circle(); // Circle 객체 생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		
		System.out.println(donut.name + "의 면적은 " + area);
		
	}
}

