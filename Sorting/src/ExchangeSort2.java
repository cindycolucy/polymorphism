
public class ExchangeSort2 {

	public static void main(String[] args) {

		int[] numbers = { 7, 21, 236, 5, 78 };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}

}
