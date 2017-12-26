import java.util.Scanner;

public class Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a color, please.");
		String response = input.nextLine();

		if(response.toLowerCase().equals("red")) {
		  System.out.println("Roses can be red. Also, lilies.");
		}

	}

}
