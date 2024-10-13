// 예제 7-4 : Iterator<Integer>를 이용하여 정수 벡터 검색
// 예제 7-1의 코드 중에서 벡터 검색 부분을
// Iterator<Integer>를 이용하여 수정하라.

package 예제0704;
import java.util.*;

public class IteratorEx {
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer> ();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("백터에 있는 정수 합 : "+sum);
	}
}
