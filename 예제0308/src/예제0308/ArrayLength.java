// 예제 03-08 : 배열의 length 필드 활용
// 배열의 length 필드를 이용하여
// 배열 크기만큼 정수를 입력 받고 평균을 출력하라.

package 예제0308;

import java.util.Scanner;

public class ArrayLength {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요: ");
		int intArray[] = new int[5];
		
		double sum = 0.0;
		for(int i=0; i<intArray.length; i++)
			intArray[i] = s.nextInt(); // 키보드에서 입력받은 정수 저장
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기
		
		System.out.println("편균은 "+sum/intArray.length);
		s.close();
		
	}

}
