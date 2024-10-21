// 예제 4-3 : 두 개의 생성자를 가진 Circle 클래스
// 두 개의 생성자를 가진 Circle 클래스를 만들어 보라.

package 예제0403;

public class Circle {
	
	// fields to store the radius and name of the circle
	// that will be used later
	int radius;
	String name;

	// constructor with no parameters
	public Circle() {	// 매개 변수 없는 생성자
		radius = 1;		// default radius의 초기값은 1
		name = "";		// default name to an empty string
	}

	// constructor with parameters
	public Circle(int r, String n) { // 매개 변수를 가진 생성자
		radius = r;		// set radius to the value of r passed in
		name = n;		// set name to the value of n passed in
	}

	// method to be used later for calculationg the area of circle
	public double getArea() {
		return 3.14*radius*radius;	// area formula written here
		// Area = π * radius * radius
	}

	public static void main(String[] args) {
		
		// create a Circle object named "pizza" with a radius of 10 and its name 자바피자
		Circle pizza = new Circle(10, "자바피자"); // Circle 객체 생성, 반지름 10
		double area = pizza.getArea(); // to calculate the pizza 자바피자 area
		System.out.println(pizza.name + "의 면적은 " + area); // show output

		// create a Circle object named 'donut'
		Circle donut = new Circle(); 	// Circle 객체 생성, 반지름 1
		donut.name = "도넛피자";		 // only name specifically given, default radius being 1
		area = donut.getArea();			// calculate area of donut
		
		System.out.println(donut.name + "의 면적은 " + area); // show output
		
	}
}

