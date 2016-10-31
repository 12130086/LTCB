package section5.lab2;

public class Intersection {
	private int avenue;
	private int street;

	public Intersection(int avenue, int street) {
		this.avenue = avenue;
		this.street = street;
	}

	public int getAvenue() {
		return avenue;
	}

	public void setAvenue(int avenue) {
		this.avenue = avenue;
	}

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "avenue: " + this.avenue + ", street: " + this.street;
	}
}
