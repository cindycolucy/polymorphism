package fizzbuzz;

public class FizzBuzzInMain {

	public static void main(String[] args) {

		int countUpTo = 20;

		for (int count = 1; count <= countUpTo; count++) {

			String say = "" + count;

			if (isFizz (count) && isBuzz (count)) {
				say = "FizzBuzz";
			}

			else if (isFizz (count)) {
				say = "Fizz";// redefine as Fizz
			}

			else if (isBuzz (count)) {
				say = "Buzz";// redefine as Buzz
			}

			System.out.println(say);

		}
	}
	
	public static boolean isFizz(int number){
		return number % 3 == 0;
	}
	public static boolean isBuzz(int number){
		return number % 5 == 0;
	}
}
