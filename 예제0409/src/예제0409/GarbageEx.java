// 예제 4-9 : 가비지의 발생

package 예제0409;
import java.util.Scanner;

public class GarbageEx {
	
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d,e;
		
		a = null;
		d = c;
		c = null;
	}
	
}
