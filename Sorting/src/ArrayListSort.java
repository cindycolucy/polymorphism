
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList();
		numbers.add(4);
		numbers.add(345);
		numbers.add(234);
		numbers.add(93);
		numbers.add(76);
		
		Collections.sort(numbers);
//		Collections.reverse(numbers);
		System.out.println(numbers);

	}

}
