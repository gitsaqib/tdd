package tdd;

public class Sum implements Expression {
	private Money augend;
	private Money addend;
	public Sum(Money augend, Money addend) {
		super();
		this.augend = augend;
		this.addend = addend;
	}
	public Money getAugend() {
		return augend;
	}
	public void setAugend(Money augend) {
		this.augend = augend;
	}
	public Money getAddend() {
		return addend;
	}
	public void setAddend(Money addend) {
		this.addend = addend;
	}
	public Money reduce(String currency)
	{
		int amount= augend.getAmount() + addend.getAmount();
		return new Money(amount, currency);
	}
}