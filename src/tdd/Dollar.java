package tdd;

public class Dollar {
	private int amount;

	public Dollar(int amount) {
		super();
		this.amount = amount;
	}
	public int getAmount() {
		return amount;
	}
	public boolean equals(Object object) {
		Dollar dollar= (Dollar) object;
		return amount == dollar.amount;
		//return true;
	}
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	/*
	void times(int multiplier) {
		amount*=multiplier;
	}*/
}
