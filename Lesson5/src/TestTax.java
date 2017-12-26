
public class TestTax {

	public static void main(String[] args) {
		double grossIncome = Double.parseDouble(args[0]);
		String state = args[1];
		int dependents = Integer.parseInt(args[2]);
		
		if(args.length != 3) {
			System.out.println("Sample usage of the program:" + " java TestTax 50000 NJ 2");
			System.exit(0);
		}

		Tax t = new Tax();

		double yourTax = t.calcTax();
		
//		t.convertToEuros(yourTax);

		System.out.println("Your tax is " + yourTax);

	}

}
