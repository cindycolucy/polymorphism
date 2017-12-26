package fizzbuzz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMethodsExample {
	

		public static void main(String[] args) {
			List<String> myStuff = new ArrayList<>();
			myStuff.add("foo");
			myStuff.add("bar");
			
			//Implementing Iterable that makes this work
			System.out.println("Using enhanced for:");
			for (String str : myStuff) {
				System.out.println(str);
			}
			
			System.out.println("Explicitly using Iterator:");
			Iterator<String> itr = myStuff.iterator();
			while(itr.hasNext()) {
				String str = itr.next();
				System.out.println(str);
			}
		}
	}

