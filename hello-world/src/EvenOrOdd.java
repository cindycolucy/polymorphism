import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first number.");

		int firstNumber = input.nextInt();

		if (firstNumber % 2 == 1) {
			System.out.println("The number is odd.");
		}

		else if (firstNumber % 2 == 0) {
			System.out.println("The number is even.");

		}

	}
}
