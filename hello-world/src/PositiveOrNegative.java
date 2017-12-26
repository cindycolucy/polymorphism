import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your number.");

		double firstNumber = input.nextDouble();

		if (firstNumber >= 0) {
			System.out.println("The number is positive.");
		}

		else if (firstNumber <= 0) {
			System.out.println("The number is negative.");

		}

	}
}
