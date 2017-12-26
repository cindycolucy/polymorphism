import java.util.Scanner;

public class ConsonantOrVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your character.");

		String firstCharacter = input.nextLine();

		if (firstCharacter.equals("a")) {
			System.out.println("The character is a vowel.");

		} else if (firstCharacter.equals("e")) {
			System.out.println("The character is a vowel.");

		} else if (firstCharacter.equals("i")) {
			System.out.println("The character is a vowel.");

		} else if (firstCharacter.equals("o")) {
			System.out.println("The character is a vowel.");

		} else if (firstCharacter.equals("u")) {
			System.out.println("The character is a vowel.");
			
		} else if (firstCharacter.equals("y")) {
			System.out.println("The character is sometimes a vowel.");

		} else {
			System.out.println("The character is a consonent.");

		}

	}

}
