package tdd;

public class Money {
	private int amount;

	public Money(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean equals(Object object) {
		Money dollar= (Money) object;
		return amount == dollar.getAmount();
	}
}
