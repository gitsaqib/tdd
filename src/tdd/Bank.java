package tdd;

public class Bank 
{
	Money reduce(Expression source, String currency)
	{
		return source.reduce(currency);
		/*
		if (source instanceof Money){
			return (Money) source.reduce(currency);
		}
		Sum sum= (Sum) source;
		return sum.reduce(currency);
		*/
		/*
		Sum sum= (Sum) source;
		int amount= sum.getAugend().getAmount() + sum.getAddend().getAmount();
		return new Money(amount, currency);
		*/
		/*
		Sum sum= (Sum) source;
		int amount= sum.getAugend().getAmount() + sum.getAddend().getAmount();
		return new Money(amount, currency);
		*/
	}
}
