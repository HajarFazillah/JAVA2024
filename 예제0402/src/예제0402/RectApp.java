// 예제 04-02 : Rectangle 클래스 만들기 연습
// 너비(width)와 높이(height) 필드,
// 그리고 면적 값을 제공하는 getArea() 메소드를 가진
// Rectangle 클래스를 작성하라.

package 예제0402;
import java.util.Scanner;

class Rectangle {
	
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
}

public class RectApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle();
		Scanner s = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = s.nextInt();
		rect.height = s.nextInt();
		System.out.println("사각형의 면적은 "+rect.getArea());
		s.close();

	}

}
