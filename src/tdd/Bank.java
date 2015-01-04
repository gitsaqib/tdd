package tdd;

import java.util.Hashtable;

public class Bank 
{
	private Hashtable<Pair, Integer> rates= new Hashtable<Pair, Integer>();
	
	void addRate(String from, String to, int rate) 
	{
		rates.put(new Pair(from, to), new Integer(rate));
	}
	int rate(String from, String to) 
	{
		if (from.equals(to)) return 1;
		Integer rate= (Integer) rates.get(new Pair(from, to));
		return rate.intValue();
	}
	
	Money reduce(Expression source, String currency)
	{
		
		return source.reduce(this,currency);
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
