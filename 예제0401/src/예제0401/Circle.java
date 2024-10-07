// 예제 04-01 : Circle 클래스의 객체 생성 및 활용
// 반지름과 이름을 가진 Circle 클래스를 작성하고,
// Circle 클래스의 객체를 생성하라.

package 예제0401;

public class Circle {
	
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);

	}

}
