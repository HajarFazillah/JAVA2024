// 예제 4-7 : 객체 배열 만들기 연습
// 예제 4-4의 Book 클래스를 활용하여
// 2개짜리 Book 객체 배열을 만들고,
// 사용자로부터 책의 제목과 저자를
// 입력 받아 배열을 완성하라.


package 예제0407;
import java.util.Scanner; // import Scanner utility

// use to define properties and behaviours of a single book
class Book{
	String title, author; // field tor store book's title and author
	
	// constructor with 0 parameters; default -> empty string
	public Book(){
		this.title = "";
		this.author = "";
	}

	// constructor with 2 parameters; title and author
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	
	public static void main(String[] args) {
		
		// declare an array to hold 2 Book object
		Book [] book = new Book[2];	// Book 배열 선언
		
		Scanner s = new Scanner(System.in); // Scanner object user to enter inputs
		
		// loop to get the title and author for each book from the user
		for(int i=0; i<book.length; i++) {
			
			System.out.print("제목>>"); // enter book title
			String title = s.nextLine(); // get input and read

			System.out.print("저자>>");
			String author = s.nextLine();
			
			book[i] = new Book(title, author);
		}
		
		// loop to print the title and authors of the books
		for(int i=0; i<book.length; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
			// print each book's title and author
		s.close(); // close scanner object - free up resources
	}

}
