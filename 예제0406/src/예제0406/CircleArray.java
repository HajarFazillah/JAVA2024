// 예제 4-6 : Circle 배열 만들기
// Circle 객체 5개를 가지는 배열을 생성하고,
// Circle 객체의 반지름을 0에서 4까지 각각 지정한 후, 면적을 출력하라.


package 예제0406;

class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle [] c; 
		c = new Circle[5]; 

		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i); 

		for(int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " ");
	}
}
