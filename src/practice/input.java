package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class input {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello World");
		/*Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("You entered string "+s);
        int a = in.nextInt();
        System.out.println("You entered integer "+a);
        float b = in.nextFloat();
        System.out.println("You entered float "+b);*/

		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
		ArrayList<String> List = new ArrayList();
		List.add("Gavin");
		List.add("Lou");
		
		String x = "Gavin";
		for(String i : List) {
			if(x == i) {
				System.out.println(i);
			}
		}
	}
	
}
