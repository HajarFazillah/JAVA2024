// 예제 4-9 : 가비지의 발생
// garbage means objects that are no longer needed / garbage collecror
// auto clean up unused memory to avoid memory leaks

package 예제0409;
import java.util.Scanner;

public class GarbageEx {
	
	public static void main(String[] args) {

        // new String objects with the value string is created in memory
        // and a b c points to it.
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");

		String d,e; // variable d & e are declared
        // but nothing is assigned to them yet
		
		a = null; // reference Good is removed (a points to nothing)
        // now a points to nothing
        // no variable ins pointing to it -> Good object is now a garbage 

		d = c; // d pointing to c Normal
		c = null; // c reference is removed
        // no longer points to Normal, d still does.
	}
	
}
