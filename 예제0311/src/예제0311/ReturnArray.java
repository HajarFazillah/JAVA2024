// 예제 03-11 : 배열 리턴
// 일차원 정수 배열을 생성하여 리턴하는 makeArray()를 작성하고,
// 이 메소으로부터 배열을 전달받는 프로그램을 작성하라.

package 예제0311;

public class ReturnArray {
	
	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i=0; i<temp.length; i++)
			temp[i] = i; // 배열 초기화, 0, 1, 2, 3
		return temp; // 배열 리턴
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		intArray = makeArray(); // 메소드가 리턴한 배열 참조
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i]+" ");

	}

}
