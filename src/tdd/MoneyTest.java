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
	@Test
	public void testReduceSum() {
		Expression sum= new Sum(Money.getDollar(3), Money.getDollar(4));
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result= sum.reduce(bank, "USD");
		assertEquals(Money.getDollar(7), result);
	}
	
	@Test
	public void testSimpleAddition() {
		
		Money five = Money.getDollar(5);
		Expression sum= five.plus(five);
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money reduced= sum.reduce(bank, "USD");
		assertEquals(Money.getDollar(10), reduced);
		
		/*
		Money sum= Money.getDollar(5).plus(Money.getDollar(5));
		assertEquals(Money.getDollar(10), sum);
		*/
	}
	@Test
	public void testPlusReturnsSum() {
		Money five= Money.getDollar(5);
		Expression result= five.plus(five);
		Sum sum= (Sum) result;
		assertEquals(five, sum.getAugend());
		assertEquals(five, sum.getAddend());
	}
	@Test
	public void testReduceMoney() {
		Bank bank= new Bank();
		Money result= Money.getDollar(1).reduce(bank, "USD");
		assertEquals(Money.getDollar(1), result);
	}
	@Test
	public void testReduceMoneyDifferentCurrency() {
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result= Money.getFranc(2).reduce(bank, "USD");
		assertEquals(Money.getDollar(1), result);
	}
	public void testMixedAddition() {
		
		Expression fiveBucks= Money.getDollar(5);
		Expression tenFrancs= Money.getFranc(10);
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result= bank.reduce(fiveBucks.plus(tenFrancs), "USD");
		assertEquals(Money.getDollar(10), result);
		
		/*
		Money fiveBucks= Money.getDollar(5);
		Money tenFrancs= Money.getFranc(10);
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result= bank.reduce(fiveBucks.plus(tenFrancs), "USD");
		assertEquals(Money.getDollar(10), result);
		*/
		/*
		Expression fiveBucks= Money.getDollar(5);
		Expression tenFrancs= Money.getFranc(10);
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result= bank.reduce(fiveBucks.plus(tenFrancs), "USD");
		assertEquals(Money.getDollar(10), result);
		*/
	}
	
	public void testIdentityRate() {
		assertEquals(1, new Bank().rate("USD", "USD"));
	}
}
