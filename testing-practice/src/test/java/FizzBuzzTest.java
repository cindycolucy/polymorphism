import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz underTest;
	
	@Before
	public void setup() {
		
	underTest = new FizzBuzz();
}
	
	@Test
	public void shouldSay1() {
	
			String response = underTest.say(1);
				
			Assert.assertEquals("should have responded '1'", "1", response);
			}
	@Test
	public void shouldSay2() {
	
			String response = underTest.say(2);
				
			Assert.assertEquals("should have responded '2'", "2", response);
			}
			
			
}
