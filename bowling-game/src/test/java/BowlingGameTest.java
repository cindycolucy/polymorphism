import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {

	@Test
	public void shouldScoreGutterGame() {
		// arrange
		BowlingGame g = new BowlingGame();
		for (int i = 0; i < 20; i++) {
			g.roll(0);
		}
		// act
		int score = g.score();
		// assert
		Assert.assertEquals("Should be zero score", 0, score);
	}
	@Test
	public void shouldScoreAllOnes() {
		// arrange
		BowlingGame g = new BowlingGame();
		for (int i = 0; i < 20; i++) {
			g.roll(1);
		}
		// act
		int score = g.score();
		// assert
		Assert.assertEquals("Should be zero score", 20, score);
	}
}
