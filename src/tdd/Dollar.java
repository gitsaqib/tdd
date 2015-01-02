package tdd;

public class Dollar extends Money{
	//private int amount;

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}
	/*
	public Dollar(int amount) {
		super();
		this.amount = amount;
	}
	*/
	/*
	public int getAmount() {
		return amount;
	}
	*/
	/*
	public boolean equals(Object object) {
		Dollar dollar= (Dollar) object;
		return amount == dollar.amount;
		//return true;
	}
	*/

	Money times(int multiplier) {
		return Money.getDollar(getAmount() * multiplier);
	}
	
	/*
	void times(int multiplier) {
		amount*=multiplier;
	}*/
}
