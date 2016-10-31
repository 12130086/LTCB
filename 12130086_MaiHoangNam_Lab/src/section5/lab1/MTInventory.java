package section5.lab1;

public class MTInventory implements Inventory {
	@Override
	public String toString() {
		return "";
	}

	@Override
	public boolean contains(String toyName) {
		return false;
	}

	@Override
	public boolean isBellow(double threshold) {
		return true;
	}

	@Override
	public int howMany() {
		return 0;
	}

	@Override
	public Inventory raisePrice(double rate) {
		return new MTInventory();
	}

	@Override
	public void raisePriceMutable(double rate) {

	}
}
