import java.util.Scanner;

public class NamePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your your first name.");
		String firstName = input.nextLine();
		System.out.println("Enter your your first last name.");
		String lastName = input.nextLine();

		System.out.println(firstName + " " + lastName);

	}

}
