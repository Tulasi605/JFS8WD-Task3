package TASK3.Question1;

import java.util.ArrayList;

public class library {
	  private ArrayList < book > books;

	  public library() {
	    books = new ArrayList < book > ();
	  }

	  public void addBook(book book) {
	    books.add(book);
	  }

	  public void removeBook(book book) {
	    books.remove(book);
	  }
	  
	  public ArrayList<book> displaybooks() {
		  return books;
	  }

	  
	  public static void main(String[] args) {
		  library library = new library();

		  book book1 = new book(1,"Adventures of Tom Sawyer", "Mark Twain");
		  book book2 = new book(2,"Ben Hur", "Lewis Wallace");
		  book book3 = new book(3,"Time Machine", "H.G. Wells");
		  book book4 = new book(4,"Anna Karenina", "Leo Tolstoy");

		    library.addBook(book1);
		    library.addBook(book2);
		    library.addBook(book3);
		    library.addBook(book4);

		    System.out.println("Books in the library:");
		    for (book book: library.displaybooks()) {
		      System.out.println(book.getTitle() + " by " + book.getAuthor());
		    }

		    library.removeBook(book2);
		    System.out.println("\nBooks in the library after removing id:" + book2.getid());
		    for (book book: library.displaybooks()) {
		      System.out.println(book.getTitle() + " by " + book.getAuthor());
		    }
		  }
}
