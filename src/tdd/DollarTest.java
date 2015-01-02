package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {

	@Test
	public void testEquality() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(10, product.getAmount());
		product= five.times(3);
		assertEquals(15, product.getAmount());
		
		/*
		Dollar five= new Dollar(5);
		five.times(2);
		assertEquals(10, five.getAmount());
		five.times(3);
		assertEquals(15, five.getAmount());
		*/
	}
}
