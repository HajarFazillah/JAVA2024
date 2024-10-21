// 예제 4-8 : 인자로 배열이 전달되는 예
// char[] 배열을 전달받아 배열 속의 공백(' ') 문자를 ','로 대치하는 메소드를 작성하라.

package 예제0408;

public class ArrayParameter {

 // without the static method - need to create an instance first
 // create object - call method (inconvenience)
 // static method to replace spaces with commas in a char array
	static void replaceSpace(char a[]) {
  // loop through each element in the array
		for (int i=0; i<a.length; i++)
			if (a[i] == ' ') // if the current element is a blank space
				a[i] = ','; // then it will be replace with a comma (,)
	}

 // static method to print the contents of a char array
	static void printCharArray(char a[]) {
  // loop through each element in the array
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]); // print the current character
		System.out.println(); // print a new line after the array is printed
	}

	public static void main (String args[]) {
  // initialize a char array with the sentence This is a pencil.
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c); // call the printCharArray method to print the original sentence
		replaceSpace(c); // call the replace method to replace the blank spaces
		printCharArray(c); // print the updated array after blank spaces have been replaced
	}

}
