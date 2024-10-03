package 예제0214;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Month : ");
		int month = s.nextInt();
		
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("Spring");
			break;
			
		case 6 :
		case 7 :
		case 8 :
			System.out.println("Summer");
			break;
			
		case 9 :
		case 10 :
		case 11 :
			System.out.println("Fall");
			break;
			
		case 12 :
		case 1 :
		case 2 :
			System.out.println("Winter");
			break;
		}
		
		s.close();

	}

}
