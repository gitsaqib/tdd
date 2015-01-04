package tdd;

public class Sum implements Expression {
	private Expression augend;
	private Expression addend;
	public Sum(Expression augend, Expression addend) {
		super();
		this.augend = augend;
		this.addend = addend;
	}
	public Expression getAugend() {
		return augend;
	}
	public void setAugend(Expression augend) {
		this.augend = augend;
	}
	public Expression getAddend() {
		return addend;
	}
	public void setAddend(Expression addend) {
		this.addend = addend;
	}
	/*
	public Money reduce(String currency)
	{
		int amount= augend.getAmount() + addend.getAmount();
		return new Money(amount, currency);
	}
	*/
	@Override
	public Money reduce(Bank bank, String to) {
		int amount= augend.reduce(bank, to).getAmount()
				+ addend.reduce(bank, to).getAmount();
				return new Money(amount, to);
				
		/*
		int amount= augend.getAmount() + addend.getAmount();
		return new Money(amount, to);
		*/
	}
	@Override
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}
}