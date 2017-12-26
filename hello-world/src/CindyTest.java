import java.util.Scanner;

public class CindyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		
		if (age >= 16){
			System.out.println("You can drive.");
			
		} else {
			System.out.println("You cannot drive.");
			
		}
		

	}

}
