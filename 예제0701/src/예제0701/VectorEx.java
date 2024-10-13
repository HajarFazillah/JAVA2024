// 예제 7-1 : 정수만 다루는 Vector<Integer> 컬렉션 활용
// 정수만 다루는 Vector<Integer> 제네릭 벡터를 생성하고
// 활용하는 사례를 보인다. 다음 코드에 대한 결과는 무엇인가?

package 예제0701;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		System.out.println("백터 내의 요소 객체 수 : "+v.size());
		System.out.println("백터의 현재 용량 : "+v.capacity());
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("백터에 있는 정수 합 : "+sum);
		
	}
	
}
