// 예제 7-3 : 문자열만 다루는 ArrayList<String> 활용
// 이름을 4개 입력받아 ArrayList에 저장하고,
// ArrayList에 저장된 이름을 모두 출력한 후, 제일 긴 이름을 출력하라.

package 예제0703;
import java.util.*;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 압력하세요 >> ");
			String s = scanner.next();
			a.add(s);
		}
		
		// ArrayList에 들어 있는 모든 이름 출력
		for(int i=0; i<a.size(); i++) {
			// ArrayList의 i 번째 문자열 얻어오기
			String name = a.get(i);
			System.out.println(name+" ");
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length()<a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n가장 김 이름은: "+a.get(longestIndex));
	}

}
