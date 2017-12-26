import java.util.Scanner;

public class Riddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What has a foot but no legs?");
		String answer = input.nextLine();

		if (answer.equalsIgnoreCase("snail")){
		System.out.println("Right!");
		} else {
		System.out.println("Wrong!");
		}
	}

}
