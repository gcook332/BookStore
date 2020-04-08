package BS;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreClass {
	
	public StoreClass() {}
	
	public void Greeting() {
		//Scanner input = new Scanner(System.in);
		
		System.out.println("********************************");
		System.out.println("Welcome to my erotic bookstore!");
		System.out.println("********************************");
		//System.out.println("\n");
		System.out.println("Please select from the following options");
		System.out.println("Check out a book - 1");
		System.out.println("Books by genre - 2");
		System.out.println("Return a book - 3");
		System.out.println("List of available books - 4");
		System.out.println("Quit - 5");
		System.out.println("\n");
		System.out.println("Enter an option: ");
		
		return;
	}
	
	public int Option(int x) {
		//System.out.println("Fiction Non-fiction, Erotic, Bible, Sex");
		if(x == 1) {
			System.out.println("Select a book from the list\n");
		}
		else if(x == 2) {
			System.out.println("You selected books by genre\n");
		}
		else if(x == 3) {
			System.out.println("You selected return a book\n");
		}
		else if(x == 4) {
			System.out.println("List of available books");
			
		}
		else {
			System.out.println("Exiting...");
			System.exit(0);
		}
		return x;
		
	}
	/*public String BookList(String Book) {
		String x = "Not found";
		
		ArrayList<String> Books = new ArrayList();
		Books.add("War and Peace");
		Books.add("The Great Gatsby");
		Books.add("In search of lost time");
		Books.add("One Hundred Years of Solitude");
		
		for(String i : Books) {
			if(Book == i) {
				return Book;
			}
		}
		return x;
 	}*/
	public void BookList() {
		ArrayList<String> Books = new ArrayList();
		Books.add("War and Peace");
		Books.add("The Great Gatsby");
		Books.add("In search of lost time");
		Books.add("One Hundred Years of Solitude");
		
		System.out.println(Books);
		/*for(String i : Books) {
			System.out.println(i);
		}*/
	}
	
	
}
