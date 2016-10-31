package section5.lab5;

public class Mouth {
	private Location location;
	private ARiver river;

	public Mouth(Location location, ARiver river) {
		this.location = location;
		this.river = river;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public ARiver getRiver() {
		return river;
	}

	public void setRiver(ARiver river) {
		this.river = river;
	}

}
