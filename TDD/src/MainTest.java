import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
	    String str = "Junit is working fine";
	      assertEquals("Junit is working fine",str);
	
	
	}

	// p. 4  -- test will fail and have compile errors
	// no Dollar class, no Constructor, no method, no fields
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
	
	
	
}
