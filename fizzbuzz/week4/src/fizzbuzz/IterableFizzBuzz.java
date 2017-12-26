package fizzbuzz;

import java.util.Iterator;

public class IterableFizzBuzz implements Iterable<String> {

	public int countUpTo;

	public IterableFizzBuzz(int countUpTo) {
		this.countUpTo = countUpTo;
	}

	@Override
	public Iterator<String> iterator() {
		return new FizzBuzzIterator();
	}

	// this is a nested class
	class FizzBuzzIterator implements Iterator<String> {

		int count = 1;

		@Override
		public boolean hasNext() {
			return count <= countUpTo;
		}

		@Override
		public String next() {
			String say = "" + count;
			
			if (isFizz(count) && isBuzz(count)) { // could say count % 5
				say = "FizzBuzz";
			} else if (isFizz(count)) { // was count % 3 == 0
				say = "Fizz"; // redefine as "Fizz"
			} else if (isBuzz(count)) { // count % 5 == 0
				say = "Buzz"; // redefine as "Buzz"
			}
			
			count++;
			return say;
		}

		public boolean isFizz(int number) {
			return number % 3 == 0;
		}

		public boolean isBuzz(int number) {
			return number % 5 == 0;
		}
	}

}