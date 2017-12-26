package exceptions;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			calc.divide();
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Divide by zero?");

		}

		System.out.println("Second block:");
		System.out.flush();
		try {
			calc.divide();
		} finally {//always runs regardless of what happens elsewhere
			System.out.println("Calc complete!");
		}
	}
}
