import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter street address:");

		String houseNumber = input.next();
		String road = input.nextLine();
		
		System.out.println("house number is " + houseNumber);
		System.out.println("street is " + road);
		
		
		
		

	}

}
