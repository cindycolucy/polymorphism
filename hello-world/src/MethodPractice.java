import java.util.Scanner;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your your first name.");
		String firstName = input.nextLine();
		System.out.println("Enter your your last name.");
		String lastName = input.nextLine();

		int first = firstName.length();
		int last = lastName.length();

		if (first > last) {
			System.out.println("First name is longer.");
		}

		if (last > first) {
			System.out.println("Last name is longer.");
		}

		else {
			System.out.println("They are the same length.");

		}
	}

}