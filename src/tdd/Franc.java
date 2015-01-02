package tdd;

public class Franc extends Money {
	/*
	private int amount;
	*/
	public Franc(int amount) {
		super(amount);
	}
	/*
	public Franc(int amount) {
		super();
		this.amount = amount;
	}*/
	/*
	public int getAmount() {
		return amount;
	}
	*/
	/*
	public boolean equals(Object object) {
		Franc franc= (Franc) object;
		return amount == franc.amount;
		//return true;
	}
	*/
	
	Franc times(int multiplier) {
		return new Franc(getAmount() * multiplier);
	}
	/*
	void times(int multiplier) {
		amount*=multiplier;
	}*/
}
