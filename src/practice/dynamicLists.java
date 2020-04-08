package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class dynamicLists {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		
		/*System.out.println("sup fam\n");
		ArrayList<String> List = new ArrayList();
		
		List.add("a");
		List.add("b");
		
		System.out.println("List size is " + List.size());
		String x = "a";
		for(String i : List) {
			if(i == x) {
				List.remove(i);
			}
		}
		System.out.println("Now List size is " + List.size());
		
		System.out.println("\n**************************************\n");
		ArrayList<String> List2 = new ArrayList<String>();
		List2.add("Book1");
		List2.add("Book2");
		List2.add("Book3");
		
		for(String i : List2) {
			System.out.println(i);
		}*/
		
		ArrayList<String> List3 = new ArrayList<String>();
		List3.add("a");
		List3.add("b");
		List3.add("c");
		List3.add("d");
		System.out.println(List3);
		System.out.println("Enter a letter");
		String w = input.next();
		System.out.println(w);
		List3.remove(w);
		
		//for(String i : List3) {
		//	if(i == w) {
		//		List3.remove(i);
		//	}
		//}
		 
		System.out.println(List3);
		
		
		
		/////////////////////
		
		
		
		
	}
}




/*HashMap Map = new HashMap();
Map.put(1 , " War and Peace");
Map.put(2 , " The Great Gatsby");
System.out.println(Map);

String valueToBeRemoved = input.nextLine();
System.out.println(Map);
System.out.println(valueToBeRemoved);

Iterator<Map.Entry> iterator = Map.entrySet().iterator();
while(iterator.hasNext()) {
	Map.Entry entry = iterator.next();
	if(valueToBeRemoved.equals(entry.getValue())) {
		iterator.remove();
	}
}

System.out.println("Modified hashmap: " + Map);*/