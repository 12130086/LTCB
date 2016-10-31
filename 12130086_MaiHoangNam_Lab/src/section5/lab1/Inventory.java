package section5.lab1;

public interface Inventory {
	// determines whether or not the name of
	// toy occurs in the Inventory
	public boolean contains(String toyName);

	// determines whether or not all
	// prices of toys in the Inventory
	// bellow a threshold
	public boolean isBellow(double threshold);

	// count the number of items in the Inventory
	public int howMany();

	// raise all prices of toys in the Inventory with rate - immutable
	public Inventory raisePrice(double rate);

	public void raisePriceMutable(double rate);
}
