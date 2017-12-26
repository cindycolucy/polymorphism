package fizzbuzz;

public class FizzBuzz {

	int countUpTo;

	public FizzBuzz(int countUpTo) {
		this.countUpTo = countUpTo;
	}

	public void count() {
		for (int count = 1; count <= countUpTo; count++) {

			String say = "" + count;

			if (isFizz(count) && isBuzz(count)) {
				say = "FizzBuzz";
			}

			else if (isFizz(count)) {
				say = "Fizz";// redefine as Fizz
			}

			else if (isBuzz(count)) {
				say = "Buzz";// redefine as Buzz
			}

			System.out.println(say);
		}
	}

	public boolean isFizz(int number) {
		return number % 3 == 0;
	}

	public boolean isBuzz(int number) {
		return number % 5 == 0;
	}
}
