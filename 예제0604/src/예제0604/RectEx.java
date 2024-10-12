// 예제 6-4 : Rect 클래스와 equals() 메소드 만들기 연습
// int 타입의 width(너비), height(높이) 필드를 가지는
// Rect 클래스를 작성하고, 면적이 같으면 두 Rect 객체가
// 같은 것으로 판별하는 equals()를 작성하라.

package 예제0604;

class Rect {
    int width, height;
    
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public boolean equals(Object obj) {
        // Check if obj is an instance of Rect
        if (obj instanceof Rect) {
            Rect p = (Rect) obj; // obj를 Rect 타입으로 다운 캐스팅
            return (this.width * this.height) == (p.width * p.height);
        }
        return false;
    }
}

public class RectEx {
	public static void main(String[] args) {
		Rect a = new Rect(2,3); // 면적 6
		Rect	 b = new Rect(3,2); // 면적 6
		Rect c = new Rect(3,4); // 면적 12

		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(b.equals(c)) System.out.println("b is equal to c");
	}
}
