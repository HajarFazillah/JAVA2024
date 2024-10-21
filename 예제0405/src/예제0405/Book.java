package 예제0405;

public class Book {
	
	// field to store the title and author of the book
	String title;
	String author;

	// constructor with no parameters
	public Book() {	
		this("", ""); // cal the 2 constructor with two parameters (setting default values)
		System.out.println("생성자 호출됨"); // print message indicating constructor has been called
	}

	// constructor with one parameter for title
	// allow program to handle cases where no author's name given
	public Book(String title) {
		this(title, "작자미상");
	}

	// constructor with 2 parameters for title and author
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// display the title and author
	void show() { 
		System.out.println(title + " " + author);
	}
	
	public static void main(String [] args) {
		
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();		
		loveStory.show();
		
	}
}
