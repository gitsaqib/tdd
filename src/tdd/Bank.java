package tdd;

public class Bank 
{
	Money reduce(Expression source, String currency)
	{
		Sum sum= (Sum) source;
		int amount= sum.getAugend().getAmount() + sum.getAddend().getAmount();
		return new Money(amount, currency);
		
		/*
		Sum sum= (Sum) source;
		int amount= sum.getAugend().getAmount() + sum.getAddend().getAmount();
		return new Money(amount, currency);
		*/
	}
}
