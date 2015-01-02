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
	void times(int multiplier) {
		amount*=multiplier;
	}
}
