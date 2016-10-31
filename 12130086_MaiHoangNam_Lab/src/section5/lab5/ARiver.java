package section5.lab5;

public abstract class ARiver {
	protected Location location;
	protected double length;

	protected ARiver(Location location, double length) {
		this.location = location;
		this.length = length;
	}
}
