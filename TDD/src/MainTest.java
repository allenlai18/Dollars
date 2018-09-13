import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
	    String str = "Junit is working fine";
	    assertEquals("Junit is working fine",str);
	}

	
	// p. 5 - compile errors solved but test still fails

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
	
	
	
}
