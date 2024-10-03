// 예제 03-03 : do-while 문을 이용하여 'a'에서 'z'까지 출력하기

package 예제0303;

public class DoWhileSample {
	
	public static void main (String[] args) {
		char a = 'a';
		
		do {
			System.out.print(a);
			a = (char)(a+1);
		}while(a<='z');
	}

}
