package tdd;

public class Money implements Expression{
	private int amount;
	private String currency;
	
	public Money(int amount, String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	/*
	public Money(int amount) {
		super();
		this.amount = amount;
	}
	*/

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}
	
	public Money times(int multiplier)
	{
		return new Money(getAmount()*multiplier,this.getCurrency());
	}
	public static Money getDollar(int amount) {
		return new Money(amount,"USD");
	}
	public static Money getFranc(int amount) {
		return new Money(amount,"CHF");
	}
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && this.getCurrency().equals(money.getCurrency());
	}
	/*
	public boolean equals(Object object) {
		Money dollar= (Money) object;
		return amount == dollar.getAmount();
	}
	*/
	public Expression plus(Money addend) {
		return new Sum(this, addend);
		/*
		return new Money(amount + addend.amount, currency);
		*/
	}
}
