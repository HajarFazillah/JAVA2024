// 예제 03-09 : for-each 문 활용
// for-each 문을 활용하여 int [] 배열의 합을 구하고,
// String [] 배열의 문자열을 출력하는 사례를 보인다.

package 예제0309;

public class foreachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] n = {1,2,3,4,5};
		int sum = 0;
		
		for(int k : n) {
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("합은 "+sum);
		
		String f[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		for(String s : f) // s는 f[0], f[1], ..., f[5]로 반복
			System.out.print(s+" ");
		}

}
