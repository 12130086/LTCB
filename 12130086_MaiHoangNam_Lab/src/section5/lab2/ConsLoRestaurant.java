package section5.lab2;

public class ConsLoRestaurant extends ILoRestaurant {
	private Restaurant first;
	private ILoRestaurant rest;

	public ConsLoRestaurant(Restaurant first, ILoRestaurant rest) {
		this.first = first;
		this.rest = rest;
	}

	public Restaurant getFirst() {
		return first;
	}

	public void setFirst(Restaurant first) {
		this.first = first;
	}

	public ILoRestaurant getRest() {
		return rest;
	}

	public void setRest(ILoRestaurant rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return this.first.toString() + " \n" + this.rest.toString();
	}
}
