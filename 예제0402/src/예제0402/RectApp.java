// 예제 04-02 : Rectangle 클래스 만들기 연습
// 너비(width)와 높이(height) 필드,
// 그리고 면적 값을 제공하는 getArea() 메소드를 가진
// Rectangle 클래스를 작성하라.

// 예제 04-02 : Rectangle 클래스 만들기 연습
// 너비(width)와 높이(height) 필드,
// 그리고 면적 값을 제공하는 getArea() 메소드를 가진
// Rectangle 클래스를 작성하라.

package 예제0402;
import java.util.Scanner;

class Rectangle {	// define the Rectangle class to represent a rectangle
	
	// fields to store the width and height of the rectange
	int width;
	int height;
	
	// method to calculate and return the area of the rectangle
	public int getArea() {	
		return width*height;
	}
	
}

public class RectApp {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();	// new object called Rectangle
		// if constructor is created
		// then this line will be
		// Rectangle rect = new Rectangle(s.NextInt(), s.nextInt());

		Scanner s = new Scanner(System.in);	// Scanner object to read input from the user
		System.out.print(">> ");	// prompt the user to enter the width and height

		rect.width = s.nextInt();
		rect.height = s.nextInt();
		// these lines are not needed if constructor class is created
		// as it is called on the above code 

		System.out.println("사각형의 면적은 "+rect.getArea());
		// calculate the area by using the getArea method 

		s.close();	// close the Scanner object to avoid resources leaks

	}

}
