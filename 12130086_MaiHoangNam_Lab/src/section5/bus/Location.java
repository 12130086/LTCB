package section5.bus;

public class Location {
	private int number;
	private String roadName;

	public Location(int number, String roadName) {
		this.number = number;
		this.roadName = roadName;
	}

	@Override
	public String toString() {
		return this.number + ", " + this.roadName;
	}
}
