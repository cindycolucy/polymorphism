import java.util.Scanner;

public class ConsonentOrVowelII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your character.");

		String firstChar = input.nextLine();

		switch (firstChar) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("The letter is a vowel.");
			break;
		case "y":
			System.out.println("The letter is a sometimes a vowel.");
			break;
		default:
			System.out.println("The letter is a consonent.");

		}

	}
}
