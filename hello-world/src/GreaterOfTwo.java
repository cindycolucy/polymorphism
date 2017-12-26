import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first number.");

		int firstNumber = input.nextInt();

		System.out.println("Enter your second number.");

		int secondNumber = input.nextInt();

		if (firstNumber > secondNumber) {
			System.out.println(firstNumber);
		}

		else {
			System.out.println(secondNumber);

		}

	}
}
