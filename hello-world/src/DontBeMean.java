import java.util.Scanner;

public class DontBeMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first number.");

		double firstNumber = input.nextDouble();

		System.out.println("Enter your second number.");

		double secondNumber = input.nextDouble();

		System.out.println("Enter your third number.");

		double thirdNumber = input.nextDouble();

		System.out.println("Enter your fourth number.");

		double fourthNumber = input.nextDouble();

		double mean = ((firstNumber + secondNumber + thirdNumber + fourthNumber) / 4);

		System.out.println("The mean is " + mean + ".");

	}

}
