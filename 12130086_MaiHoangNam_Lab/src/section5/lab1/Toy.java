package section5.lab1;

public class Toy {
	private String name;
	private double price;
	private int available;

	public Toy(String name, double price, int available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "name: " + this.name + ", price: " + this.price + ", available: " + this.available;
	}

	public boolean sameName(String toyName) {
		return this.name.equals(toyName);
	}

	public boolean isPriceBelow(double threshold) {
		return this.price < threshold;
	}

	public Toy copyWithRaisePrice(double rate) {
		return new Toy(this.name, this.price * (1 + rate), this.available);
	}

	public void setNewPrice(double rate) {
		this.price = this.price * (1 + rate);
	}
}
