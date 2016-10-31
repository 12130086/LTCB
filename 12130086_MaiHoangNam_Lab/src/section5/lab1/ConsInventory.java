package section5.lab1;

public class ConsInventory implements Inventory {
	private Toy first;
	private Inventory rest;

	public ConsInventory(Toy first, Inventory rest) {
		this.first = first;
		this.rest = rest;
	}

	public Toy getFirst() {
		return first;
	}

	public void setFirst(Toy first) {
		this.first = first;
	}

	public Inventory getRest() {
		return rest;
	}

	public void setRest(Inventory rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	@Override
	public boolean contains(String toyName) {
		return this.first.sameName(toyName) || this.rest.contains(toyName);
	}

	@Override
	public boolean isBellow(double threshold) {
		return this.first.isPriceBelow(threshold) && this.rest.isBellow(threshold);
	}

	@Override
	public int howMany() {
		return 1 + this.rest.howMany();
	}

	@Override
	public Inventory raisePrice(double rate) {
		Toy aToy = this.first.copyWithRaisePrice(rate);
		return new ConsInventory(aToy, this.rest.raisePrice(rate));
	}

	@Override
	public void raisePriceMutable(double rate) {
		this.first.setNewPrice(rate);
		this.rest.raisePriceMutable(rate);
	}
}
