import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort2 {
	public static void main(String[] args) {
		List numbers = new ArrayList();

		numbers.add(234);
		numbers.add(76);
		numbers.add(120);
		numbers.add(2);
		numbers.add(99);
		
		Collections.sort(numbers);
		Collections.reverse(numbers);
		System.out.println(numbers);
		

	}
}
