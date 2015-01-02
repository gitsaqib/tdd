package tdd;

public abstract class Money {
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

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}
	abstract Money times(int multiplier);
	
	public static Dollar getDollar(int amount) {
		return new Dollar(amount,"USD");
	}
	public static Franc getFranc(int amount) {
		return new Franc(amount,"CHF");
	}
	/*
	public boolean equals(Object object) {
		Money dollar= (Money) object;
		return amount == dollar.getAmount();
	}
	*/
}
