import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first number.");

		int firstNumber = input.nextInt();

		System.out.println("Enter your second number.");

		int secondNumber = input.nextInt();

		if (firstNumber == secondNumber) {
			System.out.println("The numbers are equal.");
		}

		else if (firstNumber != secondNumber) {
			System.out.println("The numbers are not equal.");

		}
	}
}
