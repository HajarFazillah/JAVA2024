// 예제 02-04 : 타입 변환
// 자동 타입 변환과 강제 타입 변환이 들어 있는 코ㅗ드이다.
// 실행 결과는 무엇인가?

package 예제0204;

public class TypeConversion {
	
	public static void main(String[] args) {
		
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
		
	}

}
