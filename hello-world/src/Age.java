import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your age.");
		
		int age = input.nextInt();
		
		switch (age){
		
		case 16:
			System.out.println ("You can drive.");
			break;
			
		case 21:
			System.out.println ("You can drink.");
			break;
			
		case 62:
			System.out.println ("You can retire.");
			break;
			
			default:
				System.out.println ("You can have a birthday.");
				
		}

	}

}
