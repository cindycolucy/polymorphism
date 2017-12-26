import java.util.Scanner;

public class GreaterOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first number.");

		int firstNumber = input.nextInt();

		System.out.println("Enter your second number.");

		int secondNumber = input.nextInt();

		System.out.println("Enter your third number.");

		int thirdNumber = input.nextInt();

		if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			System.out.println("The largest number is " + firstNumber);
		}

		else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
			System.out.println("The largest number is " + secondNumber);
		}

		else
			System.out.println("The largest number is " + thirdNumber);
	}

}
