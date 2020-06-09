package buisness;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void pirateCreateTest() {
		Pirate p1 = new Pirate("Edward Teach");
		assertEquals("Edward Teach",p1.getName());
		
	}

}
