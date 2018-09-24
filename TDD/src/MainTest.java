import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	
	// p. 9

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
	
	
	
}
