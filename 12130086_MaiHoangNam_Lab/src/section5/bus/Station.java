package section5.bus;

public class Station {
	private String name;
	private Location location;

	public Station(String name, Location location) {
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "(name: " + this.name + ", location: " + this.location + ")";
	}
}
