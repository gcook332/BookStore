package BS;

import java.util.Scanner;


public class Store {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		StoreClass obj = new StoreClass();
		
		obj.Greeting();
		
		if(obj.Option(input.nextInt()) == 1) {
			System.out.println("sup fam");
			System.out.println("What book are you checking out?");
			 obj.BookList(input.next());
		}
		
	
	}
}


