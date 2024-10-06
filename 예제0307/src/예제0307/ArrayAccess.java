// 예제 03-07 : 배열 선언 및 생성
// 양수 5개를 입력 받아 배열에 저장하고,
// 제일 큰 수를 출력하는 프로그램을 작성하라.

package 예제0307;

import java.util.Scanner;

public class ArrayAccess {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int arr[]; // 배열
		arr = new int[5];
		
		int max = 0;
		
		System.out.println("양수 5개를 입력하세요: ");
		
		for(int i=0; i<5; i++) {
			arr[i] = s.nextInt();
			
			if(arr[i] > max) {
				max = arr[i]; // max 값을 변경
			}
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		s.close();
		
	}

}
