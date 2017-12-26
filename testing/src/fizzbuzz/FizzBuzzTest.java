package fizzbuzz;

import org.junit.Test;

import org.junit.Assert;

public class FizzBuzzTest {

	@Test
	public void shouldReturnOne() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say();
		// assert
		Assert.assertEquals("should have responded '1'", "1", response);

	}

	@Test
	public void shouldReturnTwo() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(2);
		// assert (without message)
		Assert.assertEquals("2", response);
	}

	@Test
	public void shouldReturnFizzInsteadOf3() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(3);// 3
		// assert (without message)
		Assert.assertEquals("Fizz", response);

	}

	@Test
	public void shouldReturnBuzzInsteadOf5() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(5);
		// assert (without message)
		Assert.assertEquals("Buzz", response);

	}

	@Test
	public void shouldReturnFizzInsteadOf6() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(6);
		// assert (without message)
		Assert.assertEquals("Fizz", response);

	}

	@Test
	public void shouldReturnBuzzInsteadOf10() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(10);
		// assert (without message)
		Assert.assertEquals("Buzz", response);
	}

	@Test
	public void shouldReturnFizzBuzzInsteadOf15() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(15);
		// assert (without message)
		Assert.assertEquals("FizzBuzz", response);
	}
	@Test
	public void shouldReturnFizzBuzzInsteadOf30() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(30);
		// assert (without message)
		Assert.assertEquals("FizzBuzz", response);
	}
}
