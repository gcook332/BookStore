package BS;

import java.util.Scanner;


public class Store {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		StoreClass obj = new StoreClass();
		
		
		obj.Greeting();
		System.out.println("Enter an option: ");
		int option = input.nextInt();
		
		if(option == 1) {
			System.out.println("You selected check out a book\n");
		}
		if(option == 2) {
			System.out.println("You selected books by genre\n");
		}
		if(option == 3) {
			System.out.println("You selected return a book\n");
		}
		if(option == 4) {
			//System.out.println("Quit\n");
			System.exit(0);
		}
		
		
	
	}

}
