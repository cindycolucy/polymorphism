package fizzbuzz;

public class FizzBuzz {

	int count = 0;
	
	public String say() {
		return say (1);
	}
	
	public String say (int times){
		count += times;
		
			
		if (isFizz() && isBuzz()){
			return "FizzBuzz";
		}
		if (isFizz()){
			return "Fizz";
		} 
		if (isBuzz()){
			return "Buzz";
		} 
		
		
		return "" + count;
	}

	private boolean isFizz() {
		return count % 3 == 0;
	}
	private boolean isBuzz(){
		return count % 5 == 0;
	}
}
