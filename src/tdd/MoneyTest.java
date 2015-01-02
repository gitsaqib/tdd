package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() 
	{
		Money five = Money.getDollar(5);
		assertEquals(Money.getDollar(10), five.times(2));
		assertEquals(Money.getDollar(15), five.times(3));
	}
	
	@Test
	public void testEqualsObject() {
		assertFalse(Money.getDollar(5).equals(Money.getDollar(6)));
		assertTrue(Money.getDollar(5).equals(Money.getDollar(5)));
		assertFalse(Money.getFranc(6).equals(Money.getDollar(6)));
		
		/*
		assertTrue(Money.getDollar(5).equals(Money.getDollar(5)));
		assertFalse(Money.getDollar(5).equals(Money.getDollar(6)));
		assertTrue(new Franc(5,"CHF").equals(new Franc(5,"CHF")));
		assertFalse(new Franc(5,"CHF").equals(new Franc(6,"CHF")));
		assertFalse(new Franc(5,"CHF").equals(Money.getDollar(5)));
		assertTrue(new Dollar(5,"USD").equals(Money.getDollar(5)));
		assertTrue(new Franc(5,"CHF").equals(Money.getFranc(5)));
		*/
		/*
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(new Dollar(5)));
		*/
		/*
		//fail("Not yet implemented");
		*/
	}

}
