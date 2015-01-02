package tdd;

public class Franc {
	private int amount;

	public Franc(int amount) {
		super();
		this.amount = amount;
	}
	public int getAmount() {
		return amount;
	}
	public boolean equals(Object object) {
		Franc franc= (Franc) object;
		return amount == franc.amount;
		//return true;
	}
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	/*
	void times(int multiplier) {
		amount*=multiplier;
	}*/
}
